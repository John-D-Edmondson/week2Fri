import Inheritance.ElectronicDevice;
import Inheritance.Laptop;
import Inheritance.Radio;
import Inventory.Customer;
import Inventory.Customers;
import Inventory.Products;
import Inventory.Orders;
import UniqueSum.UniqueSum;
import blackjack.BlackJack;
import taxes.Person;
import taxes.taxCalc;
import week3Classes.Human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Products products = new Products();
        products.createProduct("Merlot", 8.99);
        products.createProduct("Shiraz", 11.99);
        products.displayProducts();
        System.out.println("==============");
        Orders orders = new Orders();
        orders.createOrder(1, new ArrayList<>(Arrays.asList(1, 2)));
        System.out.println(orders.readAllOrders());

        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you looking to interact with today? \n");
        System.out.println(" 1. customer \n 2. order \n 3.product");
        int input = scanner.nextInt();

        while (input >3 || input < 0){
            System.out.println("invalid input");
            input = scanner.nextInt();
        };






}}