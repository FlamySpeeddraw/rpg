package com.flamingamaranth.character;

public class Player {
    private String name;
    private int PV, PM, force, intelligence, defense, resistanceMagique, agilite, chance, endurance, esprit;

    public Player(String name, int PV, int PM, int force, int intelligence, int defense, int resistanceMagique, int agilite, int chance, int endurance, int esprit) {
        this.name = name;
        this.PV = PV;
        this.PM = PM;
        this.force = force;
        this.intelligence = intelligence;
        this.defense = defense;
        this.resistanceMagique = resistanceMagique;
        this.agilite = agilite;
        this.chance = chance;
        this.endurance = endurance;
        this.esprit = esprit;
    }

    public String getName() {
        return this.name;
    }

    public int getPV() {
        return this.PV;
    }
}
