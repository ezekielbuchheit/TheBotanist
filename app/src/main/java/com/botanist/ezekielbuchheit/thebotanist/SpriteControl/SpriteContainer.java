package com.botanist.ezekielbuchheit.thebotanist.SpriteControl;

import android.graphics.Bitmap;
import android.media.Image;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class SpriteContainer {
    private static SpriteContainer single = new SpriteContainer();

    /**
     * Get the single instance of this class
     *
     * @return The single instance of this class
     */
    public static SpriteContainer get() {
        return single;
    }


    private HashMap spriteTable = new HashMap();

    public Sprite getSprite(String ref) {
        // if we've already got the sprite in the cache
        // then just return the existing version
        if (spriteTable.get(ref) != null) {
            return (Sprite) spriteTable.get(ref);
        }

//        // otherwise, go away and grab the sprite from the resource
//        // loader
//        Bitmap sourceImage = null;
//
//        try {
//
//
//            sourceImage = ImageIO.read(new File(ref));
//        } catch (IOException e) {
//        }
//
//        // create an accelerated image of the right size to store our sprite in
//        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
//        Image image = gc.createCompatibleImage(sourceImage.getWidth(),sourceImage.getHeight(),Transparency.BITMASK);
//
//        // draw our source image into the accelerated image
//        image.getGraphics().drawImage(sourceImage,0,0,null);
//        BufferedImage tImage = (BufferedImage) image;
//        tImage = new BufferedImage(tImage.getWidth(), tImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
//        Graphics2D gt = tImage.createGraphics();
//        //System.out.println("Starting drawTImage");
//        gt.setComposite(AlphaComposite.Src);
//        gt.drawImage((BufferedImage) image, null, 0, 0);
//        gt.dispose();
//        for(int i = 0; i < tImage.getHeight(); i++) {
//            for(int j = 0; j < tImage.getWidth(); j++) {
//                //System.out.println("Want 0xFF69B4. Got " + tImage.getRGB(j, i));
//                if(tImage.getRGB(j, i) == -38476)
//                {
//                    //System.out.println("Creating transparent pixel");
//                    tImage.setRGB(j, i, 0x8F1C1C);
//                }
//            }
//        }
//
//
//        // create a sprite, add it the cache then return it
//        Sprite sprite = new Sprite(tImage);
//        spriteTable.put(ref,sprite);

        return null;
    }
}
