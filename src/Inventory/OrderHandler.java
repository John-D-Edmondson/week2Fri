package Inventory;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderHandler {

    public static void run(Orders ordersList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?: " +
                "\n(1) Create an order" +
                "\n(2) Display an order" +
                "\n(3) Add a product to an order" +
                "\n(4) Delete a product from an order" +
                "\n(5) Delete an order" +
                "\n(6) Display all orders");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option == 1) {
            System.out.println("You chose to create an order.");
            createOrder(scanner, ordersList);
        } else if (option == 2) {
            System.out.println("You chose to display an order.");
            displayOrder(scanner, ordersList);
        } else if (option == 3) {
            System.out.println("You chose to add a product to an order.");
            addProductToOrder(scanner, ordersList);
        } else if (option == 4) {
            System.out.println("You chose to delete a product from an order");
            deleteProductFromOrder(scanner, ordersList);
        } else if (option == 5) {
            System.out.println("You chose to delete an order.");
            deleteOrder(scanner, ordersList);
        } else if (option == 6) {
            System.out.println("You chose to display all orders.");
            displayAllOrders(scanner, ordersList);
        } else {
            System.out.println("You didn't select a valid menu option.");
        }
    }

    private static void createOrder(Scanner scanner, Orders ordersList) {
        System.out.println("Enter the customer id: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the product ids, seperated by commas: ");
        String[] productIds = scanner.nextLine().split(",");
        ArrayList<Integer> productIdsArray = new ArrayList<>();
        for (String id : productIds) {
            try {
                // Trim any extra whitespace and parse to integer
                productIdsArray.add(Integer.parseInt(id.trim()));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + id + " is not an integer.");
            }
        }

        ordersList.createOrder(customerId, productIdsArray);
        System.out.println("Created order: " + ordersList.readOrder(Orders.orderIdCount - 1));
    }

    private static void displayOrder(Scanner scanner, Orders ordersList) {
        System.out.println("Enter the id for the order you would like to display: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(ordersList.readOrder(id));
    }

    private static void addProductToOrder(Scanner scanner, Orders ordersList) {
        System.out.println("Enter the id for the order you would like to add to: ");
        int orderId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the id for the product you would like to add: ");
        int productId = scanner.nextInt();
        scanner.nextLine();

        ordersList.addProductToOrder(orderId, productId);
        System.out.println("Product added to order: " + ordersList.readOrder(orderId));
    }

    private static void deleteProductFromOrder(Scanner scanner, Orders ordersList) {
        System.out.println("Enter the id for the order you would like to delete from: ");
        int orderId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the id for the product you would like to delete: ");
        int productId = scanner.nextInt();
        scanner.nextLine();
        ordersList.deleteProductFromOrder(orderId, productId);
        System.out.println("Product added to order: " + ordersList.readOrder(orderId));
    }

    private static void deleteOrder(Scanner scanner, Orders ordersList) {
        System.out.println("Enter the id for the order you would like to delete: ");
        int orderId = scanner.nextInt();
        scanner.nextLine();
        ordersList.deleteOrder(orderId);
        System.out.println("Order " + orderId + " deleted.");

        }

    private static void displayAllOrders(Scanner scanner, Orders ordersList) {
        System.out.println(ordersList.readAllOrders());
    }
}
