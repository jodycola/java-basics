import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number = 0;
        
        do {
            System.out.println("Guess a number 1-10");
            number = input.nextInt();
        } while (number != 3);
            System.out.println("You guessed 3!");
    }
    
}
