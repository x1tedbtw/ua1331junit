package com.softserve.edu;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    private final Rectangle rectangle = new Rectangle();

    @BeforeAll
    public static void setup(){
        System.out.println("Unit tests for Rectangle");
    }

    @Test
    public void constructorTest() {
        assertEquals(1.0, rectangle.getHeight());
        assertEquals(1.0, rectangle.getWidth());
        assertEquals(90, rectangle.getAngle());
    }
    @Test
    public void paramConstructorTest() {
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        assertEquals(10.0, rectangle.getWidth());
        assertEquals(5.0, rectangle.getHeight());
    }


    @Test
    public void calcAreaPositiveTest() {
        Rectangle rectangle = new Rectangle(20, 5);
        double actual;
        double expected;

        expected = 100;
        actual = rectangle.calculateArea();
        Assertions.assertEquals(expected, actual);
        System.out.println("Positive Test - Expected: " + expected + " Actual: " + actual);

    }

    @Test
    public void calcAreaNegativeTest() {
        Rectangle rectangle = new Rectangle(10, 5);
        double actual;
        double expected;

        expected = 100;
        actual = rectangle.calculateArea();
        Assertions.assertNotEquals(expected, actual);
        System.out.println("Negative Test - Expected: " + expected + " Actual: " + actual);
    }

    @Test
    public void calcPerimetrPositiveTest() {
        Rectangle rectangle = new Rectangle(5, 5);
        double actual;
        double expected;

        expected = 20;
        actual = rectangle.calculatePerimetr();
        Assertions.assertEquals(expected, actual);
        System.out.println("Positive Test - Expected: " + expected + " Actual: " + actual);

    }

    @Test
    public void calcPerimetrNegativeTest() {
        Rectangle rectangle = new Rectangle(20, 5);
        double actual;
        double expected;

        expected = 100;
        actual = rectangle.calculatePerimetr();
        Assertions.assertNotEquals(expected, actual);
        System.out.println("Negative Test - Expected: " + expected + " Actual: " + actual);

    }

    @Test
    public void calcDiagonalPositiveTest() {
        Rectangle rectangle = new Rectangle(3, 4);
        double actual;
        double expected;

        expected = 5;
        actual = rectangle.calculateDiagonal();
        Assertions.assertEquals(expected, actual);
        System.out.println("Positive Test - Expected: " + expected + " Actual: " + actual);

    }
    @Test
    public void calcDiagonalNegativeTest() {
        Rectangle rectangle = new Rectangle(3, 3);
        double actual;
        double expected;

        expected = 100;
        actual = rectangle.calculateDiagonal();
        Assertions.assertNotEquals(expected, actual);
        System.out.println("Negative Test - Expected: " + expected + " Actual: " + actual);

    }

    @Test
    @DisplayName("setHeight() should throw IllegalArgumentException when height is negative")
    public void testSetHeightWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> rectangle.setHeight(-5),
                "Expected setHeight() to throw, but it didn't");
    }

    @AfterAll
    public static void finish(){
        System.out.println("Finished!");
    }

}
