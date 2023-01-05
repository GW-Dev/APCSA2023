// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayStats {
	private int[] array;


	public ArrayStats(String list) {
		//put stuff in the array
		setArray(list);
	}

	public void setArray(String list) {
		String input = list;
		String modInput = "";
		for (int i = 0; i < input.length()-1; i++) {
			char transStep = input.charAt(i);
			if (!(Character.isWhitespace(transStep))) {
				modInput += transStep;
			}
			array = new int[modInput.length() + 1];
			for (int index = 0; index < array.length-1; index++) {
				array[index] = Integer.parseInt(String.valueOf(modInput.charAt(index)));
			}
			array[array.length-1] = Integer.parseInt(String.valueOf(input.charAt(input.length()-1)));
		}

	}


		public int getNumGroupsOfSize(int size) {
			int groupNum = 0;
			int groupTracker = 0;
			int groupInt = array[0];
			for (int i : array) {
				if (groupTracker == size) {
					groupNum++;
					out.println("TRUE  " + i);
				}
				if ((groupInt == (i))) {
					groupTracker++;

				}
				else if (!(groupInt == (i))) {
					groupTracker = 0;
					groupInt = i;
					out.println("BREAK  " + i);
				}
			}
			return groupNum;
		}


		public String toString()
		{
			return Arrays.toString(array);
		}
	}