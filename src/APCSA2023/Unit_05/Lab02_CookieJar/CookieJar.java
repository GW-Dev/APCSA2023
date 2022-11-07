//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
class CookieJar {
    private int capacity;
    private int numCookies;


    public CookieJar(int cap) {
        capacity = cap;
        numCookies = 0;
    }

    public int getStuff() {
        return numCookies;
    }

    public int addStuff(int cookAdd) {
        int leftOver = 0;
        if (cookAdd > capacity-numCookies) {
            leftOver = (numCookies + cookAdd - capacity);
            numCookies += (capacity-numCookies) % cookAdd;
            return leftOver;
        }
        else {
            numCookies += cookAdd;
            return leftOver;
        }
    }

    public boolean isFull() {
        if (numCookies >= capacity) {
            return true;
        }
        else {
            return false;
        }
    }

    public int spaceLeft() {
        return (capacity-numCookies);
    }

}
//design your CookieJar class
//write all code for your CookieJar class here
//test your CookieJar class with the CookieJarRunner