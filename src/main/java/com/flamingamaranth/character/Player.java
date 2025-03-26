package com.flamingamaranth.character;

public class Player extends BaseCharacter {
    private Inventory inventory;

    public Player(Name name, Stats stats, Inventory inventory, int XCoordinate, int YCoordinate) {
        super(name, stats, XCoordinate, YCoordinate);
        this.inventory = inventory;
    }

    public Inventory gInventory() { return this.inventory; }
}
