package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 */
public class CalculatorTest {
    /**
     * Тут могла бы быть ваша реклама.
     */
    @Test

    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.plus(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     *
     */
    @Test
    public void whenTenMinusFiveThanFifty() {
        Calculator calc = new Calculator();
        calc.minus(10, 5);
        double result = calc.getResult();
        double expected = 5;
        assertThat(result, is(expected));
    }
    /**
     *
     */
    @Test
    public void whanFiveMultiplyEightThanFourty() {
        Calculator calc = new Calculator();
        calc.multiply(5, 8);
        double result = calc.getResult();
        double expected = 40;
        assertThat(result, is(expected));
    }
    /**
     *
     */
    @Test
    public void whanSixDivideSixThanOne() {
        Calculator calc = new Calculator();
        calc.divide(6, 6);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }
}
