package com.botanist.ezekielbuchheit.thebotanist.Characters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.botanist.ezekielbuchheit.thebotanist.R;
import com.botanist.ezekielbuchheit.thebotanist.SpriteControl.Sprite;

public class Player implements Sprite {
    private Bitmap spriteSheet;

    private int step = 0;

    public Player(Context context) {
        spriteSheet = BitmapFactory.decodeResource(context.getResources(), R.drawable.dean_sprite);
    }

    @Override
    public Bitmap draw() {
        return animate();
    }

    @Override
    public void setAnimateState(String state) {

    }

    @Override
    public void setColloidable(boolean isColloidable) {

    }

    private Bitmap animate() {
        step = step == 7 ? 0: step;
        step++;
        return Bitmap.createBitmap(spriteSheet, step * X_OFFSET, 0 ,X_OFFSET,Y_OFFSET);
    }
}
