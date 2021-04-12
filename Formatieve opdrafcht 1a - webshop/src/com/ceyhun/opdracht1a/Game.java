package com.ceyhun.opdracht1a;

public class Game {

    private final String game;
    private final int release;
    private final double price;

    public Game(String game, int release, double price) {
        this.game = game;
        this.release = release;
        this.price = price;
    }

    public int getRelease() {
        return release;
    }

    public double getprice() {
        return price;
    }

    public String getGame(){
        return game;
    }
}
