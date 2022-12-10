package de.telrun.khakov.rustam.homework.homework7;

import java.util.Random;

public class Task4 {
    // напишите программу, которая говорит выпал орел или решка
    //true - орел
    //false -решка
    //используйте Random и метод nextBoolean,
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println(rnd.nextBoolean());
    }



}
