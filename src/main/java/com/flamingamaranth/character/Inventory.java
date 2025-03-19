package com.flamingamaranth.character;

import java.util.HashMap;

import com.flamingamaranth.game.Item;

public class Inventory {
    private HashMap<Integer,Item> emplacement;

    public Inventory() {
        this.emplacement = new HashMap<Integer,Item>();
    }
}
