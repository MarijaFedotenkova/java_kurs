package de.telrun.khakov.rustam.lessons.l.lessons3;

public class TestRunner {
    public static void main(String[] args) {
        int val = 1;
        Student petya = new Student();
        System.out.println(petya.birthYear);
        petya.birthYear = 1999;
        System.out.println(petya.birthYear);

        Student vasya = new Student();
        vasya.birthYear = 2000;
        System.out.println(vasya.birthYear);

        Student.PI = 134;
        System.out.println(Student.PI);
        System.out.println(Math.PI);

    }
}
