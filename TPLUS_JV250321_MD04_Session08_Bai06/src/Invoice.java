public class Invoice {
    public static Product [] products = new Product[100];
    public static int currentIndex = 0;

    public static void main(String[] args) {
        products[0] = new Product("Kem danh rang", 40000);
        products[1] = new Product("Ban chai", 20000);
        products[2] = new Product("Chai dau goi dau", 180000);
        products[3] = new Product("Khan tam", 30000);
        products[4] = new Product("Dao cao rau", 50000);
        currentIndex = 5;

        double totalPrice = getTotalPrice(products);
        double totalTax = getTax(totalPrice);
        double finalAmount = getFinalAmount(totalPrice, totalTax);

        displayAllProduct(products);

        System.out.println("Total: " + totalPrice);
        System.out.println("Tax: " + totalTax);
        System.out.println("Final Amount: " + finalAmount);
    }

    public static double getTotalPrice(Product[] product) {
        double totalPrice = 0;
        for(int i = 0; i < currentIndex; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }

    public static double getTax(double totalPrice) {
        return totalPrice * 0.1;
    }

    public static double getFinalAmount(double totalPrice, double tax) {
        return totalPrice + tax;
    }

    public static void displayAllProduct(Product[] product) {
        System.out.printf("%-18s | %-10s\n", "Name", "Price");
        for(int i = 0; i < currentIndex; i++) {
            product[i].display();
        }
    }
}
