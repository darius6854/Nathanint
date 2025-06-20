package nathanrandom;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 344_13
 */
public class NathanRandom {

    public static void main(String[] args) {
        int numRandom;
        int numGuess;
        int count = 0;
        int maxAttempts = 3; // allow 3 guesses
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        numRandom = ran.nextInt(5); // random number from 0 to 4

        System.out.println("Guess the number (between 0 and 4):");

        while (count < maxAttempts) {
            System.out.print("Enter your guess: ");
            numGuess = scan.nextInt();
            count++;

            if (numGuess == numRandom) {
                System.out.println(" You win!");
                return; // exit the program
            } else if (numGuess > numRandom) {
                System.out.println("Too high! Try a smaller number.");
            } else {
                System.out.println("Too low! Try a larger number.");
            }

            if (count < maxAttempts) {
                System.out.println("Attempts left: " + (maxAttempts - count));
            }
        }

        System.out.println(" You lose! The correct number was: " + numRandom);
    }
}
