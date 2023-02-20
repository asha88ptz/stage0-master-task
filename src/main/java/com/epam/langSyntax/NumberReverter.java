package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        int res = 0;
        while (number != 0) {
            int nextDigit = number % 10;
            res *= 10;
            res += nextDigit;
            number -= nextDigit;
            number /= 10;
        }
        System.out.println(res);
    }

}
