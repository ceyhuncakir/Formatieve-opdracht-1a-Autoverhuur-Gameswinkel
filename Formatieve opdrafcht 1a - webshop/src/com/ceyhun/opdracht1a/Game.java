package com.ceyhun.opdracht1a;

public class Game {

    public String game;
    public int release;
    public double price;

    public void setGame(String game, int release, double price) {
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
