package com.softserve.edu;

import java.util.*;

public class ArrayTask {
    private ArrayList<Integer> arrayList = new ArrayList<>();

//    public ArrayTask(ArrayList<Integer> arrayList) {
//        this.arrayList = arrayList;
//    }
    public ArrayList<Integer> getList() {
        return arrayList;
    }


    public void getArrayList() {
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            getList().add(random.nextInt(100));
        }
        System.out.println("Array List: " + getList());
    }

    public int getMinValue(){
        int min = getList().get(0); // assume the first value is the smallest
        for (int num : getList()) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int getMaxValue(){
        int max = getList().get(0); // assume the first value is the smallest
        for (int num : getList()) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int getAvgValue() {
        int sum = 0;
        int count = 0;
        for (int num : getList()) {
            sum += num;
            count++;
        }
        int result = sum / count;
        return result;
    }

    public void getOddList() {
        Iterator<Integer> iterator = getList().iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove(); // Safe way to remove elements
            }
        }
        System.out.println("Odd list: " + getList());
    }

    public boolean containsNum(){
        boolean found = false;
        for (int num : getList()){
            if (num == 1) {
                found = true;
                System.out.println("Number is found! ");
            }
        }

        if (!found) {
            System.out.println("Number not found!");
        }
        return found;
    }
    public ArrayList<Integer> listInAscendingOrder() {
        Collections.sort(getList());
        System.out.println("Sorted list: " + getList());
        return getList();
    }


    public static void main(String[] args) {
        ArrayTask arrayTask = new ArrayTask();
        arrayTask.getArrayList();
        arrayTask.getMinValue();
        arrayTask.getMaxValue();
        arrayTask.getAvgValue();
        arrayTask.getOddList();
        arrayTask.containsNum();
        arrayTask.listInAscendingOrder();
    }
}


