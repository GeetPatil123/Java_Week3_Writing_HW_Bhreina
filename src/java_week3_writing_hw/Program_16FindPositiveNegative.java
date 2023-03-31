package java_week3_writing_hw;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
import java.util.Scanner;
public class Program_16FindPositiveNegative {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sca.nextInt();

        //calling static method in main method
       findNumberIsPositiveOrZero(number);
       sca.close();//closing scanner object
    }

    //finding the number positive, negative or Zero
    public static void findNumberIsPositiveOrZero(int number){
        if (number > 0){
            System.out.println(number + " is a Positive Number: ");
        } else if (number < 0) {
            System.out.println(number + " is a Negative Number: ");
        } else {
            System.out.println(number + " is Zero: ");
        }
    }
}
