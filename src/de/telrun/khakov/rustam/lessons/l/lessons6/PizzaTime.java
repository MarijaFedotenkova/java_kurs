package de.telrun.khakov.rustam.lessons.l.lessons6;

public class PizzaTime {
    public static void main(String[] args) {
        double sqrSmall = Math.PI * 24 * 24;
        double sqrBig = Math.PI * 28 * 28;
        double diff = (sqrBig - sqrSmall) * 40;
        System.out.println("Разница в коллориях " + diff);

        String str1 = "wow";
        String str2 = "ogo";
        String res = magicFunc(str1, str2);
        System.out.println(res);


    }
    public static String magicFunc(String s1, String s2){
        return s1 + "-" + s2 + "-" + s1;
    }
}
