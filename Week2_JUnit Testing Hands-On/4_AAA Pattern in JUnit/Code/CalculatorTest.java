package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // 🔧 Setup: runs before each test
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator();
    }

    // 🧹 Teardown: runs after each test
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }

    // 🧪 Test using AAA pattern
    @Test
    public void testAdd() {
        // Arrange
        int a = 3, b = 2;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }
}
