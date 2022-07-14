package ru.yandex.praktikum.calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class CalculatorTestCombined {

    private final int firstNumber;
    private final int secondNumber;
    private final int expectedSum;
    private final int expectedDiff;
    private final int expectedMult;
    private final int expectedDiv;
    private Calculator calculator;

    public CalculatorTestCombined (int firstNumber, int secondNumber, int expectedSum, int expectedDiff, int expectedMult, int expectedDiv) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedSum = expectedSum;
        this.expectedDiff = expectedDiff;
        this.expectedMult = expectedMult;
        this.expectedDiv = expectedDiv;
    }

    @Parameterized.Parameters
    public static Object[][] getCalcData() {
        return new Object[][]{
                {8, 4, 12, 4, 32, 2},
                {2, 1, 3, 1, 2, 2},
                {0, 2, 2, -2, 0, 0},
                {1, 0, 1, 1, 0, 0},
                {-4, -2, -6, -2, 8, 2},
                {-6, 3, -3, -9, -18, -2},
                {6, -3, 3, 9, -18, -2},
        };
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldBeSum() {}

    @Test
    public void shouldBeDiff() {}

    @Test
    public void shouldBeMult() {}

    @Test
    public void shouldBeDiv() {}


    @After
    public void tearDown() {
        calculator = null;
    }

}
