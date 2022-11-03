//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

class StringRemover {
    private String remove;
    private String sentence;



    public StringRemover(String sen, String rem) {
        remove=rem;
        sentence=sen;
    }

    public String getRemove() {
        return remove;
    }

    public String getSentence() {
        return sentence;
    }

    /**
     * This method is redundant. Either make a PIV called result
     * (and assign it in removeStrings()) or get rid of this method.
     */

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
            }
            else if (toTrash == -1) {
                break;
            }
            else {
                senChange = senChange.substring(0, toTrash - 1) + senChange.substring(toTrash + remove.length());
            }
        }
        return senChange;
    }

    public String toString() {
        return getSentence() + " - String to remove " + getRemove() + "\n" + removeStrings() + " \n";
    }
}
