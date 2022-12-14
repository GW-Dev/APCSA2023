//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayStats {
	private String[] array;

	public ArrayStats(String list) {
		//put stuff in the array
		String input = list;
		String modInput = "";
		for (int i = 0; i < input.length()-1; i++) {
			char transStep = input.charAt(i);
			if (!(Character.isWhitespace(transStep))) {
				modInput += transStep;
			}
			array = new String[modInput.length() + 1];
			for (int index = 0; index < array.length-1; index++) {
				array[index] = String.valueOf(modInput.charAt(index));
			}
		}
		array[array.length-1] = input.substring(input.length()-1);
	}

	public void setArray(String list) {
		String input = list;
		String modInput = "";
		for (int i = 0; i < input.length()-1; i++) {
			char transStep = input.charAt(i);
			if (!(Character.isWhitespace(transStep))) {
				modInput += transStep;
			}
			array = new String[modInput.length() + 1];
			for (int index = 0; index < array.length-1; index++) {
				array[index] = String.valueOf(modInput.charAt(index));
			}
		}
		array[array.length-1] = input.substring(input.length()-1);
	}


		public int getNumGroupsOfSize (int size) {
			int groupNum = 0;
			int groupTracker = 0;
			String groupInt = array[0];
			for (int i = 0; i < array.length; i++) {
				if (groupTracker+1 == size) {
					groupNum++;
					out.println("TRUE  " + array[i]);
				}
				if ((groupInt.equals(array[i]))) {
					groupTracker++;

				}
				else if (!(groupInt.equals(array[i]))) {

					groupTracker = 0;
					groupInt = array[i];
				}
			}
			return groupNum;
		}


		public String toString()
		{
			return Arrays.toString(array);
		}
	}