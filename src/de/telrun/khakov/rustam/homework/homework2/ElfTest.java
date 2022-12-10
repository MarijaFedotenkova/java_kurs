package de.telrun.khakov.rustam.homework.homework2;

public class ElfTest {
    public static void main(String[] args) {

        Elf elfFirst = new Elf();
        Elf elfSec = new Elf();
        elfFirst.age =5;
        elfSec.age = 4;

        System.out.println(Constant.ELF_POWER);
        System.out.println(elfFirst.age);
        System.out.println(elfSec.age);
    }
}
