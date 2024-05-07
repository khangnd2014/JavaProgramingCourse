package nestech.javacourse.example.io;

import java.io.Serializable;

public class Stock implements Serializable {
    private int id;
    private String desc;
    private double price;
    private int quantity;

    public Stock(int id, String desc, double price, int quantity) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return (id + " " + desc + " " + price + " " + quantity);
    }
}