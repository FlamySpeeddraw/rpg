package com.flamingamaranth.ui;

import java.util.Scanner;

import com.flamingamaranth.character.Name;
import com.flamingamaranth.character.Player;

public class CharacterMenu {
    public static String inputName = "";
    public static Player player;
    public static Name name;

    public static void entrerNom(Scanner sc) {

        try {
            System.out.println("Veuillez entrer le nom de votre personnage");
            inputName = sc.nextLine();
            name = new Name(inputName);
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
            CharacterMenu.entrerNom(sc);
        }
    }

    public static void selectClass(Scanner sc) {

    }
}
