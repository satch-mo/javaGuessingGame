/*

A number-guessing game.

*/
import java.util.Scanner;
import java.util.Random;

public class Game {
  public static void main(String[] args){
    System.out.println("Howdy, what's your name?");
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();  // Get user input for name
    System.out.println("Hey " + name + ", I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess my number.");

    Random rand = new Random();
    int numberToGuess = rand.nextInt(100);
    int guessCount = 0;

    int guess;
    boolean win = false;

    while (win == false) {
      try {
        guess = Integer.parseInt(input.nextLine());
        guessCount++;
        if (guess > numberToGuess) {
          System.out.println("Your guess is too high");
        } else if (guess < numberToGuess) {
          System.out.println("Your guess is too low");
        } else {
          win = true;
          System.out.println("Congratulations! The number was " + numberToGuess + ". You guessed my number in " + guessCount + " tries!");
        }
      }  catch(Exception e){//error handling
        System.out.println("Follow the directions!");
      }
    }
  }
}
