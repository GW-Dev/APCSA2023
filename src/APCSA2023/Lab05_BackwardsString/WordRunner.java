package APCSA2023.Lab05_BackwardsString;//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		String[] tc = {
				"Hello", "World", "JukeBox", "TCEA", "TAPPS"
		};
		Word world = new Word("");
		for (int i = 0; i < 5; i++) {
			world.setWord(tc[i]);
			System.out.println(world);
		}


	}
}
