package com.example.springdocker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathCalcTest {
MyMathCalc calc=new MyMathCalc();
    @Test
    void add() {

        assertEquals(9,calc.add(4,5));
    }

    @Test
    void multiply() {
        assertEquals(20,calc.multiply(4,5));
    }

    @Test
    void divide() {
        assertThrows(ArithmeticException.class,() -> calc.divide(3,0));
    }
}