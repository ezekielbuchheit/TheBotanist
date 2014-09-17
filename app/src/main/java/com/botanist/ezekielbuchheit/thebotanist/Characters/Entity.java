package com.botanist.ezekielbuchheit.thebotanist.Characters;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public interface Entity {

    public static final int NOTHING_THERE = 0,
            SOLID = 1,
            PLATFORM = 2,
            BACKGROUND = 3,
            EDIBLE = 4,
            CHARACTER = 5,
            PROJECTILE = 6;
    public static final int
            NOTHING=0,
            ZOMBIE=1,
            QUESO=2,
            PLATFORMS=3,
            CHICKEN=4,
            BEANS = 5,
            MEAT = 6,
            WORKER = 7,
            GIRDER = 8,
            FLYING_CHICANNON = 9;
    public static final String
            nothing="NOTHING",
            zombie="zombie",
            queso="queso",
            platforms="platforms",
            chicken="chicken",
            beans = "beans",
            meat = "meat",
            worker = "worker",
            girder = "girder",
            flying_chicannon = "flying_chicannon";


    public int type();
    public void animate();
    public void draw(Canvas canvas);
    public void draw(Canvas canvas, int x, int y);
    public void draw(Canvas canvas, float x, float y);
    public int getX();
    public int getY();
    public int getXSpeed();
    public int getYSpeed();
    public void setX(int x);
    public void setY(int y);

    //Sprite states for animations
    public static final String STATIC = "animation_state_static";
    public static final String FALLING = "animation_state_falling";
    public static final String JUMPING = "animation_state_jumping";

    public static final int X_OFFSET = 64;
    public static final int Y_OFFSET = 64;

    public Bitmap draw();
    public void setAnimateState(String state);
    public void setColloidable(boolean isColloidable);
    public void updateAnimationStep();
}
