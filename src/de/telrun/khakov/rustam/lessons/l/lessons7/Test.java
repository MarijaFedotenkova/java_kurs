package de.telrun.khakov.rustam.lessons.l.lessons7;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String str = "test string ";
        Bottle bottle = new Bottle();
        Date date = new Date(1L);
        System.out.println(str.getClass().getClassLoader());
        System.out.println(date.getClass().getClassLoader());
        System.out.println(bottle.getClass().getClassLoader());

    }
}
