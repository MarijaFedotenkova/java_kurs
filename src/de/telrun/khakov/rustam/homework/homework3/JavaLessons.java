package de.telrun.khakov.rustam.homework.homework3;

import java.util.Scanner;

public class JavaLessons {
    public static void main(String[] args) {
        //Создайте строку I love Java Lessons!
        //2 Распечатать первый символ строки. Используем метод String.charAt().
        //4 Проверить, содержит ли строка подстроку “love”. Используем метод String.contains().
        //5 Заменить все символы “o” на “a”.
        //6 Преобразуйте строку к верхнему регистру.
        //7 Преобразуйте строку к нижнему регистру.
        //8 Вырезать строку Lessons c помощью метода String.substring().
        //программу для подсчета какой индекс у символа 'L'
        //Напишите программу, которая спрашивает имя и считывает его с консоли с помощью Scanner и после пишет на консоль “Hello …….. !
        //вместо многоточий имя
        //Напишите программу, которая спрашивает имя и считывает его с консоли с помощью Scanner и после пишет "Ваше имя начинается с буквы …"
        //имеется число 59.976, нужно вывести целое из него и перевести в int (явное преобразование типов)
        //перевести число 475 типа int в short
        String str = "I love Java Lessons!";
        System.out.println(str.charAt(0));
        System.out.println(str.contains("love"));
        System.out.println(str.replace('o' , 'a'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.indexOf("Lessons")));
        System.out.println(str.indexOf('L'));

        Scanner scanner = new Scanner(System.in);
        String str1 = "Ваше имя ";
        System.out.println(str1);
        String str2 = scanner.nextLine();
        System.out.println("Hello " + str2);

        Scanner scanner2 = new Scanner(System.in);
        String str3 = "Ваше имя ";
        System.out.println(str3);
        String str4 = scanner2.nextLine();
        System.out.println("Ваше имя начинается с буквы " + str4.charAt(0));

        double fromDobl = 59.976;
        int inInt = (int) fromDobl ;
        System.out.println(inInt);

        int fromInt = 475;
        short inShort = (short) fromInt;
        System.out.println(inShort);
    }
}
