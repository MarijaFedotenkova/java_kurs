package de.telrun.khakov.rustam.homework.homework6;

public class HM1 {
    public static void main(String[] args) {
        boolean res = isMoreOrEquals(4,5);
        System.out.println(res);
        System.out.println(smartConcat("цена", "печенье"));

    }
    public static boolean isMoreOrEquals(int first, int second){
        return first >= second;
    }
     public static String smartConcat(String str1, String str2) {
        String f = str1.substring(0,str1.length() / 2);
        String s = str2.substring(( str2.length() / 2));
        return f + s;
     }
}

