
import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);
        System.out.println("Enter any message : ");
        String welcomeMessage = scanInput.next();
        System.out.println("This is  " + welcomeMessage);

    }
}
