package ru.yandex.praktikum.calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTestSimple {

    private int firstNumber;
    private int secondNumber;
    private int expectedResult;
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldBeSum() {
        firstNumber = 2;
        secondNumber = 3;
        expectedResult = 5;
        int actualResult = calculator.sum(firstNumber, secondNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldBeMult() {
        firstNumber = 2;
        secondNumber = 3;
        expectedResult = 6;
        int actualResult = calculator.mult(firstNumber, secondNumber);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldBeDiff() {
        firstNumber = 5;
        secondNumber = 2;
        expectedResult = 3;
        int actualResult = calculator.diff(firstNumber, secondNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldBeDiv() {
        firstNumber = 8;
        secondNumber = 4;
        expectedResult = 2;
        int actualResult = calculator.div(firstNumber, secondNumber);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}