import java.util.Scanner;

public class StringsComparison {
    public static void main(String[] args) {

        // Checking if two Strings are Equal or not!

        String stringOne, stringTwo;                        // declaring the data type and variables

        Scanner scanInput = new Scanner(System.in);         // Taking user input
        System.out.println("Enter First String : ");        // Printing Message for User
        stringOne = scanInput.next();                       // Assigning user input to variable

        System.out.println("Enter Second String : " );
        stringTwo = scanInput.next();

        /* Using conditional statement to check
         * if strings are equal or not
         */

        if (stringOne.equals(stringTwo))
            System.out.println("Strings are Equal!");
        else
            System.out.println("Strings are not Equal!");

    }
}
