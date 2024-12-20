package Inventory;

import java.util.ArrayList;

public class Customer {

    private static int idCounter = 1;

    private int customerId;
    private String firstname;
    private String lastname;
    private String email;
    private ArrayList<Integer> orderIds;

    public Customer (){};

    public Customer(String firstname, String lastname, String email) {
        this.customerId = idCounter;
        idCounter++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.orderIds = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addOrderId(int orderId) {
        orderIds.add(orderId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", orderIds=" + orderIds +
                '}';
    }
}
