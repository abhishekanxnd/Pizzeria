package ananabhi;

/**
 *
 * @author ananabhi
 */
public enum Drinks {

    /**
     *
     */
    COKE(1.25),

    /**
     *
     */
    JUICE(1.95),

    /**
     *
     */
    CHOCOLATE_MILK(2.25);
    
    private double price;
    
    private Drinks(double price) {
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
