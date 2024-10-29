import Inheritance.ElectronicDevice;
import Inheritance.Laptop;
import Inheritance.Radio;
import Inventory.*;
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
        System.out.println(products.displayProducts());

        System.out.println("==============");

        Customers customers = new Customers();
        customers.create_customer("John", "Doe", "jd@gmail.com");
        customers.create_customer("jim", "bob", "jimb@aol.com");
        System.out.println(customers.displayAllCustomer());

        System.out.println("==============");

        Orders orders = new Orders();
        orders.createOrder(1, new ArrayList<>(Arrays.asList(1, 2)));
        System.out.println(orders.readAllOrders());

        System.out.println("==============");
        System.out.println(customers.displayAllCustomer());


        boolean carryOn = true;
        while(carryOn) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What are you looking to interact with today? \n");
            System.out.println(" 1. Customer \n 2. Order \n 3. Product \n 4. Exit");
            int input = scanner.nextInt();
            scanner.nextLine();

            while (input > 4 || input < 0) {
                System.out.println("invalid input");
                input = scanner.nextInt();
                scanner.nextLine();
            }


            if (input == 1) {
                CustomerHandler customerHandler = new CustomerHandler(customers);
                customerHandler.customerHandlerStart();
            } else if( input == 2){
                OrderHandler orderHandler = new OrderHandler();
                orderHandler.run(orders);
            } else if(input ==3 ){
                ProductHandler productHandler = new ProductHandler();
                productHandler.run(products);
            } else if (input == 4){
                carryOn = false;
            }
            else {
                System.out.println("Invalid input");
            }
        }
}}