package de.telrun.khakov.rustam.lessons3;

public class Classwork1 {
    public static void main(String[] args) {
        int val = 123; // 123 /2 = 61 (1)

        System.out.println(Integer.toBinaryString(val));//двоичная
       // System.out.println(Integer.toOctalString(val));//десятиричная
       // System.out.println(Integer.toHexString(val));//шестнацатиричная

        val = val>>1; // val / 2
        val = val<<1; // val * 2
        System.out.println(Integer.toBinaryString(val));



    }
}
