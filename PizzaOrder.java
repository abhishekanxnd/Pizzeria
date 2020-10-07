package ananabhi;

import java.util.*;

/**
 *
 * @author ananabhi
 */
public class PizzaOrder {

    private PizzaSize size;
    private ArrayList<Toppings> toppings;
    private Drinks drinks;
    private int numOfDrinks = 0;
    private int numOfPizza = 0;

    /**
     * default constructor
     */
    public PizzaOrder() {
        toppings = new ArrayList<>();
    }

    /**
     * accessor for the size of the pizza
     *
     * @return size of pizza
     */
    public PizzaSize getSize() {
        return size;
    }

    /**
     * mutator for the size of the pizza
     *
     * @param size
     */
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    /**
     * accessor for the ArrayList "toppings"
     *
     * @return the ArrayList "toppings"
     */
    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    /**
     * mutator for ArrayList "toppings"
     *
     * @param toppings
     */
    public void setToppings(ArrayList<Toppings> toppings) {
        this.toppings = toppings;
    }

    /**
     * accessor for the type of drink
     *
     * @return type of chosen drink
     */
    public Drinks getDrinks() {
        return drinks;
    }

    /**
     * mutator for the type of drinks
     *
     * @param drinks
     */
    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    /**
     * accessor for the number of drinks
     *
     * @return quantity of chosen drinks
     */
    public int getNumOfDrinks() {
        return numOfDrinks;
    }

    /**
     * mutator for the number of drinks
     *
     * @param numOfDrinks
     */
    public void setNumOfDrinks(int numOfDrinks) {
        this.numOfDrinks = numOfDrinks;
    }

    /**
     * accessor for the quantity of pizza
     *
     * @return item price
     */
    public int getNumOfPizza() {
        return numOfPizza;
    }

    /**
     * sets the number of drinks
     *
     * @param numOfPizza
     */
    public void setNumOfPizza(int numOfPizza) {
        this.numOfPizza = numOfPizza;
    }

    /**
     * calculates the bill amount
     *
     * @return subtotal (without tax)
     */
    public double total() {
        double subtotal = size.getPrice() * numOfPizza + drinks.getPrice() * numOfDrinks;
        for (int i = 0; i < toppings.size(); i++) {
            subtotal += toppings.get(i).getPrice();
        }
        return subtotal;
    }

    /**
     * this method calculates the HST (13%)
     *
     * @return HST
     */
    private double tax() {
        return (total() * 0.13);
    }

    /**
     * prints required output when instance of this class is printed in main method
     *
     * @return output
     */
    public String toString() {
        double total = total();
        double tax = tax();
        double priceOfPizza = size.getPrice() * numOfPizza;
        double priceOfDrinks = drinks.getPrice() * numOfDrinks;
        double toppingsPrice = 0;
        int numofToppings = 0;

        for (int i = 0; i < toppings.size(); i++) {
            toppingsPrice += toppings.get(i).getPrice();
            numofToppings++;
        }

        String x1 = "Pizza\t\t\t\t" + priceOfPizza + "\n" + numOfPizza + " " + size.name()
                + " @ $" + size.getPrice();
        String x2 = "\nToppings:\t\t\t\t" + toppingsPrice + "\n";
        String x3 = "";

        for (int i = 0; i <= toppings.size() - 1; i++) {
            x3 += " " + toppings.get(i).name() + " @ $"
                    + toppings.get(i).getPrice() + "\n";
        }

        String x4 = "Drink:\t\t\t\t" + priceOfDrinks + "\n" + numOfDrinks + " "
                + drinks.name() + " @ $" + drinks.getPrice() + "\n";
        String x5 = "==========================================";
        String x6 = "\nSubTotal:\t\t\t\t " + total + "\nHST:   \t\t\t\t" + tax + "\nTotal:\t\t\t\t" + (total + tax);

        return x1 + x2 + x3 + x4 + x5 + x6;
    }
}
