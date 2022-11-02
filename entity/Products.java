package entity;

import java.util.Arrays;

public class Products {
    private String name;
    private int price;
    private int quantity;

    public Products() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Product{" + "название=" + name 
                        + ", цена=" + price 
                        + ", кол-во=" + quantity 
                        + '}';
    }

}
