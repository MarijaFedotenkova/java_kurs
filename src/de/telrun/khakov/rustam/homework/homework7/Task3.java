package de.telrun.khakov.rustam.homework.homework7;

import java.util.Scanner;

public class Task3 {
    //Покупатель приходит в магазин печенья, 1 печенье стоит 0.5 евро
    //Напишите программу которая спрашивает у покупатель сколько он хочет купить печенья, после этого с помощью Scanner считывается
    // число сколько печенья хочет купить покупатель, после спрашивается сколько денег у покупателя и считывается число
    // (сколько денег у покупатепеченьяля), программа должна написать может ли купить столько печенья за такие деньги, например
    //покупатель хочет купить 10 печенек, у него 4 евро ответ  нельзя
    //покупатель хочет купить 12 печенек, у него 8 евро ответ  можно
    public static void main(String[] args) {
        double priceCookies = 0.5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько хотите купить пиченья?");
        int amountCookies = scanner.nextInt();
        System.out.println("Сколько у Вас денег?");
        double amountMoney = scanner.nextDouble();
        if ( amountMoney - (amountCookies * priceCookies) >= 0) {
            System.out.println("можно");
        }else{
            System.out.println("нельзя");

        }

    }

    }

