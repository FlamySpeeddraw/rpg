package com.flamingamaranth;

import java.util.Scanner;

import com.flamingamaranth.character.GameClass;
import com.flamingamaranth.character.Inventory;
import com.flamingamaranth.character.Name;
import com.flamingamaranth.character.Player;

public class Main {
    public static void main(String[] args) throws InterruptedException, Exception {
        boolean playing = true;
        String name;
        int classChoice;
        Player player;
        GameClass selectedClass;
        Scanner sc = new Scanner(System.in);

        System.out.print("\033[H\033[2J");   
        System.out.flush();
        System.out.println("Entrez votre nom :");
        name = sc.nextLine();
        System.out.println("Choisissez votre classe [1,2,3] : 1.Guerrier 2.Mage 3.Voleur");
        classChoice = sc.nextInt();
        sc.nextLine();
        selectedClass = GameClass.values()[classChoice - 1];
        player = new Player(new Name(name), selectedClass.getStats(), new Inventory());
        System.out.println(player.toString());

        while (playing) {
        }

        sc.close();
    }
}