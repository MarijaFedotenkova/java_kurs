package de.telrun.khakov.rustam.lessons3;

import java.util.Scanner;

public class TerminalTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число");
        int x = scan.nextInt();
        //double d = scan.nextDouble();
        // boolean b = scan.nextBoolean();
        int y = x + 3 - x * 2;
        System.out.println("Результат подсчета равен " + y);
    }
}
