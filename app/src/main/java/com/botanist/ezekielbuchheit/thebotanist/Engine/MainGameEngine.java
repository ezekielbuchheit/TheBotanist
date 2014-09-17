package com.botanist.ezekielbuchheit.thebotanist.Engine;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import com.botanist.ezekielbuchheit.thebotanist.Characters.Entity;
import com.botanist.ezekielbuchheit.thebotanist.Characters.Player;
import com.botanist.ezekielbuchheit.thebotanist.Render.RenderManager;
import com.botanist.ezekielbuchheit.thebotanist.SpriteControl.Sprite;

public class MainGameEngine implements View.OnTouchListener{

    private static MainGameEngine world;
    private static RenderManager renderManager;
    private SurfaceView gameSurface;
    private Entity mainCharacter;

    private MainGameEngine() {}

    public static MainGameEngine getWorld() {
        if (world == null) {
            world = new MainGameEngine();
        }
        if (renderManager == null) {
            renderManager = RenderManager.getRenderManager();
        }
        return world;
    }

    public SurfaceView getGameScreen(Context context) {
        if (gameSurface == null) {
            gameSurface = renderManager.getNewSurfaceView(context);
        }
        mainCharacter = (Entity) new Player(context);
        gameSurface.setOnTouchListener(this);
        renderManager.setCharacter(mainCharacter);

        return gameSurface;
    }

    public void setLevel() {}
    public void setCharacter() {}

    public void startWorld() {
        renderManager.startAnimatingGameWorld();
    }

    public void pauseWorld() {
        renderManager.pauseGameWorld();
    }

    public void destroyWorld() {
        renderManager.destroyGameWorld();
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            mainCharacter.updateAnimationStep();
        }
        return false;
    }
}
