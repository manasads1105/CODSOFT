package project_1;
import java.util.Random;
import java.util.Scanner;

public class Number_Game {

	public static void main(String[] args) 
	{
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        int minNumber = 1; // Minimum value for the generated number
		        int maxNumber = 100; // Maximum value for the generated number
		        int maxAttempts = 10; // Maximum number of attempts allowed per round

		        int totalScore=0;
		        int round = 1;

		        System.out.println("Welcome to the Number Guessing Game!");
		        System.out.println("You have " + maxAttempts + " attempts to guess the number between " + minNumber + " and " + maxNumber + ".");

		        do {
		            int secretNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
		            int attempts = 0;
		            int guess;

		            System.out.println("\nRound " + round + ":");
		            do {
		                System.out.print("Enter your guess: ");
		                guess = scanner.nextInt();
		                attempts++;

		                if (guess < secretNumber) {
		                    System.out.println("Too low,Try again!.");
		                } 
		                else if (guess > secretNumber) 
		                {
		                    System.out.println("Too high,Try again!.");
		                } 
		                else 
		                {
		                    System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
		                    totalScore += (maxAttempts - attempts + 1);
		                    break;
		                }

		                if (attempts == maxAttempts)
		                {
		                    System.out.println("You have used all your attempts. The guessed number was: " + secretNumber);
		                }
		            } 
		            while (attempts < maxAttempts);

		            round++;

		            System.out.print("Do you want to play another round? (yes/no): ");
		            String playAgain = scanner.next();
		            if (!playAgain.equalsIgnoreCase("yes")) {
		                break;
		            }
		        } while (true);

		        System.out.println("Thank you for playing!");
		        System.out.println("Your users score: " + totalScore);

		        scanner.close();
		    }
		}

	