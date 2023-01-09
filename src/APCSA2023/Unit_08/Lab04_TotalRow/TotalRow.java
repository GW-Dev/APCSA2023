//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
        int rowSum = 0;
        List<Integer> toReturn = new ArrayList<>();
    	//add code here
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                rowSum += m[i][j];
                if (m[i].length - 1== j) {
                    toReturn.add(rowSum);
                    rowSum = 0;
                }
            }
        }
		return toReturn;
    }
}
