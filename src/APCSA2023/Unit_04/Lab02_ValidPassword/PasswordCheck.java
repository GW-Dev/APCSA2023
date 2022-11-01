// www.apluscompsci.com
//Name -  

import java.util.Scanner;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		this.password = "mchammergohammer";
	}

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
		String keys;
		do {
			System.out.print("Enter the password :: ");
			keys = keyboard.next();
			if (keys.equals(this.password)) {
				System.out.println("VALID");
			}
			else {
				System.out.println("INVALID");
			}
		} while(!keys.equals(this.password));
	}
}
