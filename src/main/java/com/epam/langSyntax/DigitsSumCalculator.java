package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int total = 0;
        while (number != 0) {
            int nextDigit = number % 10;
            total += nextDigit;
            number /= 10;
        }
        System.out.println(total);
    }

}
