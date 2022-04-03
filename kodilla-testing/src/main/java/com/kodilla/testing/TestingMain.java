package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {


        int a = 22;
        int b = 2000;
        Calculator calculatorTest = new Calculator();

        if (calculatorTest.add(a, b) == a + b) {
            System.out.println("test 6.2.1 OK");
        } else {
            System.out.println("Error!");
        }

        if (calculatorTest.substract(a, b) == a - b) {
            System.out.println("test 6.2.2 OK");
        } else {
            System.out.println("Error!");
        }
    }
}

