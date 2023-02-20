package com.epam.conditions;

public class DaysInMonth {

    private boolean isLeap(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) isLeapYear = true;
        if (year % 100 == 0) isLeapYear = false;
        if (year % 400 == 0) isLeapYear = true;
        return isLeapYear;
    }

    private boolean isNotValidDate(int year, int month) {
        return year < 0 || month < 1 || month > 12;
    }

    public void printDays(int year, int month) {
        if (isNotValidDate(year, month)) {
            System.out.println("invalid date");
            return;
        }

        int numOfDays = switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isLeap(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> throw new IndexOutOfBoundsException("wrong month number");
        };

        System.out.println(numOfDays);
    }

}
