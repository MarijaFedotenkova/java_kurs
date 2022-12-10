package de.telrun.khakov.rustam.lessons.l.lessons8;

public class BooleanTest {
    public static void main(String[] args) {
        int b = 0;
        boolean isMoreEquals = 5 >= 7;
        boolean isEquals = 8 == 7;
        //чётное или нет -> делится ли на 2 -> остаток от деления равен ли нулю
        boolean isEven = 8 % 2 ==0;
        boolean isDivBy3 = 9 % 3 !=0;// остаток от деления не равен 0
        System.out.println(isEven);
        int i = 7;
        boolean isDiv2or3 = (i % 2 ==0) || (i % 3 == 3);//логические операторы
        boolean isDiv2and3 = (i % 2 ==0) && (i % 3 == 3);//логические операторы
        //1011
        //
        int num = 11;
       //num = num<<1;// сдвиг это умнажения на два
        int num2 = 12;
        //System.out.println(num | num2);
        System.out.println(isDiv3AndNot5(15));
       // System.out.println(num);
    }

    // нужно написать метод который будет возврвщвть ответ на вопрос делится ли на 3 и не делится на 5
    public static boolean isDiv3AndNot5(int num) {
        return (num % 3 == 0) && (num % 5 != 0);
    }

}


