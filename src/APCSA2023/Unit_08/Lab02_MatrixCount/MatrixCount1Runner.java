//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		int[] numList = {7, 8, 6, 21};
		for (int l = 0; l < numList.length; l++) {
			int num = numList[l];
			System.out.println("The " + num + " count is :: " + MatrixCount1.count(num));
	}

	}
}



