package com.softserve.edu;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // allows to use non-static @BeforeAll methods
public class ArrayTaskTest {
    private ArrayTask arrayTask;

    @BeforeAll
    public void setup() {
        arrayTask = new ArrayTask();
    }

    @Test
    public void getArrayListTest(){
        arrayTask.getArrayList();
        ArrayList<Integer> list = arrayTask.getList();

        assertEquals(20, list.size(), "List should contain 20 elements");

        for (int num : list) {
            assertTrue(num >= 0 && num < 100, "Each number should be in range 0 to 99 ");
        }
    }
    @Test
    public void getMinValueTest() {
        ArrayTask arrayTask = new ArrayTask();

        arrayTask.getList().addAll(Arrays.asList(12, 45, 3, 88, 7));
        int min = arrayTask.getMinValue();
        assertEquals(3, min, "Minimum should be 3");
    }

    @Test
    public void getMaxValueTest(){
        ArrayTask arrayTask = new ArrayTask();

        arrayTask.getList().addAll(Arrays.asList(12, 45, 3, 88, 7));
        int max = arrayTask.getMaxValue();
        assertEquals(88, max, "Maximum should be 88");
    }

    @Test
    public void getAvgValueTest(){
        ArrayTask arrayTask = new ArrayTask();

        arrayTask.getList().addAll(Arrays.asList(12, 45, 3, 88, 7));
        int avg = arrayTask.getAvgValue();
        assertEquals(31, avg, "Expected AVG to be 31");

    }

    @Test
    public void getOddListTest() {
        ArrayTask arrayTask = new ArrayTask();
        arrayTask.getList().addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        arrayTask.getOddList();

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        assertEquals(expected, arrayTask.getList(), "List should contain only odd numbers");
    }

    @Test
    public void containsNumTest() {
        ArrayTask arrayTask = new ArrayTask();

        arrayTask.getList().addAll(Arrays.asList(1, 45, 3, 88, 7));
        boolean expected = arrayTask.containsNum();
        assertEquals(true, arrayTask.containsNum(),"Number is found");

        arrayTask.getList().addAll(Arrays.asList(0, 45, 3, 88, 7));
        assertNotEquals(false, arrayTask.containsNum(),"Number is not found");
    }

    @Test
    public void listInAscendingOrderTest() {
        ArrayTask arrayTask = new ArrayTask();
        arrayTask.getList().addAll(Arrays.asList(1, 4, 6, 2, 3, 88, 7));

        arrayTask.listInAscendingOrder();

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 7, 88));

        assertEquals(expected, arrayTask.listInAscendingOrder(), "Should return list in descending order ");
//        Collections.sort(getList());
//        System.out.println("Sorted list: " + getList());
    }



}
