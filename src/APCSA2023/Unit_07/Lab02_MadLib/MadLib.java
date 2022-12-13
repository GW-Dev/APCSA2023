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
		//add code here

	}
	public MadLib(String fileName)
	{
		//load stuff
		try {

			File sentenceFile = new File(fileName);
			Scanner senScan = new Scanner(sentenceFile);
			sen = new ArrayList<String>();
			while (senScan.hasNext()) {
				sen.add(senScan.next());
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
		return verbs.get(randInd);
	}
	
	public String getRandomAdjective()
	{
		int randInd = (int) (Math.random() * adjectives.size());
		return verbs.get(randInd);
	}		

	public String toString()
	{
		for (int j = 0; j < sen.size()+1; j++) {
			if (sen.get())
		}
	   return "\n\n\n";
	}
}