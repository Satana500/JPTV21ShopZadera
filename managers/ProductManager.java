package managers;

import entity.Products;
import java.util.Scanner;

public class ProductManager {
    private Scanner scanner;
    
    public ProductManager() {
        this.scanner = new Scanner(System.in);
    }
        
        public Products createProduct(){
        Products productName = new Products();
        
        System.out.println("Введите название товара: ");
        productName.setProductName(scanner.nextLine());
        System.out.println("Введите цену: ");
        productName.setProductPrice(scanner.nextInt());
        System.out.println("Введите кол-во товаров: ");
        productName.setProductQuantity(scanner.nextInt());

        return productName;
        }
    public void printListProducts(Products[] products){
        for (int i = 0; i < products.length; i++) {
            Products pr  = products[i];
            System.out.printf(i+1+".  %s%n",pr.getProductName() +" - "+ pr.getProductPrice() +"| Quantity: "+pr.getProductQuantity() );
        }

    }
    
}
