package de.telrun.khakov.rustam.homework.homework8;

public class Month {
    public static void main(String[] args) {
        int month = 8;
        if (month <= 2){
            System.out.println("зима");
        } else if (month <= 5) {
            System.out.println("весна");

        } else if (month <= 8 ) {
            System.out.println("лето");

        } else if (month <= 11) {
            System.out.println("осень");

        }else{
            System.out.println("not supported");
        }


    }
}

