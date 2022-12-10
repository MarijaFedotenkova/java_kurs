package de.telrun.khakov.rustam.lessons.l.lessons8;

public class IfTest {
    public static void main(String[] args) {
        int num = 3;
        //если больше 3 говори больше 3б иначе если равно 3 говори 3, иначе меньше 3
        if (num > 3) {

            System.out.println("число больше 3");

        } else if (num == 3) {
            System.out.println("число равно трём");

        } else {
            System.out.println("число меньше или равно 3");
        }

    }

    //бальная система -
    // если от 0 -55 неуд
    // если 56 -71 удот
    //72 - 85 хорошо
    // 80 - 100 отлично


}
