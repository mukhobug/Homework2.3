package com.example.homework2dot3;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(String num1, String num2) {
        if (num1 != null && num2 != null) {
            int numA = Integer.parseInt(num1);
            int numB = Integer.parseInt(num2);
            int sum = numA + numB;
            return num1 + " + " + num2 + " = " + sum;
        } else {
            return "недостаточно аргументов";
        }
    }

    public String minus(String num1, String num2) {
        if (num1 != null && num2 != null) {
            int numA = Integer.parseInt(num1);
            int numB = Integer.parseInt(num2);
            int sum = numA - numB;
            return num1 + " - " + num2 + " = " + sum;
        } else {
            return "недостаточно аргументов";
        }
    }

    public String multiply(String num1, String num2) {
        if (num1 != null && num2 != null) {
            int numA = Integer.parseInt(num1);
            int numB = Integer.parseInt(num2);
            int sum = numA * numB;
            return num1 + " * " + num2 + " = " + sum;
        } else {
            return "недостаточно аргументов";
        }
    }

    public String divide(String num1, String num2) {
        if (num1 != null && num2 != null) {
            int numA = Integer.parseInt(num1);
            int numB = Integer.parseInt(num2);
            int sum;
            if (numB != 0) {
                sum = numA / numB;
            } else {
                return "Делить на ноль нельзя";
            }
            return num1 + " / " + num2 + " = " + sum;
        } else {
            return "недостаточно аргументов";
        }
    }
}
