package de.telrun.khakov.rustam.lessons.l.lessons2;

public class OperationExample {
    public static void main(String[] args) {
        int val = 9;
        int val2 = 6;
        double val3 = 6;

        int sum = val + val2;
        int substraction = val - val2;
        int multiplication = val * val2;
        int div = val / val2;
        int mod = val % val2;
        double div2 = val / val3;

        int valueForAd = 5;
        valueForAd = valueForAd + 2;
        System.out.println(valueForAd);
        int valueForAd2 = 5;
        valueForAd2 += 2;
        System.out.println(valueForAd2);
        int valueForAd3 = 5;
        valueForAd3++; //valueForAd3 +=1
        System.out.println(valueForAd3);

        byte b = 127;
        b -= 3;
        System.out.println(b);

//        System.out.println(sum);
//        System.out.println(substraction);
//        System.out.println(multiplication);
//        System.out.println(div);
//        System.out.println(mod);
//        System.out.println(div2);

    }
}
