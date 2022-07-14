package ru.yandex.praktikum.calc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorSumTest extends CalculatorTest {


    public CalculatorSumTest(int firstNumber, int secondNumber, int expectedResult) {
        super(firstNumber, secondNumber, expectedResult);
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {2, 4, 6},
                {1, 0, 1},
                {0, 0, 0},
                {-2, -3, -5},
                {3, -2, 1},
        };
    }

    @Test
    public void shouldBeSum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(firstNumber, secondNumber);
        assertEquals("Sum is incorrect", expectedResult, actual);
    }
}
