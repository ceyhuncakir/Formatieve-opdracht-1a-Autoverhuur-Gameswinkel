package com.ceyhun.autohuur;

public class Autohuur {

    private int aantalDagen;

    Auto auto = new Auto();
    Klant klant = new Klant();

    public String autohuur() {
        return "\n" + getGehuurdeAuto() + "\n" + getHuurder() + "\n" + "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(Auto auto) {
        this.auto = auto;
    }

    public String getGehuurdeAuto() {
        return auto.toString();
    }

    public void setHuurder(Klant klant) {
        this.klant = klant;
    }

    public String getHuurder() {
        return klant.toString();
    }

    public double totaalPrijs() {
        int discount = (int) (auto.getPrijsperdag() * aantalDagen / 100 * klant.getKorting());
        return auto.getPrijsperdag() * aantalDagen - discount;
    }

    public String toString() {
        return autohuur();
    }
}
