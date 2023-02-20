package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isValidTriangle = true;
        if (firstSide + secondSide <= thirdSide) {
            isValidTriangle = false;
        } else if (secondSide + thirdSide <= firstSide) {
            isValidTriangle = false;
        } else if (thirdSide + firstSide <= secondSide) {
            isValidTriangle = false;
        }

        if (isValidTriangle) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

}
