package APCSA2023.Lab03_GuessingGame;

//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
    private int upperBound;
    private boolean continuePlaying = true;
    private int failCount = 0;
    private int target;

    private int timeThru = 0;

    /**
     * It's better form to initialize all PIVs in the constructor(s).
     */
    public GuessingGame(int stop)
    {
        this.upperBound = stop;
    }

    public void playGame()
    {
        this.target = ((int)(Math.random()*4))+1;
        int guess;
        this.continuePlaying = true;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number between 1 and " + this.upperBound + " ");
        guess = keyboard.nextInt();
        do {
            if (guess > this.upperBound || guess < 1) {
                System.out.println("Number out of range!");
                System.out.print("Enter a number between 1 and " + this.upperBound + " ");
                guess = keyboard.nextInt();
            }
            else if ((guess >= 1 || guess <= this.upperBound) && guess != target) {
                failCount++;
                timeThru++;
                System.out.print("Enter a number between 1 and " + this.upperBound + " ");
                guess = keyboard.nextInt();

            }
            if (target == guess) {
                System.out.print(this.infoOutput());
                String cont = keyboard.next();
                if (cont.toLowerCase().equals("y")) {
                    this.timeThru++;
                    System.out.print("Guessing Game - how many numbers? ");
                    this.upperBound = keyboard.nextInt();
                    this.playGame();
                } else if (cont.toLowerCase().equals("n")) {
                    System.exit(0);
                } else {
                    System.out.println("Invalid input. Enter y or n");
                    cont = keyboard.next();
                }
            }
        } while (target != guess);


    }

    public boolean getContinuePlaying() {
        return this.continuePlaying;
    }

    /**
     * Your output is incorrect. The number of guesses is off by one. Then, it doesn't reset between games.
     * The percentage is also off on subsequent games.
     */
    public String infoOutput() {
        String toPush = "\nIt took " + this.failCount + " guesses to guess " + this.target +
                ".\nYou guessed wrong " + (int)(((double) failCount/(upperBound))*100) +
                " percent of the time. \n\n\nDo you want to play again? ";
        return toPush;
    }
    public String toString()
    {
        String output= "";
        return output;
    }
}
