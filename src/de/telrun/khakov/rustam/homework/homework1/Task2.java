package de.telrun.khakov.rustam.homework.homework1;

public class Task2 {
    public static void main(String[] args) {

        int num = 137; // 1 сотня 3 десятых 7 единиц

        int mod = num / 100; // сотни
        int mod1 = (num % 100) / 10; // десятые  (num / 10) % 10
        int mod2 = num % 10; // единицы

        System.out.println(mod);
        System.out.println(mod1);
        System.out.println(mod2);
    }
}
