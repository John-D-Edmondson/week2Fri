package Inventory;

import java.util.Scanner;


public class CustomerHandler {
    private Customers customers;
    public CustomerHandler(Customers customers){
        this.customers = customers;
    };
    Scanner scan = new Scanner(System.in);
    public void customerHandlerStart(){
        System.out.println("You are in the customer menu \n");
        System.out.println("Please select from \n 1. Create Customer \n" +
                " 2. Display individual customer \n" +
                " 3. Update Customer \n" +
                " 4. Delete Customer \n" +
                " 5. Display All Customers\n");



        int input = scan.nextInt();
        scan.nextLine();


        switch (input){
            case 1: createCustomerHandler();
                    break;
            case 2: displayIndividualCustomerHandler();
                    break;
            case 3: updateCustomerHandler();
                    break;
            case 4: deleteCustomerHandler();
                    break;
            case 5: displayAllCustomersHandlers();
                    break;
            default:
                System.out.println("unexpected input");
        }
    }

    private void displayAllCustomersHandlers() {
        System.out.println(customers.displayAllCustomer());
    }

    private void deleteCustomerHandler() {
        System.out.println("Delete by 1. id or 2. email");
        int input = scan.nextInt();
        if (input ==1) {
            System.out.println("Input id \n");
            int idInput = scan.nextInt();
            scan.nextLine();
            System.out.println(customers.deleteCustomer(idInput));
        } else if (input == 2) {
            System.out.println(("Input email \n"));
            String emailInput = scan.nextLine();
            System.out.println(customers.deleteCustomer(emailInput));
        } else {
            System.out.println("Invalid input");
        }
    }

    private void updateCustomerHandler() {
        System.out.println("Please enter customer id to update\n");
        int custId = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter first name....\n");
        String firstname = scan.nextLine();
        System.out.println("Please enter last name....\n");
        String lastname = scan.nextLine();
        System.out.println("Please enter email....\n");
        String email = scan.nextLine();
        System.out.println(customers.updateCustomer(custId,firstname, lastname, email));
    }

    private void createCustomerHandler(){
        System.out.println("Please enter first name....\n");
        String firstname = scan.nextLine();
        System.out.println("Please enter last name....\n");
        String lastname = scan.nextLine();
        System.out.println("Please enter email....\n");
        String email = scan.nextLine();
        customers.create_customer(firstname, lastname, email);
        System.out.println("Customer created");
    }

    private void displayIndividualCustomerHandler(){
        System.out.println("Search by 1. id or 2. email");
        int input = scan.nextInt();
        scan.nextLine();
        if (input ==1) {
            System.out.println("Input id \n");
            int idInput = scan.nextInt();
            scan.nextLine();
            System.out.println(customers.display_customer(idInput));
        } else if (input == 2) {
            System.out.println(("Input email \n"));
            String emailInput = scan.nextLine();
            System.out.println(customers.display_customer(emailInput));
        } else {
            System.out.println("invalid input");
        }
    }







}
