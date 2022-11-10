import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretNumber = 30;
        System.out.println("Guess a number: ");
        Scanner reader = new Scanner(System.in);
        int checkNumber = reader.nextInt();

        if (checkNumber > 30) {
        System.out.println("Your guess is too high!");
        } else if (checkNumber < 30 ) {
            System.out.println("Your guess is too low!");
        } else if (checkNumber == secretNumber) {
            System.out.println("Correct!");
        }
    }
}

