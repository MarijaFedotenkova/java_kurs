package de.telrun.khakov.rustam.homework.homework1;

public class Task4 {
    public static void main(String[] args) {
        int a = 1000;
        int b = 500;
        int discount = 100;

        int cost = a + b; //сумма покупки
        int sale = cost - discount; //сумма с данной скидкой
        int sumDiscount = discount; //сумма скидки

        System.out.println(sale);
        System.out.println(sumDiscount);
    }
}
