package Inventory;

import java.util.Scanner;

public class ProductHandler {

    public static void run(Products productsList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?: " +
                "\n(1) Create a product" +
                "\n(2) Display a product" +
                "\n(3) Update a product" +
                "\n(4) Delete a product" +
                "\n(5) Display all products");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option == 1) {
            System.out.println("You chose to create a product.");
            createProduct(scanner, productsList);
        } else if (option == 2) {
            System.out.println("You chose to display a product.");
            displayProduct(scanner, productsList);
        } else if (option == 3) {
            System.out.println("You chose to update a product.");
            updateProduct(scanner, productsList);
        } else if (option == 4) {
            System.out.println("You chose to delete a product");
            deleteProduct(scanner, productsList);
        } else if (option == 5) {
            System.out.println("You chose to display all products.");
            displayAllProducts(scanner, productsList);
        } else {
            System.out.println("You didn't select a valid menu option.");
        }
    }

    private static void createProduct(Scanner scanner, Products productsList) {
        System.out.println("Enter the product name: ");
        String productName = scanner.nextLine();
        System.out.println("Enter the product cost: ");
        double cost = scanner.nextDouble();
        scanner.nextLine();
        productsList.createProduct(productName, cost);
        System.out.println("Created product: " + productsList.displayProduct(Product.idCounterProd - 1));
    }

    private static void displayProduct(Scanner scanner, Products productsList) {
        System.out.println("Enter the id for the product you would like to display: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(productsList.displayProduct(id));
    }

    private static void updateProduct(Scanner scanner, Products productsList) {
        System.out.println("Enter the id for the product you would like to display: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the updated name for the product: ");
        String name = scanner.nextLine();
        System.out.println("Enter the updated cost for the product ");
        double cost = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(productsList.updateProduct(id, name, cost));
        System.out.println("Updated product: " + productsList.displayProduct(id));
    }

    private static void deleteProduct(Scanner scanner, Products productsList) {
        System.out.println("Enter the id for the product you would like to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(productsList.deleteProduct(id));
    }

    private static void displayAllProducts(Scanner scanner, Products productsList) {
        System.out.println(productsList.displayProducts());
    }
}
