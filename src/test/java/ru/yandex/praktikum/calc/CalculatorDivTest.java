package ru.yandex.praktikum.calc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorDivTest extends CalculatorTest {


    public CalculatorDivTest(int firstNumber, int secondNumber, int expectedResult) {
        super(firstNumber, secondNumber, expectedResult);
    }

    @Parameterized.Parameters
    public static Object[][] getDivData() {
        return new Object[][]{
                {8, 4, 2},
                {0, 1, 0},
                {1, 0, 0},
                {-6, -3, 2},
                {6, -2, -3},
        };
    }

    @Test
    public void shouldBeDiv() {
        Calculator calculator = new Calculator();
        int actual = calculator.div(firstNumber, secondNumber);
        assertEquals("Sum is incorrect", expectedResult, actual);
    }
}
