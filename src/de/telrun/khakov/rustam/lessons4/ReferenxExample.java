package de.telrun.khakov.rustam.lessons4;

public class ReferenxExample {
    public static void main(String[] args) {
        int i = 4;
        int b = i;
        i++;
        Flower roze = new Flower();
        Flower роза = roze;
        роза.size = 3;
        roze.size = 5;
        System.out.println(roze.size);
        //System.out.println(b);
    }
}
