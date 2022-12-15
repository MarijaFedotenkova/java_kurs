package de.telrun.khakov.rustam.homework.homework8;

public class Seasons {
    //Переменная num может принимать 4 значения: 1, 2, 3 или 4.
    // Если она имеет значение '1', то в переменную result запишем 'зима',
    // если имеет значение '2' – 'весна' и так далее. Решите задачу через switch-case.
    public static void main(String[] args) {
        int month = 2;
        switch (month){
            case 1 -> System.out.println("зима");
            case 2 -> System.out.println("весна");
            case 3 -> System.out.println("лето");
            case 4 -> System.out.println("осень");
            default -> System.out.println("not supported");
        }
    }
}
