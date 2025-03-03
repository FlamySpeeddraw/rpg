package com.flamingamaranth.character;

public class Stats {
    private int PV, PM, force, intelligence, defense, resistanceMagique, agilite, chance, endurance, esprit;

    public Stats(int PV, int PM, int force, int intelligence, int defense, int resistanceMagique, int agilite, int chance, int endurance, int esprit) {
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
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getPM() {
        return PM;
    }

    public void setPM(int PM) {
        this.PM = PM;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getResistanceMagique() {
        return resistanceMagique;
    }

    public void setResistanceMagique(int resistanceMagique) {
        this.resistanceMagique = resistanceMagique;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getEsprit() {
        return esprit;
    }

    public void setEsprit(int esprit) {
        this.esprit = esprit;
    }
}
