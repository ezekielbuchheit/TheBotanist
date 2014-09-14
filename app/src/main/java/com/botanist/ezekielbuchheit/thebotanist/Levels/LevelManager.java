package com.botanist.ezekielbuchheit.thebotanist.Levels;

public class LevelManager {
    private static LevelManager levelManager;

    private LevelManager(){}

    public LevelManager getLevelManager() {
        if (levelManager == null) {
            levelManager = new LevelManager();
        }
        return levelManager;
    }
}
