//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
class Car
{
    private int miles;
    private int milesTilOilChange;

    private int lastOil;

    public Car(int mi, int miOil) {
        miles = mi;
        milesTilOilChange = miOil;
        lastOil = 0;
    }

    public void addMiles(int toAdd) {
        miles += toAdd;
    }

    public boolean timeForOilChange() {
        if (miles-lastOil > milesTilOilChange) {
            lastOil += miles;
            return true;
        }
        else {
            return false;
        }
    }
}
//design your Car class
//write all code for your Car class here
//test your Car class with the CarRunner