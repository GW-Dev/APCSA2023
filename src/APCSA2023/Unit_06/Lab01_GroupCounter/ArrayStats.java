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
		array[array.length-1] = input.substring(input.length()-1, input.length());
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


		public int getNumGroupsOfSize (int size)
		{
			int groupNum = 0;
			String[] groupNumArr = new String[size];
			String[] singleArr = new String[size];
			for (int i = 0; i < array.length; i+=(size)) {
				for (int j = 0; j < size; j++) {
					groupNumArr[j] = array[i];
					Arrays.fill(singleArr, groupNumArr[0]);
					if ((groupNumArr[j] != null && singleArr[j] != null)) {
						out.println("Single Array " + Arrays.toString(singleArr) + " Group Array " + Arrays.toString(groupNumArr));
						if (Arrays.equals(groupNumArr,singleArr) && j % size == 0) {
							out.println("CHOSEN: Single Array " + Arrays.toString(singleArr) + " Group Array " + Arrays.toString(groupNumArr));
							groupNum++;
						}
					}

				}
			}
			return groupNum;
		}

		public String toString()
		{
			return Arrays.toString(array);
		}
	}