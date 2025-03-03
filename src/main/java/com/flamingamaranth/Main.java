package com.flamingamaranth;

import java.util.Scanner;

import com.flamingamaranth.character.GameClass;
import com.flamingamaranth.character.Player;

public class Main {
    public static void main(String[] args) {
        boolean playing = true;
        String name;
        int classChoice;
        Player player;
        GameClass selectedClass;

        while (playing) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez le nom du personnage :");
            name = sc.nextLine();
            System.out.println("Choisir la classe : \t1.Guerrier \t2.Mage \t3.Voleur");
            classChoice = sc.nextInt();
            sc.nextLine();
            selectedClass = switch (classChoice) {
                case 1 -> GameClass.GUERRIER;
                case 2 -> GameClass.MAGE;
                case 3 -> GameClass.VOLEUR;
                default -> GameClass.GUERRIER;
            };
            player = new Player(name, selectedClass.getStats());
            sc.close();
            playing = false;
        }
    }
}