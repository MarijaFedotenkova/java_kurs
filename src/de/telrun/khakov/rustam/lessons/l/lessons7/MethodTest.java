package de.telrun.khakov.rustam.lessons.l.lessons7;

import java.util.Random;

public class MethodTest {
    public static void main(String[] args) {
       // System.out.println(getRandomStudent());

        int i = 3;
        int j = 4;

        int temp = i;
        i = j;
        j = temp;

        swap(i, j);
        System.out.println(i);
        System.out.println(j);


    }
    //метод выбора стцдента
    public static int getRandomStudent(){
        Random random = new Random();
        return random.nextInt(10);

    }
    //метод который принимает 2 числа и должен поменять мастами эти двап числа
    public static void swap(int first, int second){
        int temp = first;
        first = second;
        second = temp;
    }
}
