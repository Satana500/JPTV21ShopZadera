package entity;

public class Products {
    private String name;
    private int price;
    private int quantity;

    public Products() {
    }

    public String getProductName() {
        return name;
    }

    public void setProductName(String name) {
        this.name = name;
    }
    
    public int getProductPrice() {
        return price;
    }

    public void setProductPrice(int price) {
        this.price = price;
    }
    
    public int getProductQuantity() {
        return quantity;
    }

    public void setProductQuantity(int quantity) {
        this.quantity = quantity;
    }

        
    @Override
    public String toString() {
        return "Product{" + "название=" + name 
                        + ", цена=" + price 
                        + ", кол-во=" + quantity 
                        + '}';
    }
    public boolean quantityMinuss(int quantity){
        if(this.quantity>=quantity){
            this.quantity=this.quantity-quantity;
            return true;
        }
        return false;
    }
    
}
