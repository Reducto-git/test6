package kitchen;

import Cook.Order;
import java.util.Random;

public abstract class Dish implements Order {
    private String name;
    private double price;
    private Random random;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
        this.random = new Random();
    }

    @Override
    public abstract void cook() ;

    @Override
    public boolean check() {
        return random.nextBoolean();
    }
}
