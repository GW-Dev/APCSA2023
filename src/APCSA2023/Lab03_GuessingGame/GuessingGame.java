package APCSA2023.Lab03_GuessingGame;//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private boolean continuePlaying = true;
	private int failCount = 0;

	private int timeThru = 0;

	public GuessingGame(int stop)
	{
		this.upperBound = stop;
	}

	public void playGame()
	{
		int guess;
		this.continuePlaying = true;
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.print("Enter a number between 1 and " + this.upperBound + " ");
			guess = keyboard.nextInt();

			if (guess > this.upperBound || guess < 1) {
				System.out.println("Number out of range!");
				System.out.print("Enter a number between 1 and " + this.upperBound + " ");
				guess = keyboard.nextInt();
			}
			else if (guess >= 1 || guess <= this.upperBound) {
				System.out.print("Enter a number between 1 and " + this.upperBound + " ");
				guess = keyboard.nextInt();
				this.failCount++;
			}


			if (guess == this.upperBound) {
				System.out.print(this.infoOutput());
				String cont = keyboard.next();
				if (cont.toLowerCase() == "y") {
					this.timeThru++;
					this.playGame();
				} else if (cont.toLowerCase() == "n") {
					System.exit(0);
				} else {
					System.out.println("Invalid input. Enter y or n");
					cont = keyboard.next();
				}
			}
		} while (upperBound != guess);


	}

	public boolean getContinuePlaying() {
		return this.continuePlaying;
	}
	public String infoOutput() {
		String toPush = "\nIt took " + this.failCount + " guesses to guess " + this.upperBound + ".\nYou guessed wrong " + String.format("%.0f", ((int) this.failCount/ (this.timeThru + this.failCount)))+ " percent of the time. \n\nDo you want to play again? ";
		return toPush;
	}
	public String toString()
	{
		String output= "";
		return output;
	}
}
