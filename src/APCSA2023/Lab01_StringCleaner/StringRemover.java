package APCSA2023.Lab01_StringCleaner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

class StringRemover {
    private String remove;
    private String sentence;

    public StringRemover(String sen, String rem) {
        this.remove = rem;
        this.sentence= sen;
    }

    public String getRemove() {
        return remove;
    }

    public String getSentence() {
        return sentence;
    }

    public String getResult() {
        return "";
    }

    public void setSentence(String s) {
        this.sentence = s;
    }

    public void setRemove(String r) {
        this.remove = r;
    }

    public void removeStrings() {
        while (sentence.contains(remove)) {
            String senChange = sentence;
            int toTrash = senchange.indexOf(remove);

        }
    }

    public String toString() {
        return getSentence() + " - String to remove " + getRemove() + "\n" + getResult();
    }
}
