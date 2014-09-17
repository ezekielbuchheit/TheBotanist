package com.botanist.ezekielbuchheit.thebotanist;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;

import com.botanist.ezekielbuchheit.thebotanist.Engine.MainGameEngine;


public class Start extends Activity {

    private MainGameEngine mainGameEngine;
    private SurfaceView surfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainGameEngine = MainGameEngine.getWorld();

        surfaceView = mainGameEngine.getGameScreen(this);

        setContentView(surfaceView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mainGameEngine.startWorld();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mainGameEngine.pauseWorld();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainGameEngine.destroyWorld();
    }
}
