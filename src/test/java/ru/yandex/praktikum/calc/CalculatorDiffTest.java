package ru.yandex.praktikum.calc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorDiffTest extends CalculatorTest {


    public CalculatorDiffTest(int firstNumber, int secondNumber, int expectedResult) {
        super(firstNumber, secondNumber, expectedResult);
    }

    @Parameterized.Parameters
    public static Object[][] getDiffData() {
        return new Object[][]{
                {8, 4, 4},
                {0, 1, -1},
                {1, 0, 1},
                {-6, -3, -3},
                {-2, 4, -6},
        };
    }

    @Test
    public void shouldBeDiff() {
        Calculator calculator = new Calculator();
        int actual = calculator.diff(firstNumber, secondNumber);
        assertEquals("Sum is incorrect", expectedResult, actual);
    }
}
