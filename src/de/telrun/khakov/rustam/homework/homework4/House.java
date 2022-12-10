package de.telrun.khakov.rustam.homework.homework4;

public class House {
    //создайте параметры length, width, hight типа int
    //
    //создайте параметры address, owner типа String
    //
    //создайте несколько различных конструкторов
    //высота и владелец могут меняться извне, адрес, ширина и длина не может
    // (поля должны быть private и должны быть getter для них)

    private int length;
    private int width;
    int hight;
    private String address;
    String owner;

    public House(int hight, String owner , int length, int width, String address) {
        this.hight = hight;
        this.owner = owner;
        this.length = length;
        this.width = width;
        this.address = address;
    }
    public House(int length, int width, String address) {
        this.length = length;
        this.width = width;
        this.address = address;
    }
    public int build(int hight){
        this.hight = hight;
        return  this.hight;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getAddress() {
        return address;
    }
}


