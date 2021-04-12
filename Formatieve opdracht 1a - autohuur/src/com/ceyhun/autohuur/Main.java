package com.ceyhun.autohuur;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Autohuur ah1 = new Autohuur();
        Autohuur ah2 = new Autohuur();

        Klant k = new Klant();

        Auto a1 = new Auto();
        Auto a2 = new Auto();

        System.out.println("Eerste autohuur " + ah1.toString());

        k.klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);

        System.out.println("\nEerste autohuur " + ah1.toString());

        a1.auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);

        System.out.println("\nEerste autohuur " + ah1.toString());

        a2.auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);

        System.out.println("\nEerste autohuur " + ah2.toString());

        System.out.println("\nGehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }
}
