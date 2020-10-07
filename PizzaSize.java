package ananabhi;

/**
 *
 * @author ananabhi
 */
public enum PizzaSize {

    /**
     *
     */
    SMALL(5.25),

    /**
     *
     */
    MEDIUM(7.50),

    /**
     *
     */
    LARGE(9.95);

    private double price;

    private PizzaSize(double price) {
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
