package com.flamingamaranth.character;

public class Player {
    private Name name;
    private Stats stats;
    private Inventory inventory;
    private int XCoordinate;
    private int YCoordinate;

    public Player(Name name, Stats stats, Inventory inventory) {
        this.name = name;
        this.stats = stats;
        this.inventory = inventory;
    }

    public Name getName() {
        return this.name;
    }

    public Stats getStats() {
        return this.stats;
    }

    public Inventory gInventory() {
        return this.inventory;
    }

    @Override
    public String toString() {
        return this.name.getName() + " " + this.stats.toString() + " " + this.inventory.toString();
    }
}
