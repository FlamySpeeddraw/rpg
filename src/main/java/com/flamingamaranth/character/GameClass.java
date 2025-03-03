package com.flamingamaranth.character;

public enum GameClass {
    GUERRIER(150,50,15,5,12,6,8,5,10,4),
    MAGE(90,150,4,15,5,12,7,6,5,10),
    VOLEUR(110,70,10,7,8,7,15,12,7,6);

    private final int PV, PM, force, intelligence, defense, resistanceMagique, agilite, chance, endurance, esprit;

    private GameClass(int PV, int PM, int force, int intelligence, int defense, int resistanceMagique, int agilite, int chance, int endurance, int esprit) {
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

    public int getPV() {
        return this.PV;
    }

    public int getPM() {
        return this.PM;
    }

    public int getForce() {
        return this.force;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getResistanceMagique() {
        return this.resistanceMagique;
    }

    public int getAgilite() {
        return this.agilite;
    }

    public int getChance() {
        return this.chance;
    }

    public int getEndurance() {
        return this.endurance;
    }

    public int getEsprit() {
        return this.esprit;
    }
}
