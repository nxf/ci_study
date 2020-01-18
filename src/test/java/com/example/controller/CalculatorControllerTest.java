package com.example.controller;

import com.example.service.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    private Calculator calculator = new Calculator();
    @Test
    void sum() {
        assertEquals(5, calculator.sum(2,3));
    }
}