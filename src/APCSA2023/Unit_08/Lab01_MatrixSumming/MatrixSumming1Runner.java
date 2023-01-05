//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming1Runner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] m = MatrixSumming1.getArr();
		String prettyMatrix = "";
		int initRow = 0;
		int rowLength = m[0].length;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				prettyMatrix += m[i][j] + " ";
				if (i == initRow || (i == 0 && (m[i].equals(rowLength)))) {
					initRow++;
					prettyMatrix += "\n";

				}
			}
		}
		//add code here
		out.println("Matrix values\n" + prettyMatrix + "\n");
		out.println("The sum is :: " + MatrixSumming1.sum());
	}
}



