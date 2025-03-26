package com.flamingamaranth.character.classes;

import com.flamingamaranth.character.Stats;

public class Guerrier implements GameClass {
    private static final Stats BASE_STATS = new Stats(150, 50, 15, 5, 12, 6, 8, 5, 10, 4);

    @Override
    public Stats getStats() {
        return BASE_STATS;
    }
}