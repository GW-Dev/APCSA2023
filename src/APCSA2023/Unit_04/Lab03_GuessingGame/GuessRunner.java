//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import java.util.Scanner;

public class GuessRunner {
    public static void main(String args[]) {
        boolean isPlaying = true;
        Scanner keyboard = new Scanner(System.in);
        int response;
        do {
            System.out.print("Guessing Game - how many numbers? ");
            response = keyboard.nextInt();
            GuessingGame goodGame = new GuessingGame(response);
            goodGame.playGame();
        } while (isPlaying);
    }
}
