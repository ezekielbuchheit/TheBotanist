package com.botanist.ezekielbuchheit.thebotanist;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.botanist.ezekielbuchheit.thebotanist.Characters.Player;
import com.botanist.ezekielbuchheit.thebotanist.Engine.MainGameEngine;
import com.botanist.ezekielbuchheit.thebotanist.SpriteControl.Sprite;


public class Start extends Activity {


    private MainGameEngine mainGameEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainGameEngine = MainGameEngine.getWorld();

        setContentView(mainGameEngine.getGameScreen(this));
    }


}
