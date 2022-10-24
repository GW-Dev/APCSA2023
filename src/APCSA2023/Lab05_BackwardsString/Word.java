package APCSA2023.Lab05_BackwardsString;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Word {
    private String word;

    public Word(String s) {
        this.word = s;
    }

    public void setWord(String w) {
        this.word = w;
    }

    public char getFirstChar() {
        return word.charAt(0);
    }

    public char getLastChar() {
        return word.charAt(word.length() - 1);
    }

    /**
     * Interesting approach.
     */
    public String getBackWards() {
        char[] wordArray = word.toCharArray();
        char[] wordArray2 = word.toCharArray();
        for (int i = word.length(); i > 0; i--) {
            char transferArray = wordArray[word.length() - i];
            wordArray2[i - 1] = transferArray;
        }
        return String.valueOf(wordArray2);
    }

    /**
     * Output has incorrect formatting. See handout.
     */
    public String toString() {
        return (this.getFirstChar()) + "\n" + (this.getLastChar()) + "\n" + this.getBackWards() + "\n" + this.word;
    }
}
