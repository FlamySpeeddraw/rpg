package com.flamingamaranth.character.movements;

import com.flamingamaranth.character.BaseCharacter;

public class StandardMovementStrategy implements MovementStrategy {
    @Override
    public void move(BaseCharacter character, Direction direction) {
        MovementManager.updatePosition(character, direction);
    }
}