package de.telrun.khakov.rustam.homework.homework8;

import java.util.Scanner;

public class ApartmentHouse {
    //В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48.
    // В третьем с 49 по 90. Пользователь вводит номер квартиры.
    // Программа должна указать в каком подъезде находится данная квартира.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("номер квартиры?");
        int num = scanner.nextInt();

        if (num <= 20){
            System.out.println("находится в первом подьезде");
        } else if (num > 20 && num <= 48) {
            System.out.println("находится во втором подьезде");
        }else{
            System.out.println("находится в третьем подьезде");
        }

    }
}
