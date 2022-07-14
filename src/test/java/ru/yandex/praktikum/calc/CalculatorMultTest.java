package ru.yandex.praktikum.calc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorMultTest extends CalculatorTest {


    public CalculatorMultTest(int firstNumber, int secondNumber, int expectedResult) {
        super(firstNumber, secondNumber, expectedResult);
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {2, 4, 8},
                {1, 0, 0},
                {0, 0, 0},
                {-2, -3, 6},
                {3, -2, -6},
        };
    }

    @Test
    public void shouldBeMult() {
        Calculator calculator = new Calculator();
        int actual = calculator.mult(firstNumber, secondNumber);
        assertEquals("Sum is incorrect", expectedResult, actual);
    }
}
