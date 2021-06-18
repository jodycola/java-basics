import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User name input
        try {
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Your name is " + name);

        // User first number input
        System.out.println("Please enter first number");
        int firstNum = input.nextInt();

        // User second number input
        System.out.println("Please enter second number");
        int secondNum = input.nextInt();

        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + (firstNum + secondNum));
        }
        // Close method to prevent resource leak
        finally {
            input.close();
        }
    }
    
}
