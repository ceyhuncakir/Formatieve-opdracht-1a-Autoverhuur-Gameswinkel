package com.ceyhun.opdracht1a;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Game g1 = new Game();
        Game g2 = new Game();
        Game g3 = new Game();

        Persoon p1 = new Persoon();
        Persoon p2 = new Persoon();
        Persoon p3 = new Persoon();

        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
        int releaseJaar2 = LocalDate.now().getYear() - 2; // 2 jaar geleden

        g1.setGame("Just Cause 3", releaseJaar1, 49.98);
        g2.setGame("Need for Speed: Rivals", releaseJaar2, 45.99);
        g3.setGame("Need for Speed: Rivals", releaseJaar2, 45.99);

        p1.setPerson("Eric", 200);
        p2.setPerson("Hans", 55);
        p3.setPerson("Arno", 185);

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
