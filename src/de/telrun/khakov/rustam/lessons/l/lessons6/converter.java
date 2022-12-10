package de.telrun.khakov.rustam.lessons.l.lessons6;

public class converter {
    private double rate = 1.02;
    public converter (double rate){
        this.rate = rate;
    }
    public double toEur(double usd){
        return usd / this.rate;
    }
    public double toUsd(double eur){
        return eur * this.rate;
    }
}
