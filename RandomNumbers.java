import java.util.Scanner;
import java.util.Random;

class RandomNumber {
    private int secretNumber;

    public RandomNumber() {
        Random rand = new Random();
        this.secretNumber = rand.nextInt(100) + 1;  // Generates a number between 1 and 100
    }

    public int getSecretNumber() {
        return this.secretNumber;
    }
}

class GuessingGame {
    private static final int MAX_ATTEMPTS = 10;

    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        int secretNumber = randomNumber.getSecretNumber();
        int attempts = 0;
        boolean guessedCorrectly = false;

        Scanner sc = new Scanner(System.in);

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Guess the number (between 1 and 100): ");
            String input = sc.nextLine();

            int guess;

            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
                continue;
            }

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
                continue;
            }

            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } 
            else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } 
            else {
                System.out.println("Congratulations! You've guessed the number correctly in " + attempts + " attempts.");
                guessedCorrectly = true;
                break;
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry! You've exhausted all attempts. The secret number was: " + secretNumber);
        }

        sc.close();
    }
}