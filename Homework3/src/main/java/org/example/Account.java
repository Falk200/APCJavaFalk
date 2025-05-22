package org.example;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public double getBalance() {
        return balance;
    }

    public void changePin(int oldPin, int newPin) {
        if (oldPin == this.pin) {
            this.pin = newPin;
        }
    }
}


