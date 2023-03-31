package java_week3_writing_hw;
/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */
import java.util.Scanner;
public class Program9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F:  ");
        String city = sca.next().toUpperCase();

        // created object a calling instance method
        Program9_PrintCityNameWithSwitch obj=new Program9_PrintCityNameWithSwitch();
        obj.printCityName(city);

        sca.close();//closing scanner object

    }
    //printing city name
     public void printCityName(String city){
        switch (city){
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you entered is not between A to F: ");

        }
     }
}
