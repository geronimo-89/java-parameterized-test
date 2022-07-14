package ru.yandex.praktikum.calc;

public abstract class CalculatorTest {

    protected final int firstNumber;
    protected final int secondNumber;
    protected final int expectedResult;

    public CalculatorTest(int firstNumber, int secondNumber, int expectedResult) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }
}