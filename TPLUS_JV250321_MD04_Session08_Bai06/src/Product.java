public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void display() {
        System.out.printf("%-18s | %-10.1f\n", this.name, this.price);
    }
}
