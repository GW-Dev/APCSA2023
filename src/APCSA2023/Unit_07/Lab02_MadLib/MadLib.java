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

	private ArrayList<String> sen;

	
	public MadLib()
	{
		this.loadVerbs();
		this.loadNouns();
		this.loadAdjectives();
	}
	public MadLib(String fileName)
	{
		//load stuff
		this()
		try {
			Scanner file = new Scanner(new File(fileName));
			sen = new ArrayList<String>();
			while (file.hasNext()) {
				sen.add(file.next());
			}

		}
		catch(Exception e){
			out.println("senLoad Exception");
		}
	}

	public void loadNouns()
	{
		try{
			nouns = new ArrayList<String>();
			Scanner nounLoader = new Scanner(new File("src/APCSA2023/Unit_07/Lab02_MadLib/nouns.dat"));
			while (nounLoader.hasNextLine()) {
				String nounLine = nounLoader.nextLine();
				nouns.add(nounLine);
			}
			nouns.remove(nouns.size()-1);
			nouns.remove(nouns.size()-1);
			out.println(nouns);
		}
		catch(Exception e)
		{
			out.println("loadNoun exception");
		}			
	}
	
	public void loadVerbs()
	{
		try{
			verbs = new ArrayList<String>();
			Scanner verbLoader = new Scanner(new File("src/APCSA2023/Unit_07/Lab02_MadLib/verbs.dat"));
			while (verbLoader.hasNextLine()) {
				String verbLine = verbLoader.nextLine();
				verbs.add(verbLine);
			}
			verbs.remove(verbs.size()-1);
			verbs.remove(verbs.size()-1);
			out.println(verbs);
		}
		catch(Exception e)
		{
			out.println("loadVerb exception");
		}
	}

	public void loadAdjectives()
	{
		try{
			//add code here
			adjectives = new ArrayList<String>();
			Scanner adjLoader = new Scanner(new File("src/APCSA2023/Unit_07/Lab02_MadLib/adjectives.dat"));
			while (adjLoader.hasNextLine()) {
				String adjLine = adjLoader.nextLine();
				adjectives.add(adjLine);
			}
			adjectives.remove(adjectives.size()-1);
			adjectives.remove(adjectives.size()-1);
			out.println(adjectives);
		}
		catch(Exception e)
		{
			out.println("loadAdj exception");
		}
	}

	public String getRandomVerb()
	{
		int randInd = (int) (Math.random() * verbs.size());
		return verbs.get(randInd);
	}
	
	public String getRandomNoun()
	{
		int randInd = (int) (Math.random() * nouns.size());
		return nouns.get(randInd);
	}
	
	public String getRandomAdjective()
	{
		int randInd = (int) (Math.random() * adjectives.size());
		return adjectives.get(randInd);
	}		

	public String toString()
	{
		String toReturn = "";
		for (int i = 0; i < sen.size(); i++) {
			if (sen.get(i).equals(Character.toString('#'))) {
				sen.set(i, getRandomNoun());
			} else if (sen.get(i).equals(Character.toString('@'))) {
				sen.set(i, getRandomVerb());
			} else if (sen.get(i).equals(Character.toString('&'))) {
				sen.set(i, getRandomAdjective());
			}
		}
	   for (int j = 0; j < sen.size(); j++) {
		   if (j + 1 < sen.size()) {
			   toReturn += sen.get(j) + " ";
		   }
		   else if (j + 1 >= sen.size()) {
			   toReturn += sen.get(j);
		   }

	   }
	   return toReturn;
	}
}