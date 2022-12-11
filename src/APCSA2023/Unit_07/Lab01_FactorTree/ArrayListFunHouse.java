//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{

	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> factorList = new ArrayList<>();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				factorList.add(i);
			}
		}
		return factorList;
	}
	
	public static void keepOnlyCompositeNumbers( List<Integer> nums ) {
		List<Integer> compositeList = new ArrayList<>();
		int lastFactor = nums.get(nums.size()-1);

		for (int j = 2; j < Math.sqrt(lastFactor); j++) {
			for (int k = 0; k < nums.size()-1; k++) {
				if (nums.get(k) % j == 0 && j != nums.get(k)) {
					if (nums.get(k) > Math.sqrt(nums.get(k))) {
						compositeList.add(nums.get(k));
						out.println(compositeList);
					}
				}
			}
		}
		for (int l = 0; l < compositeList.size()-1; l++) {
			if (!(nums.contains(compositeList.get(l)))) {
				nums.remove()
			}
		}

	}
}