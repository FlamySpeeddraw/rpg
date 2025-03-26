package com.flamingamaranth;

import java.util.Scanner;

import com.flamingamaranth.ui.MainMenu;

public class Main {
    public static void main(String[] args) throws InterruptedException, Exception {
        Scanner sc = new Scanner(System.in);
        MainMenu.afficherMenu(sc);
        sc.close();
    }
}