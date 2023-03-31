package java_week3_writing_hw;
/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Prrogram11_DividedByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Numbers divided by 3 are: ");
        for (int i = 1; i <= 100; i++){
            dividedByThree(i);
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println("numbers divided by 5: ");
        for (int x = 1; x <= 100; x++){
            dividedByFive(x);
        }
    }

    //divided by three method
    public static void dividedByThree(int number){
        if (number % 3 == 0){
            System.out.println(number + ",");
        }
    }

    //divided by five method
    public static void dividedByFive(int number){
        System.out.println(number + ",");
    }
}
