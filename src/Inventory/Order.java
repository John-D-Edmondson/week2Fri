package Inventory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

    private int orderId;
    private int customerId;
    private ArrayList<Integer> productIds;
    private double totalCost;

    // Most args constructor (No total cost arg)
    public Order(int orderId, int customerId, ArrayList<Integer> productIds) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productIds = productIds;
        this.totalCost = calculateTotalCost(productIds);
    }

    // No args constructor
    public Order() {}

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Integer> getProductIds() {
        return productIds;
    }

    public void setProductIds(ArrayList<Integer> productIds) {
        this.productIds = productIds;
    }

    public void addProductId(int productId) {
        productIds.add(productId);
    }

    public void removeProductId(int productId) {
        productIds.removeAll(List.of(productId));
    }

    public double getTotalCost() {
        return totalCost;
    }

    // Calculate the total order cost
    private double calculateTotalCost(ArrayList<Integer> productIds) {
        double totalCost = 0;
        for (Integer productId:productIds) {
            totalCost += Products.products.get(productId).getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", productIds=" + productIds +
                ", totalCost=" + totalCost +
                '}';
    }
}
