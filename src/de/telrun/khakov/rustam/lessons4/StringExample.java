package de.telrun.khakov.rustam.lessons4;


import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String str = "test";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println("Wow! " + str);
        System.out.println(str.charAt(1));
        System.out.println(str.indexOf('t'));
        System.out.println(str.lastIndexOf('t'));
        System.out.println(str.lastIndexOf("st"));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1, 3));
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('t', 'v'));
        String sumRes = str + "tt"; //str.cancat ("tt");
        Scanner scanner = new Scanner(System.in);
        String readVal = scanner.nextLine();
        System.out.println(readVal);
    }
}
