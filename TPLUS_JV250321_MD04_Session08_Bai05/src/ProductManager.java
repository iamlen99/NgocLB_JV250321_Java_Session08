import entity.Product;

import java.util.Scanner;

public class ProductManager {
    public static Product[] products = new Product[100];
    public static int currentIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Add Product");
            System.out.println("2. Show All Product");
            System.out.println("3. Find Product");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhap ten san pham: ");
                    String productName = sc.nextLine();
                    System.out.print("Nhap ma san pham: ");
                    int productId = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap gia san pham: ");
                    double productPrice = Double.parseDouble(sc.nextLine());

                    Product newProduct = new Product(productId, productName, productPrice);
                    addProduct(newProduct);
                    break;

                case 2:
                    showAllProducts();
                    break;

                case 3:
                    System.out.println("Nhap ten san pham can tim kiem: ");
                    String searchName = sc.nextLine();
                    searchProductByName(searchName);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Vui long chon so tu 1-4");
            }
        } while (true);
    }


    public static void addProduct(Product product) {
        products[currentIndex] = product;
        currentIndex++;
    }

    public static void searchProductByName(String name) {
        boolean found = false;
        for (int i = 0; i < currentIndex; i++) {
            if (products[i].getName().toLowerCase().contains(name.trim().toLowerCase())) {
                System.out.println("Da tim thay san pham: ");
                products[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay san pham can tim kiem!");
        };
    }

    public static void showAllProducts() {
        for (int i = 0; i < currentIndex; i++) {
            products[i].display();
        }
    }
}
