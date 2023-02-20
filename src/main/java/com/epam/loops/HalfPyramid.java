package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(" ".repeat(cathetusLength - i));
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
