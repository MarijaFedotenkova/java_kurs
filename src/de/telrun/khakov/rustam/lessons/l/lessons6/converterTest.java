package de.telrun.khakov.rustam.lessons.l.lessons6;

import java.util.Random;

public class converterTest {
    public static void main(String[] args) {
        Random random  = new Random();
        double rate = random.nextDouble(1.01,1.03);
        System.out.println("курс обмена сейчас "+ rate);
        converter converter = new converter(rate);

        int usd = random.nextInt(500);
        System.out.println("usd total " + usd);
        System.out.println(converter.toEur(usd));

        int eur = random.nextInt(500);
        System.out.println("Eur total " + eur);
        System.out.println(converter.toUsd(eur));
    }
}
