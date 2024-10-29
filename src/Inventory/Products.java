package Inventory;

import java.util.HashMap;
import java.util.Map;

public class Products {
    public static HashMap<Integer, Product> products = new HashMap<Integer, Product>();

    public Products(){};

    public void createProduct(String name, double cost){
        Product newProd = new Product(name, cost);
        products.put(newProd.getProductId(), newProd);
    }

    public String displayProduct(int id){
        Product foundProd = products.get(id);
        if(foundProd != null){ return foundProd.toString();}
        return "product not found";
    };
    public String displayProduct(String name){
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Product product = entry.getValue();
            if (product.getProductName().equals(name)) {
                return product.toString();
            }
        }
        return "product not found";
    };
    public void displayProducts(){
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Product product = entry.getValue();
            System.out.println(product.toString());
        }

        if (products.isEmpty()) {
            System.out.println("no products found ");
        }
    };
    public String updateProduct(int id, String name, double cost){
        Product foundProd = products.get(id);
        if(foundProd != null){
            foundProd.setProductName(name);
            foundProd.setCost(cost);
            return "product updated";
        }
        return "product no found";
    };
    public String deleteProduct(int id){
        Product deletedProd = products.remove(id);
        if (deletedProd == null) return "customer not found";
        return "customer deleted";
    };
    public String deleteProduct(String name){
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Product product = entry.getValue();
            if (product.getProductName().equals(name)) {
                products.remove(product.getProductId());
                return "Product deleted";
            }
        }
        return "product not found";
    };

}
