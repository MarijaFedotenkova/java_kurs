package de.telrun.khakov.rustam.homework.homework7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // //С консоли вводится число - возраст человека
        //        //после чего вызывается метод, который возвращает ответ можно ли этому человеку смотреть фильм, у фильма ограничение по возрасту не меньше 18.
        //        //Пример:
        //        //на входе число 19 пишется Можно идти смотреть кино
        //        //на входе число 7 пишется Нельзя идти смотреть кино
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваш возраст?");
        int age = scanner.nextInt();

        if (age < 18){
            System.out.println("Нельзя идти смотреть кино");
        } else if (age > 18){
            System.out.println("Можно идти смотреть кино");
        }else{
            System.out.println("Можно идти смотреть кино");

        }
    }
}
