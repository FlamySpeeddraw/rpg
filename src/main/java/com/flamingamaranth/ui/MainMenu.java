package com.flamingamaranth.ui;

import java.util.Scanner;

public class MainMenu {
    public static void afficherMenu(Scanner sc) {
        int choix = 0;

        try {
            System.out.println("1.Jouer \n 2.Quitter");
            choix = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Erreur entrée utilisateur : Veuillez choisir [1] ou [2]");
            MainMenu.afficherMenu(sc);
        }

        switch (choix) {
            case 1 -> {
                CharacterMenu.entrerNom(sc);
            }
            
            case 2 -> {
                System.exit(0);
            }

            default -> {
                System.out.println("Une erreur est survenue");
                System.exit(0);
            }
        }
    }
}
