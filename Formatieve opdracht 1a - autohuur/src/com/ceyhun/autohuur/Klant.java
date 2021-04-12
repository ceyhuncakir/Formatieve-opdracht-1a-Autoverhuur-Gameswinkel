package com.ceyhun.autohuur;

public class Klant {

    private String naam;
    private double kortingsPercentage;

    public void klant(String naam) {
        this.naam = naam;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString() {
        if(naam == null || kortingsPercentage == 0) {
            return "er is geen huurder bekend";
        }
        return "op naam van: " + naam + " (korting: " + getKorting() + ")";
    }
}
