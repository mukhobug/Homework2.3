package com.example.homework2dot3.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.homework2dot3.service.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplParamTest {
    private final CalculatorService calculatedService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSumCorrectly(Integer a, Integer b) {
        Integer result = calculatedService.plus(a, b);
        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMinusCorrectly(Integer a, Integer b) {
        Integer result = calculatedService.minus(a, b);
        assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMultiplyCorrectly(Integer a, Integer b) {
        Integer result = calculatedService.multiply(a, b);
        assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivideCorrectly(Integer a, Integer b) {
        Integer result = calculatedService.divide(a, b);
        assertEquals(a / b, result);
    }

    private static Stream<Arguments> provideCalculatorParams() {
        return Stream.of(
                Arguments.of(TWO, TWO),
                Arguments.of(TWO, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(ZERO, THREE)
        );
    }
}
