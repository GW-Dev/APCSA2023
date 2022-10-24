package APCSA2023.Lab04_MultiplicationTable;

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
    public void setNumStop(int b, int c) {
        this.number = b;
        this.stop = c;
    }

    /**
     * Output has incorrect formatting. See handout.
     */
    public void printTable() {
        System.out.println("Multiplication table for " + this.number);
        for (int a = 1; a <= this.stop; a++) {
            System.out.println(a + " " + (a) * (number));
        }
    }
}
