package com.ceyhun.autohuur;

public class Auto {

    private String type;
    private double prijsperdag;

    public void auto(String type, double prijsperdag) {
        this.type = type;
        setPrijsperdag(prijsperdag);
    }

    public void setPrijsperdag(double prijsperdag) {
        this.prijsperdag = prijsperdag;
    }

    public double getPrijsperdag() {
        return prijsperdag;
    }

    public String toString() {
        if(type == null || prijsperdag == 0) {
            return "er is geen auto bekend";
        }
        return "autotype: " + type + " met prijs per dag: " + prijsperdag;
    }
}
