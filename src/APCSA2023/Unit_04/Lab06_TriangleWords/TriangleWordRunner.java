//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleWordRunner
{
   public static void main(String args[])
   {
       String[] tc = new String[] {"WOW", "BEN", "SAMMY", "WILE", "APLUSCOMPSCI"};
       for (int e = 0; e < 5; e++) {
           TriangleWord tw = new TriangleWord("");
           tw.setWord(tc[e]);
           System.out.println(tw);
           System.out.println("\n");
       }
	}
}