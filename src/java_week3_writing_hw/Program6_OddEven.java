package java_week3_writing_hw;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class Program6_OddEven {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number = sca.nextInt();
        Program6_OddEven obj=new Program6_OddEven();
        obj.isItEvenOrOddNumber(number);
        System.out.println(number + " is " + obj.isItEvenOrOddNumber(number) + " number ");

        sca.close();// closing scanner object
    }

    //checking the odd or even
    public String  isItEvenOrOddNumber(int number){
        if (number % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }





}
