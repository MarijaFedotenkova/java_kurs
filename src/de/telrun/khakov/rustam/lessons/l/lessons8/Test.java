package de.telrun.khakov.rustam.lessons.l.lessons8;

public class Test {
    public static void main(String[] args) {

        int num = 13;
        boolean divBy3 = num % 3 == 0;
        boolean divBy5 = num % 5 == 0;
        boolean divBy3AndNow5 = divBy3 && !divBy5;// дайте нам число которое делится на 3 и не делится на 5
        boolean notDivBy5 = num % 5 != 0; //(num % 5 != 0)
        //(num % 3 == 0) && (num % 5 != 0);

        boolean isWindy = false;
        boolean isSunny = false;
        boolean canWalk = isSunny && !isWindy;

    }
}
