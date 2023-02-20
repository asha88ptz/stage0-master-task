package com.epam.conditions;

public class SeasonDeterminer {
//    public static void main(String[] args) {
//        (new SeasonDeterminer()).tellTheSeason(12);
//    }

    public void tellTheSeason(int monthNumber) {
        // "1" -> "Winter", 0 -> "Wrong month number"
        String result = switch (monthNumber) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Wrong month number";
        };
        System.out.println(result);
    }

}
