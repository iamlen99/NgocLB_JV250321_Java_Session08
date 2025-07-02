package entity;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.printf("Name: %s - Price: %.1f - Quantity: %d\n", this.name, this.price, this.quantity);
    }
}
