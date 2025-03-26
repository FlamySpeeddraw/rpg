package com.flamingamaranth.character.classes;

import com.flamingamaranth.character.Stats;

public class Mage implements GameClass {
    private static final Stats BASE_STATS = new Stats(90, 150, 4, 15, 5, 12, 7, 6, 5, 10);

    @Override
    public Stats getStats() {
        return BASE_STATS;
    }
}