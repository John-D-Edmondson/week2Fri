import Inheritance.ElectronicDevice;
import Inheritance.Laptop;
import Inheritance.Radio;
import Inventory.Customer;
import Inventory.Customers;
import UniqueSum.UniqueSum;
import blackjack.BlackJack;
import taxes.Person;
import taxes.taxCalc;
import week3Classes.Human;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customers customers = new Customers();

        customers.create_customer("jim", "smith", "jimsmith@gmail.com");
        customers.create_customer("heater", "wheatley", "heatherwheatley@gmail.com");




        customers.displayAllCustomer();

        System.out.println(customers.deleteCustomer("jimsmith@gmail.com"));
        System.out.println(customers.deleteCustomer("jimsmith@gmail"));

        customers.displayAllCustomer();


}}