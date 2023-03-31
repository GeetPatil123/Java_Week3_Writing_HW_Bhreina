package java_week3_writing_hw;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
import  java.util.Scanner;
public class Program_12FindInputValue {

    public static void main(String[] args) {
        //scanner declaration to read input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = sca.next().charAt(0);

        //created a object of instance method
        Program_12FindInputValue obj=new Program_12FindInputValue();
        obj.checkInputValueIsAlphabetNumberOrSymbol(ch);
        sca.close();//closing scanner object
    }

    //find the input value is ALPHABET, DIGIT OR SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch){
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }
}
