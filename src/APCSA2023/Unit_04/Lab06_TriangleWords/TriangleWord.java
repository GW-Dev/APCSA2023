//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleWord
{
   private String word;
   private String triWord;

	public TriangleWord(String w)
	{
		word=w;
		triWord = "";
	}

	public void setWord(String ww) {
		word = ww;
	}

	private String numSpaces(int nS) {
		String toReturn = "";
		for (int loopSpace = 0; loopSpace < nS-1; loopSpace++) {
			toReturn += " ";
		}
		return toReturn;
	}

	public String getBackWords(String wordToReverse) {
		word = wordToReverse;
		char[] wordArray = wordToReverse.toCharArray();
		char[] wordArray2 = wordToReverse.toCharArray();
		for (int i = wordToReverse.length(); i > 0; i--) {
			char transferArray = wordArray[word.length() - i];
			wordArray2[i - 1] = transferArray;
		}
		return String.valueOf(wordArray2);
	}

	private void makeTriangle(String theWord) {
		int lengthWordArr = theWord.length();
		String[] triArray = new String[lengthWordArr];
		for (int row = 0; row < theWord.length(); row++) {
			if (row == 0) {
				triArray[0] = this.numSpaces((lengthWordArr - row)) + word.charAt(row);
			} else if ((row > 0) && (row < lengthWordArr-1)) {
				triArray[row] = (this.numSpaces((lengthWordArr - row)) +
						word.charAt(row) + this.numSpaces(((2*row)))
						+ word.charAt(row));
			} else if (row == lengthWordArr-1) {
				triArray[row] = this.getBackWords(theWord) + theWord.substring(1, lengthWordArr - 1) + theWord.charAt(row);
			}
		}
		for (int i = 0; i < lengthWordArr ; i++) {
			triWord += triArray[i] + "\n";
		}

	}

	public String toString()
	{
		makeTriangle(word);
		return triWord;
	}
}