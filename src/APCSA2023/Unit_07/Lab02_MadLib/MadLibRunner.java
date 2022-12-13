//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MadLibRunner
{
	public static void main( String args[] )
	{
		//make a new MadLib
		MadLib monkeyBusiness = new MadLib("src/APCSA2023/Unit_07/Lab02_MadLib/story.dat");
		out.println(monkeyBusiness);
	}
}