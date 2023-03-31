package java_week3_writing_hw;

import java.util.Scanner;
public class Program1_OddEvenTernaryOperator {


    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = sca.nextInt();
        isEvenOrOddN(number);

        sca.close();//closing the scanner object
    }
    //checking the number is even or odd
    public static void isEvenOrOddN(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}
