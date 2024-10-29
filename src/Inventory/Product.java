package Inventory;

public class Product {
    private static int idCounterProd = 1;
    private int productId;
    private String productName;
    private double cost;



    public Product(){
        this.productId = idCounterProd;
        idCounterProd++;
    };
    public Product(String productName, double cost){
        this.productName = productName;
        this.cost = cost;
        this.productId = idCounterProd;
        idCounterProd++;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
