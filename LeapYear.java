import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        int year;

        System.out.println("Enter an Year : ");
        Scanner scanInput = new Scanner(System.in);
        year = scanInput.nextInt();

        // Checking the conditions True or False!

        if (year % 400 == 0){
            System.out.println(year + " is a Leap Year ");
        }
        else if (year % 100 != 0 ){
            System.out.println(year + " is a Leap Year ");
        }
        else if (year % 4 == 0 ){
            System.out.println(year + " is a Leap Year ");
        }
        else {
            System.out.println(year + " is not a Leap Year");

        }
    }

}



