import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
Welcome to the Number Guessing Game!
Here are the rules of the game:
1. There are 3 difficult levels. Easy, Medium, Hard.
Easy gives you 10 chances to guess the number.
Medium gives you 5 chances to guess the number.
Hard gives you 3 chances to guess the number.
2. At the beginning of the game, the computer will pick a random number from 1-100.
3. You will have X chances to guess the correct number.
Enjoy!
""");
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick your difficulty (1 (easy),2 (medium),or 3 (hard)): ");
        int difficulty = sc.nextInt();

        int guesses = 0;
        if (difficulty == 1) guesses = 10;
        else if (difficulty == 2) guesses = 5;
        else guesses = 3;

        System.out.println("You chose difficulty level " + difficulty + ". this gives you " + guesses + " guesses!");
        Random rand = new Random();
        int winningNumber =  rand.nextInt(1,101);

        while (guesses != 0) {
            System.out.println("You have " + guesses + " remaining.");
            guesses--;
            System.out.println("Enter a number from 1-100: ");
            int guess = sc.nextInt();
            if (guess == winningNumber) {
                System.out.println("Congratulations! You guessed the correct number. You had " + guesses + " remaining.");
                break;
            } else if (guess > winningNumber && guesses > 0) {
                System.out.println("Incorrect guess you were too high. Try again.");
            } else if (guess < winningNumber && guesses > 0) {
                System.out.println("Incorrect guess, you were too low. Try again.");
            } else {
                System.out.println("You ran out of guesses. GAME OVER!");
            }
        }
    }
}