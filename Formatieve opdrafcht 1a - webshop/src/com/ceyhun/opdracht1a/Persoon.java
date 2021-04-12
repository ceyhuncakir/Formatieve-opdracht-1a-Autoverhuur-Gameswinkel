package com.ceyhun.opdracht1a;

import java.time.LocalDate;
import java.util.HashSet;

public class Persoon {

    private final String name;
    private double money;

    HashSet<Game> boughtgames = new HashSet<>();


    public Persoon(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void getPerson(String name) {
        String games = " ";

        String budget = String.format("%s €", money);

        if(boughtgames.isEmpty()) {
            System.out.println("" + name + " Heeft een budget van " + budget + " en bezit de volgende games: \n" + "geen games");
        } else {
            for(Game game : boughtgames) {
                double discount = Math.pow(0.70, LocalDate.now().getYear() - game.getRelease()) * game.getprice();
                games += "\n" + game.getGame() + ", uitgegeven in " + game.getRelease() + ";" + " nieuwprijs: " + game.getprice() + " nu voor: " + discount;
            }
            System.out.println("\n" + name + " Heeft een budget van " + budget + " en bezit de volgende games: \n" + games + "\n");
        }
    }

    public void koop(Game game) {

        if(money >= game.getprice() && !boughtgames.contains(game)) {
            System.out.println(name + " koopt " + game.getGame() + ": gelukt");

            boughtgames.add(game);

            this.money = (int) (money - game.getprice());
        } else {
            System.out.println(name + " koopt " + game.getGame() + ": niet gelukt");
        }
    }

    public void verkoop(Game game, Persoon persoon) {

        if(persoon.money >= game.getprice() && boughtgames.contains(game)) {
            System.out.println(name + " verkoopt " + game.getGame() + " aan " + persoon.name + ": gelukt");
            persoon.money = (int) (persoon.money - game.getprice());
            money = (int) (money + game.getprice());
            persoon.boughtgames.add(game);
            boughtgames.remove(game);
        } else {
            System.out.println(name + " verkoopt " + game.getGame() + " aan " + persoon.name + ": niet gelukt");
        }
    }
}
