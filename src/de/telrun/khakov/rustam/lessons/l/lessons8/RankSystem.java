package de.telrun.khakov.rustam.lessons.l.lessons8;

public class RankSystem {


    /// бальная система -
    // 0 -55 - неуд
    // 56 - 71 - удовлетворительно
    // 72 - 85 - хорошо
    // 86 - 100 - отлично   // 86 <= point< 100  // point>= 86 && point <=100
    public void calcRank(int point) {
        if (point > 100 || point < 0) {
            System.out.println("балл слишком большой такого не может быть");//невальный балл + point
        }
         else if (point >= 86 && point <= 100) { // 86 && point <= 100 (&&) избытачно за счёт (point > 100)
            System.out.println("Отлично");
        } else if (point >= 72 && point <= 85) {
            System.out.println("Хорошо");
        } else if (point>=56 && point <= 71) {
            System.out.println("удовлетворительно");
        } else if (point <= 55 && point >= 0) {
            System.out.println("неуд");
        } else {
            System.out.println("невалидный балл: " +  point);//(point > 100 || point < 0) за счёт этого + уходит и &&
        }
    }
}

