//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.lang.Math.*;

class Triples
{
	private int number;

	public Triples(int num)
	{
		number = num;
	}

	private int gcdByEuclidsAlgorithm(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		return gcdByEuclidsAlgorithm(n2, n1 % n2);
	}
	private String greatestCommonFactor(int upB)
	{
		double cDec;
		String squaresToReturn = "";
		for (int a = 1; a < upB; a++) {
			for (int b = 1; b < upB; b++) {
				for (int c = 1; c < upB; c++) {
					cDec = Math.sqrt((double) a * a + b * b);
					if (b > a && c == Math.sqrt((double) a * a + b * b) && c == Math.round(Math.sqrt((double) a * a + b * b))) {
						if (c == Math.round(cDec) && (int) cDec == c && !(squaresToReturn.contains(b + " " + a))) {
							if (((a % 2 == 0 && b % 2 != 0) || (a % 2 != 0 && b % 2 == 0)) && (c % 2 != 0)) {
								if (gcdByEuclidsAlgorithm(a, b) <= 1) {
									squaresToReturn += ("\n" + a + " " + b + " " + c);
								}
							}
						}
					}
				}
			}
		}
		return squaresToReturn;
	}

	public String toString()
	{
		double cDec;
		String output = "";
		for (int a = 1; a < this.number; a++) {
			for (int b = 1; b < this.number; b++) {
				for (int c = 1; c < this.number; c++) {
					cDec = Math.sqrt((double) a * a + b * b);
					if (b > a && c == Math.sqrt((double) a * a + b * b) && c == Math.round(Math.sqrt((double) a * a + b * b))) {
						if (c == Math.round(cDec) && (int) cDec == c && !(output.contains(b + " " + a))) {
							if (((a % 2 == 0 && b % 2 != 0) || (a % 2 != 0 && b % 2 == 0)) && (c % 2 != 0)) {
								if (gcdByEuclidsAlgorithm(a, b) <= 1) {
									output += ("\n" + a + " " + b + " " + c);
								}
							}
						}
					}
				}
			}
		}
		return output;
	}
}