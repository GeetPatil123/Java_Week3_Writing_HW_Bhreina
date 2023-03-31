package java_week3_writing_hw;

/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Program2_LeapYear {

    public static void main(String[] args) {
        //scanner declaration for reading the input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = sca.nextInt();
        Program2_LeapYear obj = new Program2_LeapYear();
        obj.isItLeapYear(year);
        sca.close();//closing the scanner object
    }

    //checking is it leap year or not
    public void isItLeapYear(int year){
        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The year " + year + " is a leap year: ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year: ");
    }
}
