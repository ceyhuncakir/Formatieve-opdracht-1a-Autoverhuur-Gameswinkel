package com.ceyhun.opdracht1a;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
        int releaseJaar2 = LocalDate.now().getYear() - 2; // 2 jaar geleden

        Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);

        Persoon p1 = new Persoon("Eric", 200);
        Persoon p2 = new Persoon("Hans", 55);
        Persoon p3 = new Persoon("Arno", 185);

        p1.koop(g1);
        p1.koop(g2);
        p1.koop(g3);
        p2.koop(g2);
        p2.koop(g1);
        p3.koop(g3);

        p1.getPerson("Eric");
        p2.getPerson("Hans");
        p3.getPerson("Arno");

        p1.verkoop(g1, p3);
        p2.verkoop(g2, p3);
        p2.verkoop(g1, p1);

        p1.getPerson("Eric");
        p2.getPerson("Hans");
        p3.getPerson("Arno");
    }
}
