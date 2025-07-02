package presentation;

import entity.Product;

import java.util.Scanner;

public class ProductManager {
    public static Product[] productList = new Product[100];
    public static int currentIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Add Product");
            System.out.println("2. Show All Products 😁");
            System.out.println("3. Find Product by Name");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter Product Name: ");
                    String productName = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    double productPrice = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter Product Quantity: ");
                    int productQuantity = Integer.parseInt(sc.nextLine());

                    Product newProduct = new Product(productName, productPrice, productQuantity);
                    addProduct(newProduct);
                    break;

                case 2:
                    showAllProduct(productList);
                    break;

                case 3:
                    System.out.print("Enter Product Name to search: ");
                    String searchName = sc.nextLine();
                    searchProductByName(searchName);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please enter a valid choice from 1-4");
            }
        } while (true);
    }

    public static void addProduct(Product product) {
        productList[currentIndex] = product;
        currentIndex++;
    }

    public static void showAllProduct(Product[] products) {
        for (int i = 0; i < currentIndex; i++) {
            products[i].display();
        }
    }

    public static void searchProductByName(String name) {
        boolean found = false;
        for (int i = 0; i < currentIndex; i++) {
            if (productList[i].getName().toLowerCase().contains(name.trim().toLowerCase())) {
                found = true;
                System.out.println("Product found:");
                productList[i].display();
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found");
        }
    }
}
