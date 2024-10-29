package Inventory;

import java.util.HashMap;
import java.util.Map;

public class Customers {
    private HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();
    public Customers(){};
    public void create_customer(String firstname, String lastname, String email){
        Customer newCust = new Customer(firstname, lastname, email);
        customers.put(newCust.getCustomerId(), newCust);
    }

    public String display_customer(int customerId){
        Customer foundCust = customers.get(customerId);
        if (foundCust != null){ return foundCust.toString();}
        return "customer not found";
    }

    public String display_customer(String email) {
        for (Map.Entry<Integer, Customer> entry : customers.entrySet()) {
            Customer customer = entry.getValue();
            if (customer.getEmail().equals(email)) {
                return customer.toString();
            }
        }
        return "Customer not found";
    }

    public String updateCustomer(int customerId, String firstname, String lastname, String email){
            Customer foundCust = customers.get(customerId);
            if(foundCust != null) {
                foundCust.setEmail(email);
                foundCust.setFirstname(firstname);
                foundCust.setLastname(lastname);
                return "customer updated";
            }
            return "customer not found";
    }

    public String deleteCustomer(int customerId){
        Customer deletedCust = customers.remove(customerId);
        if (deletedCust == null) return "customer not found";
        return "customer deleted";
    }
    public String deleteCustomer(String email){
        for (Map.Entry<Integer, Customer> entry : customers.entrySet()) {
            Customer customer = entry.getValue();
            if (customer.getEmail().equals(email)) {
                customers.remove(customer.getCustomerId());
                return "Customer deleted";
            }
        }
        return "Customer not found";
    }

    public String displayAllCustomer(){
        if(!customers.isEmpty()){return customers.toString();}
        return "customers list empty";
    }


}
