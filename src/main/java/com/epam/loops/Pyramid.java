package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int fillWidth = cathetusLength - 1;
        int start = 1;

        while(fillWidth >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" ".repeat(fillWidth));
            for (int i = start; i > 1 ; i--) {
                sb.append(i);
            }
            sb.append("1");
            for (int i = 2; i <= start ; i++) {
                sb.append(i);
            }
            System.out.println(sb.toString());
            start++;
            fillWidth--;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
