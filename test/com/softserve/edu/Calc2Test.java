package com.softserve.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Calc2Test {
    private Calc calc;

    @BeforeAll
    public void setup(){
        calc = new Calc();
        System.out.println("@BeforeAll executed");
    }


    @Test
    public void checkAdd1() {
        //Calc calc = new Calc();
        double actual;
        double expected;

        expected = 10.0005;
        actual = calc.add(5, 5);
        Assertions.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void checkAdd2() {
        //Calc calc = new Calc();
        double actual;
        double expected;

        expected = 9;
        actual = calc.add(5, 4);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void checkDiv1() {
        //Calc calc = new Calc();
        double actual;
        double expected;

        expected = 1;
        actual = calc.div(5, 5);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void checkDiv2() {
        //Calc calc = new Calc();
        double actual;
        double expected;

        expected = 2.5;
        actual = calc.div(20, 8);
        Assertions.assertEquals(expected, actual);
    }
}

