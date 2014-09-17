package com.botanist.ezekielbuchheit.thebotanist.Characters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.botanist.ezekielbuchheit.thebotanist.R;
import com.botanist.ezekielbuchheit.thebotanist.SpriteControl.Sprite;

public class Player implements Entity {
    private Bitmap spriteSheet;

    private int step = 0;

    public Player(Context context) {
        spriteSheet = BitmapFactory.decodeResource(context.getResources(), R.drawable.dean_sprite);
    }

    @Override
    public Bitmap draw() {
        return Bitmap.createBitmap(spriteSheet, step * X_OFFSET, 0, X_OFFSET, Y_OFFSET);
    }

    @Override
    public void setAnimateState(String state) {

    }

    @Override
    public void setColloidable(boolean isColloidable) {

    }

    @Override
    public int type() {
        return 0;
    }

    public void animate() {
        step = step == 7 ? 0: step;
        step++;
    }

    @Override
    public void draw(Canvas canvas) {
    }

    @Override
    public void draw(Canvas canvas, int x, int y) {
        canvas.drawBitmap(Bitmap.createBitmap(spriteSheet, step * X_OFFSET, 0, X_OFFSET, Y_OFFSET), x, y, null);
    }

    @Override
    public void draw(Canvas canvas, float x, float y) {

    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public int getXSpeed() {
        return 0;
    }

    @Override
    public int getYSpeed() {
        return 0;
    }

    @Override
    public void setX(int x) {

    }

    @Override
    public void setY(int y) {

    }

    public void updateAnimationStep() {
        step = step == 7 ? 0: step;
        step++;
    }
}
