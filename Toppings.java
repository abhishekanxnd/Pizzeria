package ananabhi;

/**
 *
 * @author ananabhi
 */
public enum Toppings {

    /**
     *
     */
    CHEESE(5.25),

    /**
     *
     */
    MUSHROOMS(1.25),

    /**
     *
     */
    OLIVES(1.50),

    /**
     *
     */
    PEPPERONI(1.75);

    private double price;

    private Toppings(double price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }
}
