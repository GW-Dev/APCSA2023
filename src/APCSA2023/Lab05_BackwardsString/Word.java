package APCSA2023.Lab05_BackwardsString;//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Word
{
	private String word;

	public Word(String s)
	{
		this.word = s;
	}

	public void setWord(String w) {
		this.word = w;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		char[] wordArray = word.toCharArray();
		char[] wordArray2 = word.toCharArray();
		for (int i = word.length(); i > 0; i--) {
			char transferArray = wordArray[word.length() - i];
			wordArray2[i-1] = transferArray;
		}

		back = String.valueOf(wordArray2);
		return back;
	}

 	public String toString()
 	{
 		return String.valueOf(this.getFirstChar()) + "\n" + String.valueOf(this.getLastChar()) + "\n" + this.getBackWards() + "\n" + this.word;
	}
}
