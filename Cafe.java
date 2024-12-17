/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory 
    
    /**
     * constructor for cafe
     * @param name name of cafe
     * @param address street address of cafe
     * @param nFloors number of floors of cafe
     * @param nCoffeeOunces number of ounces of coffee cafe contains
     * @param nSugarPackets number of sugar packets cafe contains
     * @param nCreams number of creams cafe contains
     * @param nCups number of cups cafe contains
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * method to sell coffee which decreases inventory (cups, ounces of coffee, sugar, creams) as used
     * @param size size of coffee being sold in ounces
     * @param nSugarPackets number of sugar packets needed
     * @param nCreams number of creams needed
     * @param nCups number of cups needed
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams, int nCups) {
        if (this.nCoffeeOunces < size) {
            restock(100, 100, 100, 100);
        } else if (this.nSugarPackets < nSugarPackets) {
            restock(100, 100, 100, 100);
        } else if (this.nCreams < nCreams) {
            restock(100, 100, 100, 100);
        } else if (this.nCups < nCups) {
            restock(100, 100, 100, 100);
        }
        this.nCoffeeOunces = this.nCoffeeOunces-size;
        this.nSugarPackets = this.nSugarPackets-nSugarPackets;
        this.nCreams = this.nCreams - nCreams;
        this.nCups = this.nCups - nCups;
    }

    /**
     * method to restock inventory of cafe
     * @param nCoffeeOunces number of ounces of coffee restocked
     * @param nSugarPackets number of sugar packets added
     * @param nCreams number of creams added
     * @param nCups number of cups added
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        }

    /**
     * creates new cafe, compass
     */
    public static void main(String[] args) {
        new Cafe("Compass Cafe", "In Neilson Library", 1, 400, 30, 45, 400);
    }
    
}
