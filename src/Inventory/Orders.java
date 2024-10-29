package Inventory;

import java.util.ArrayList;
import java.util.HashMap;

public class Orders {
    private HashMap<Integer, Order> orders = new HashMap<Integer, Order>();
    private static int orderIdCount = 1;


    // No args constructor
    public Orders() {}

    @Override
    public String toString() {
        return "Orders{" +
                "orders=" + orders +
                '}';
    }

    public void createOrder(int customerId, ArrayList<Integer> productIds) {
        Order order = new Order(orderIdCount, customerId, productIds);
        orders.put(order.getOrderId(), order);
        orderIdCount++;
    }

    public String readOrder(int orderId) {
        try {
            return orders.get(orderId).toString();
        } catch(Exception e) {
            System.out.println("OrderId not found exception: " + e);
            return e.toString();
        }
    }

    public void addProductToOrder(int orderId, int productId) {
        try {
            orders.get(orderId).addProductId(productId);
        } catch(Exception e) {
            System.out.println("OrderId not found exception: " + e);
        }
    }

    public void deleteProductFromOrder(int orderId, int productId) {
        try {
            orders.get(orderId).removeProductId(productId);
        } catch(Exception e) {
            System.out.println("OrderId not found exception: " + e);
        }
    }

    public void deleteOrder(int orderId) {
        try {
            orders.remove(orderId);
        } catch(Exception e) {
            System.out.println("OrderId not found exception: " + e);
        }
    }

    public String readAllOrders() {
        return orders.toString();
    }


}
