package com.botanist.ezekielbuchheit.thebotanist.SpriteControl;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Sprite {

    private Bitmap image;

    public Sprite(Bitmap image)
    {
        this.image = image;
    }

    public Bitmap getImage(){return image;}

    public void draw(Canvas canvas, int x, int y) {
        canvas.drawBitmap(image, x, y, null);
    }
}
