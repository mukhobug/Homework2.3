package com.example.homework2dot3.service;

import com.example.homework2dot3.exception.DivisionByZeroException;
import com.example.homework2dot3.exception.NotEnoughArgException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public boolean checkNull(Integer num1, Integer num2) {
        return num1 == null || num2 == null;
    }

    @Override
    public Integer plus(Integer num1, Integer num2) {
        if (checkNull(num1, num2)) {
            throw new NotEnoughArgException("недостаточно аргументов");
        }
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        if (checkNull(num1, num2)) {
            throw new NotEnoughArgException("недостаточно аргументов");
        }
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if (checkNull(num1, num2)) {
            throw new NotEnoughArgException("недостаточно аргументов");
        }
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (checkNull(num1, num2)) {
            throw new NotEnoughArgException("недостаточно аргументов");
        } else if (num2 == 0) {
            throw new DivisionByZeroException("ошибка: на ноль делить нельзя");
        }
        return num1 / num2;
    }
}