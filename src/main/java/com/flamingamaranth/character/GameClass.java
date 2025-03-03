package com.flamingamaranth.character;

public enum GameClass {
    GUERRIER(new Stats(150,50,15,5,12,6,8,5,10,4)),
    MAGE(new Stats(90,150,4,15,5,12,7,6,5,10)),
    VOLEUR(new Stats(110,70,10,7,8,7,15,12,7,6));

    private final Stats stats;

    private GameClass(Stats stats) {
        this.stats = stats;
    }

    public Stats getStats() {
        return this.stats;
    }
}
