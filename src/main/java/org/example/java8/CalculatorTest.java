package org.example.java8;

@FunctionalInterface
interface Calculator {
    public void switchOn();
}

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = () -> System.out.println("Switch on light");
        c.switchOn();
    }
}

