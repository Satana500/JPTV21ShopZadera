package entity;

import java.util.Date;

public class Purchase {
    private Products product;
    private Customers client;
    private Date date;
    private int quantity;

    public Purchase() {
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Customers getClient() {
        return client;
    }

    public void setClient(Customers client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" + "product=" + product + ", client=" + client + ", date=" + date + ", quantity=" + quantity + '}';
    }  
}
