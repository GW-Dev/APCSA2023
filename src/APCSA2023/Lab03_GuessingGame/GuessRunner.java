package APCSA2023.Lab03_GuessingGame;

//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import java.util.Scanner;

import static java.lang.System.*;

public class GuessRunner {
    public static void main(String args[]) {
        boolean isPlaying = true;
        Scanner keyboard = new Scanner(System.in);
        int response;
        while (isPlaying) {
            System.out.print("Guessing Game - how many numbers? ");
            response = keyboard.nextInt();
            GuessingGame goodGame = new GuessingGame(response);
            goodGame.playGame();
            if (goodGame.getContinuePlaying()) {

            }


        }
    }
}
