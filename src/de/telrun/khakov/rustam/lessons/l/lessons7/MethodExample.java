package de.telrun.khakov.rustam.lessons.l.lessons7;

public class MethodExample {
    public static void main(String[] args) {
        int res = Integer.valueOf("123");
        res++;
        String str = "123" + "123";
        System.out.println(res);
        String first = "125";
        String second = "126";
        int resaut = sum(first, second);
        System.out.println(first + " +" + second + "= " + resaut);


    }
    //метод который принимает две строки и возрвщвет 1 число -
    //инт- сумма двух строк переведённых в int
    public static int sum(String first, String second){
        int res1 = Integer.valueOf(first);
        int res2 = Integer.valueOf(second);
        return  res1 + res2;


    }



}
