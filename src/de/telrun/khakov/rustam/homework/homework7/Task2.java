package de.telrun.khakov.rustam.homework.homework7;

import java.util.Scanner;

public class Task2 {
    //2) напишите программу, которая принимает 1 число - год (можно с помощью Scanner или с помощью Random) и выводит високосный год или нет
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Год");
        int year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("Високостный год");
        } else {
            System.out.println("Не високостный год");

        }
    }
}



