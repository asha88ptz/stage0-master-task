package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        int cipher = first ^ second;
        first = cipher ^ first;
        second = cipher ^ second;

        System.out.println(first);
        System.out.println(second);
    }

}
