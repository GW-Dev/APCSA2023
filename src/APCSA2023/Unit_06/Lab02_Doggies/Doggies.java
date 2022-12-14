//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		int oldest = 0;
		String oldName = "";
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > oldest) {
				oldest = pups[i].getAge();
				oldName = pups[i].getName();
			}
		}
		return oldName;
	}

	public String getNameOfYoungest()
	{
		int youngest = 100;
		String youngName = "";
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() < youngest) {
				youngest = pups[i].getAge();
				youngName = pups[i].getName();
			}
		}
		return youngName;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}