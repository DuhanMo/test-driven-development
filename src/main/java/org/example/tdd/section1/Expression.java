package org.example.tdd.section1;

public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);
}
