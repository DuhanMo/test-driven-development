package org.example.tdd.section1;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
