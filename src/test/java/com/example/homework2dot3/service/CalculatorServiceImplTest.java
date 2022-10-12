package com.example.homework2dot3.service;

import com.example.homework2dot3.exception.DivisionByZeroException;
import org.junit.jupiter.api.Test;

import static com.example.homework2dot3.service.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne() {
        Integer result = calculatorService.plus(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }

    @Test
    public void shouldReturnSixWhenSumThreeAndThree() {
        Integer result = calculatorService.plus(THREE, THREE);
        assertEquals(THREE + THREE, result);
    }

    @Test
    public void shouldReturnZeroWhenMinusThreeAndThree() {
        Integer result = calculatorService.minus(THREE, THREE);
        assertEquals(THREE - THREE, result);
    }

    @Test
    public void shouldReturnTwoWhenSumThreeAndOne() {
        Integer result = calculatorService.minus(THREE, ONE);
        assertEquals(THREE - ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenMultiplyThreeAndOne() {
        Integer result = calculatorService.multiply(THREE, ONE);
        assertEquals(THREE * ONE, result);
    }

    @Test
    public void shouldReturnSixWhenMultiplyThreeAndTwo() {
        Integer result = calculatorService.multiply(THREE, TWO);
        assertEquals(THREE * TWO, result);
    }

    @Test
    public void shouldReturnOneWhenDivideTwoAndTwo() {
        Integer result = calculatorService.divide(TWO, TWO);
        assertEquals(TWO / TWO, result);
    }

    @Test
    public void shouldReturnTwoWhenDivideTwoAndOne() {
        Integer result = calculatorService.divide(TWO, ONE);
        assertEquals(TWO / ONE, result);
    }

    @Test
    public void shouldThrowDivisionByZeroExceptionWhenDivideByZero() {
        assertThrows(DivisionByZeroException.class, () -> calculatorService.divide(ONE, ZERO));
    }
}