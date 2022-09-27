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
        return this.removeStrings();
    }

    public void setSentence(String s) {
        this.sentence = s;
    }

    public void setRemove(String r) {
        this.remove = r;
    }

    public String removeStrings() {
        String senChange = sentence;

        while (senChange.contains(remove)) {
            int toTrash = senChange.indexOf(remove);
            if (senChange.substring(0,remove.length()).equals(remove)){
                senChange = senChange.substring(remove.length());
                System.out.println(senChange);
            }
            else {
                senChange = senChange.substring(0, toTrash - 1) + senChange.substring(toTrash + remove.length());
                System.out.println(senChange);
            }
        }
        return senChange;
    }

    public String toString() {
        return getSentence() + " - String to remove " + getRemove() + "\n" + getResult();
    }
}
