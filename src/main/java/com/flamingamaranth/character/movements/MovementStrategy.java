package com.flamingamaranth.character.movements;

import com.flamingamaranth.character.BaseCharacter;

public interface MovementStrategy {
    void move(BaseCharacter character, Direction direction);
}