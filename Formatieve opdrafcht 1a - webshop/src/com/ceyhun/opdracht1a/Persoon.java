package com.ceyhun.opdracht1a;

import java.time.LocalDate;

public class Persoon {

    public String name;
    public int money;

    public String boughtgames = "";

    public void setPerson(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void getPerson(String name) {
        Game game = new Game();
        String Moneyoutput = String.format("%s €", money);

        if(boughtgames.equals(" ")) {
            System.out.println("\n" + name + " Heeft een budget van " + Moneyoutput + " en bezit de volgende games: \n" + "geen games");
        } else {
            System.out.println("\n" + name + " Heeft een budget van " + Moneyoutput + " en bezit de volgende games: \n" + boughtgames);
        }
    }

    public void koop(Game game) {

        double discount = Math.pow(0.70, LocalDate.now().getYear() - game.release) * game.price;

        if(money >= game.price) {
            System.out.println(name + " koopt " + game.game + ": gelukt");

            this.boughtgames += game.game + ", uitgegeven in " + game.release + "; nieuwprijs: " + game.price + " nu voor: " + discount + "\n";

            this.money = (int) (money - game.price);
        } else {
            System.out.println(name + " koopt " + game.game + ": niet gelukt");
        }
    }

    public void verkoop(Game game, Persoon persoon) {
        String verkoper = name;
        String koper = persoon.name;

        double discount = Math.pow(0.70, LocalDate.now().getYear() - game.release) * game.price;

        if(persoon.money >= game.price && boughtgames.contains(game.game)) {
            System.out.println(verkoper + " verkoopt " + game.game + " aan " + koper + ": gelukt");
            persoon.money = (int) (persoon.money - game.price);
            this.money = (int) (money + game.price);
            persoon.boughtgames += game.game + ", uitgegeven in " + game.release + "; nieuwprijs: " + game.price + " nu voor: " + discount + "\n";
            boughtgames = boughtgames.replace(game.game + ", uitgegeven in " + game.release + "; nieuwprijs: " + game.price + " nu voor: " + discount + "\n", " ");
        } else {
            System.out.println(verkoper + " verkoopt " + game.game + " aan " + koper + ": niet gelukt");
        }
    }
}
