package com.flamingamaranth.character;

public class Player {
    private String name;
    private Stats stats;

    public Player(String name, Stats stats) {
        this.name = name;
        this.stats = stats;
    }

    public String getName() {
        return this.name;
    }

    public Stats getStats() {
        return this.stats;
    }
}
