package java_week3_writing_hw;
/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
import java.util.Scanner;
public class Program10_DoOperationWithSymbol {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sca.nextInt();
        System.out.println("Enter second number: ");
        int y = sca.nextInt();
        System.out.println("Please select the calculation symbole +,-,*,/, ");
        char symbol = sca.next().charAt(0);
        //calling static method directly as its static
        doOperationBtSelectingSymbol(x, y, symbol);
        sca.close();//closing scanner object
    }

    //calculating operation based on symbol
    public static void doOperationBtSelectingSymbol(int x,int y,char symbol){
        if (symbol == '+'){
            System.out.println(x + " + " + y + " = " + (x+y));
        } else if (symbol == '-') {
            System.out.println(x + " - " + y + " = " + (x-y));
        } else if (symbol == '*') {
            System.out.println(x + " * " + y + " = " + (x*y));
        } else if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x/y));
        }else {
            System.out.println("Please enter correct symbol +,-,*,/ ");
        }
    }
}
