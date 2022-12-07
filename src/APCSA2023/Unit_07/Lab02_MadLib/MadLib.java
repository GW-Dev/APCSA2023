//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		//add code here
	}

	public MadLib(String fileName)
	{
		//load stuff
		try{
			Scanner file = new Scanner(new File(fileName));
			//add code here		
		}
		catch(Exception e){
			out.println("Houston we have a problem!");
		}		
	}

	public void loadNouns()
	{
		try{		
			//add code here
		}
		catch(Exception e)
		{
		}			
	}
	
	public void loadVerbs()
	{
		try{	
			//add code here
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
			//add code here	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		return "";
	}
	
	public String getRandomNoun()
	{
		return "";
	}
	
	public String getRandomAdjective()
	{
		return "";
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}