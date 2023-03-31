package java_week3_writing_hw;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Program17_SortArray {
    public static void main(String[] args) {
        //numeric array declaration
        int[] numArray = {1789, 2035, 2040, 1950, 2255, 7897, 1455, 787};

        //string array declaration
        String[] strArray = {"Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra",
                "Peter", "Kilo"};
        System.out.println("Actual Numerical Array is: " + Arrays.toString(numArray));

        //sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array was: " + Arrays.toString(strArray));
        System.out.println("");
        System.out.println("Actual String Array  was: " + Arrays.toString(strArray));

        //sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));
    }

}
