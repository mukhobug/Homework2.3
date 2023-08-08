package com.example.homework2dot3.controller;

import com.example.homework2dot3.service.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1,
                       @RequestParam(required = false) Integer num2) {
        return generateMsg(num1, num2, " + ", calculatorService.plus(num1, num2));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1,
                        @RequestParam(required = false) Integer num2) {
        return generateMsg(num1, num2, " - ", calculatorService.minus(num1, num2));
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        return generateMsg(num1, num2, " * ", calculatorService.multiply(num1, num2));
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1,
                         @RequestParam(required = false) Integer num2) {
        return generateMsg(num1, num2, "/", calculatorService.divide(num1, num2));
    }

    private String generateMsg(Integer num1, Integer num2, String operation, Integer result) {
        return String.format("%d %s %d = %d", num1, operation, num2, result);
    }
}