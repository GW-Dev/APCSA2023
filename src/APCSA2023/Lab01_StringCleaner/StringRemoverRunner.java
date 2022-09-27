package APCSA2023.Lab01_StringCleaner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringRemoverRunner
{
    public static void main( String args[] )
    {
        String[][] testArray = {{"xR-MxR-MHelloxR-M", "sxsssxssxsxssexssxsesss", "fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "dogdogcatddodogdogdoggog"}, {"R-M", "xs", "qwerty", "dog"}};
        //add test cases
        for (int i = 0;  i < 5; i++) {
            String s = testArray[0][i];
            String r = testArray[1][i];
            StringRemover sr = new StringRemover(s, r);
            sr.setSentence(s);
            sr.setRemove(r);
            System.out.println(sr);
        }
    }
}
