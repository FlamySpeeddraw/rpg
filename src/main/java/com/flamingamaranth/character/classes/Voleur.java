package com.flamingamaranth.character.classes;

import com.flamingamaranth.character.Stats;

public class Voleur implements GameClass {
    private static final Stats BASE_STATS = new Stats(110, 70, 10, 7, 8, 7, 15, 12, 7, 6);

    @Override
    public Stats getStats() {
        return BASE_STATS;
    }
}