package java_week3_writing_hw;
/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Program13_FindTheDayName {
    public static void main(String[] args) {
        //scanner declaration to read input from console
        Scanner sca = new Scanner(System.in);
        System.out.println("Input a number between 1 to 7: ");
        int day = sca.nextInt();
        //calling a static method
        findTheDayName(day);

        sca.close();//closing scanner object
    }

    //finding the name of the day
    public static void findTheDayName(int day){
        switch (day){
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("A Week contains 1 to 7 days: ");
        }
    }
}
