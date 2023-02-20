package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        long res = 1;
        while(power > 0) {
            res *= numberToPrint;
            power--;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
