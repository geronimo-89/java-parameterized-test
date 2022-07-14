package ru.yandex.praktikum.calc;

public class Calculator {


    public int sum(int a, int b) {
        return a + b;
    }

    public int diff(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            return 0;
        } else return a / b;
    }
}
