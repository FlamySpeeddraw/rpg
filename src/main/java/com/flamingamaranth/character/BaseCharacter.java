package com.flamingamaranth.character;

public abstract class BaseCharacter {
    protected final Name name;
    protected Stats stats;
    protected int XCoordinate;
    protected int YCoordinate;

    public BaseCharacter(Name name, Stats stats, int XCoordinate, int YCoordinate) {
        if (name == null || stats == null) {
            throw new IllegalArgumentException("Invalid character data");
        }

        this.name = name;
        this.stats = stats;
        this.XCoordinate = XCoordinate;
        this.YCoordinate = YCoordinate;
    }

    public Name getName() { return name;}
    public Stats getStats() { return stats; }
    public int getXCoordinate() { return XCoordinate; }
    public int getYCoordinate() { return YCoordinate; }

    public void setXCoordinate(int XCoordinate) {
        this.XCoordinate = XCoordinate;
    }

    public void setYCoordinate(int YCoordinate) {
        this.YCoordinate = YCoordinate;
    }
}