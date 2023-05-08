
import java.util.Scanner;

public class DataTypes {
     public static void main(String[] args) {

        /*Printing All Data Types
        * by Taking Input From User*/

         Scanner ScanInput = new Scanner(System.in);
         System.out.println("Enter a Number : ");
         int number = ScanInput.nextInt();
         System.out.println("The Number is : "+number);
         System.out.println("Enter a Name");
         String Name = ScanInput.next();
         System.out.println("The name is : " +Name);
         System.out.println("Enter a Double : ");
         double DoubleNum = ScanInput.nextDouble();
         System.out.println("The Double Number is : " +DoubleNum);
         System.out.println("Enter a Long Number : ");
         long LongNum = ScanInput.nextLong();
         System.out.println("The Long Number is : " +LongNum);
         System.out.println("Enter a Float Number : ");
         float FloatNum = ScanInput.nextFloat();
         System.out.println("The Float Number is : " +FloatNum);

    }
}
