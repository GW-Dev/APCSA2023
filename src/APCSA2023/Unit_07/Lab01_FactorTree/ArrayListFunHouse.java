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

public class ArrayListFunHouse {

	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> factorList = new ArrayList<Integer>();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				factorList.add(i);
			}
		}
		return factorList;
	}
	public static boolean primeTest(int n) {
		if (n == 2 || n == 3) {
			return true;
		}
		if (n <= 1 || n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int l = 5; l*l <= n; l+=6) {
			if (n % l == 0 || n % (l+2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void keepOnlyCompositeNumbers(List<Integer> nums) {
		for (int i = 0; i <= nums.size(); i++) {
			if (primeTest(nums.get(i))) {
				nums.remove(nums.get(i));
			}
		}
	}
}