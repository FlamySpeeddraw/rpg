package com.flamingamaranth.character.movements;

import com.flamingamaranth.character.BaseCharacter;

public class MovementManager {
    public static void updatePosition(BaseCharacter character, Direction direction) {
        int newX = character.getXCoordinate() + direction.getDeltaX();
        int newY = character.getYCoordinate() + direction.getDeltaY();

        character.setXCoordinate(newX);
        character.setYCoordinate(newY);
        System.out.println(character.getName() + " se déplace vers " + direction);
    }
}