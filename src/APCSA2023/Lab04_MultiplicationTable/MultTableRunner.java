package APCSA2023.Lab04_MultiplicationTable;//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		int [][] tc = {
		{5,3,1,9,7},
		{5,7,6,9,8}
		};
		MultTable mt = new MultTable(0, 0);
		for (int x = 0 ;x < 5; x++) {
			mt.setNumStop(tc[0][x], tc[1][x]);
			mt.printTable();
		}

	}
}
