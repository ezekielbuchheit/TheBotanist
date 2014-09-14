package com.botanist.ezekielbuchheit.thebotanist.Engine;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.botanist.ezekielbuchheit.thebotanist.Render.RenderManager;

public class MainGameEngine {

    private static MainGameEngine world;
    private static RenderManager renderManager;
    private SurfaceView gameSurface;

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
        return gameSurface;
    }

    public void setLevel() {}
    public void setCharacter() {

    }

    public void startWorld() {

    }
}
