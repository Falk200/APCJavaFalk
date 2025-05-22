package org.example;

public class Fraction {
    private int zaehler;
    private int nenner;
    // icomplete

    public Fraction(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
        if(nenner == 0){
            throw new IllegalArgumentException("nenner is zero");
        }
    }

    // wrong
    public void kehrwert() {
        int temp = this.nenner;
        this.setNenner(this.zaehler);
        this.setZaehler(temp);
    }

    // wrong
    public void multiplikation(Fraction a) {
        this.setNenner(this.nenner * a.nenner);
        this.setZaehler(this.zaehler * a.zaehler);
    }

    // wrong
    public void addition(Fraction a) {
        if (a.getNenner() != this.getNenner()) {
            int gemeinsamerNenner = this.getNenner()* a.getNenner();
            this.setZaehler(this.getZaehler() * a.getNenner());
            a.setZaehler(a.getZaehler() * this.getNenner());
            this.setZaehler(this.getZaehler() + a.getZaehler());
            this.setNenner(gemeinsamerNenner);
        } else {
            this.setZaehler(this.getZaehler() + a.getZaehler());
        }
    }

    // wrong
    public void kuerzen() {
        int ggt = ggt(Math.abs(zaehler), Math.abs(nenner));
        this.zaehler /= ggt;
        this.nenner /= ggt;
    }

    // helper method Euklidian algorithm ,
// here are no mistakes
    private int ggt(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return this.getZaehler() + "/" + this.getNenner();
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }
}
