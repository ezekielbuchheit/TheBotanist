package com.botanist.ezekielbuchheit.thebotanist.SpriteControl;

import android.graphics.Bitmap;

public interface Sprite {

    //Sprite states for animations
    public static final String STATIC = "animation_state_static";
    public static final String FALLING = "animation_state_falling";
    public static final String JUMPING = "animation_state_jumping";

    public static final int X_OFFSET = 64;
    public static final int Y_OFFSET = 64;

    public Bitmap draw();
    public void setAnimateState(String state);
    public void setColloidable(boolean isColloidable);
}
