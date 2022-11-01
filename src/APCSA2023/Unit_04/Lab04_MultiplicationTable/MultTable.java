//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MultTable {
    private int number;
    private int stop;

    public MultTable(int n, int s) {
        this.number = n;
        this.stop = s;
    }

    /**
     * More descriptive parameter names would be better.
     */
    public void setNumStop(int setNum, int setStop) {
        this.number = setNum;
        this.stop = setStop;
    }

    /**
     * Output has incorrect formatting. See handout.
     */
    public void printTable() {
        System.out.println("\nMultiplication table for " + this.number);
        for (int a = 1; a <= this.stop; a++) {
            if (a*number < 10) {
                System.out.println(a + "      " + (a) * (number));
            }
            else {
                System.out.println(a + "     " + (a) * (number));
            }

        }
    }
}
