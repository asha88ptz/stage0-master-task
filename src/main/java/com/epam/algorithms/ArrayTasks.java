package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] arr = new int[length];
        for (int i = 1; i <= length; i++)
            arr[i-1] = i;
        return arr;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int total = 0;
        for (int elem: arr) {
            total += elem;
        }
        return total;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
                return i;
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] buff = new int[arr.length]; int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                buff[size++] = arr[i];
            }
        }
        int[] res = new int[size];
        System.arraycopy(buff, 0, res, 0, size);
        return res;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        int[][] sorted = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            // fill new row
            int[] ragged = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                ragged[j] = arr[i][j];
                // find the place
                for (int k = 0; k < j; k++) {
                    if (ragged[j] < ragged[k]) {
                        int t = ragged[j];
                        // shift to the right
                        for (int l = j; l > k; l--) {
                            ragged[l] = ragged[l - 1];
                        }
                        // insert
                        ragged[k] = t;
                        break;
                    }
                }
            }
            sorted[i] = ragged;
            // find the place
            for (int k = 0; k < i; k++) {
                if (sorted[i].length < sorted[k].length) {
                    int[] ta = sorted[i];
                    // shift to the right
                    for (int l = i; l > k; l--) {
                        sorted[l] = sorted[l - 1];
                    }
                    // insert
                    sorted[k] = ta;
                    break;
                }
            }
        }
        return sorted;
    }

}
