package com.botanist.ezekielbuchheit.thebotanist.Render;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;

import com.botanist.ezekielbuchheit.thebotanist.Characters.Player;
import com.botanist.ezekielbuchheit.thebotanist.SpriteControl.Sprite;

public class RenderManager extends Thread {
    private static RenderManager renderManager = new RenderManager();
    private Context contex;
    private Bitmap characterSprite;

    public static RenderManager getRenderManager() {
        return renderManager;
    }

    public MainScreen getNewSurfaceView(Context c) {
        return new MainScreen(c);
    }

    public static void renderBackground() {

    }

    public static void renderMainWorld() {

    }

    public class MainScreen extends SurfaceView implements SurfaceHolder.Callback {
        private SurfaceHolder sh;
        Context context;
        CanvasCreator thread;

        public MainScreen(Context context) {
            super(context);
            sh = getHolder();
            sh.addCallback(this);
            setFocusable(true);
            this.context = context;
        }

        public void surfaceCreated(SurfaceHolder holder) {
            thread = new CanvasCreator(sh, context);
            thread.setRunning(true);
            thread.start();
        }

        public void surfaceChanged(SurfaceHolder holder, int format, int width,
                                   int height) {
        }

        public void surfaceDestroyed(SurfaceHolder holder) {
            boolean retry = true;
            thread.setRunning(false);
            while (retry) {
                try {
                    thread.join();
                    retry = false;
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public class CanvasCreator extends Thread {

        private SurfaceHolder sh;
        private Context context;
        private boolean run = false;
        private Sprite mainCharacter;

        public CanvasCreator(SurfaceHolder surfaceHolder, Context context) {
            sh = surfaceHolder;
            this.context = context;
            this.mainCharacter =  (Sprite) new Player(context);
        }

        public void setRunning(boolean running) {
            run = running;
        }

        public void run() {
            while (run) {
                Canvas c = null;
                try {
                    c = sh.lockCanvas(null);
                    synchronized (sh) {
                        draw(c);
                        try {
                            sh.wait(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    if (c != null) {
                        sh.unlockCanvasAndPost(c);
                    }
                }
            }
        }

        private void draw(Canvas c) {
            WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            Display display = windowManager.getDefaultDisplay();
            Point size = new Point();
            display.getSize(size);
            int width = size.x;
            int height = size.y;

            characterSprite = mainCharacter.draw();

            c.drawBitmap(characterSprite, width/2, height/2, null);
        }
    }
}
