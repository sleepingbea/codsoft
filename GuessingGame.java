import java.util.Random;
import java.util.Scanner;

public class    GuessingGame{
public static void main(String[] args) {
int totalRounds = 0;
int totalWins = 0;
int totalAttempts = 0;

Scanner input = new Scanner(System.in);

while (true) {
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("-------------------------------");

int min = 1;
int max = 100;

Random random = new Random();
int numberToGuess = random.nextInt(max - min + 1) + min;

int numberOfTries = 0;

int maxAttempts = 6;

while (numberOfTries < maxAttempts) {
System.out.print("Enter your guess (between " + min + " and " + max + "): ");
int userGuess = input.nextInt();

numberOfTries++;

if (userGuess == numberToGuess) {
System.out.println(" Congratulations! You guessed the correct number in " + numberOfTries + " attempts.");
totalWins++;
totalAttempts += numberOfTries;
break;
} else if (userGuess < numberToGuess) {
System.out.println("Your guess is too low. Try again!");
} else {
System.out.println("Your guess is too high. Try again!");
}
}

if (numberOfTries == maxAttempts) {
System.out.println("Sorry, you didn't guess the number. The correct answer was " + numberToGuess + ".");
}

System.out.print("Do you want to play again? (yes/no): ");
String response = input.next();

if (response.equalsIgnoreCase("no")) {
break;
}

totalRounds++;
}

System.out.println("-------------------------------");
System.out.println("Game Over!");
System.out.println("Your score: " + totalWins + " wins out of " + totalRounds + " rounds.");
System.out.println("Average attempts per round: " + (totalAttempts / totalRounds));
}
}