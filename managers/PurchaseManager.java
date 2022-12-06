package managers;

import entity.Products;
import entity.Customers;
import entity.Purchase;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PurchaseManager {
    private final Scanner scanner = new Scanner(System.in);
    
    public Purchase buyProduct(Products[] products, Customers[] clients){
        Purchase purchase = new Purchase();
 
        
        System.out.println("Список покупателей");
        CustomerManager customerManager = new CustomerManager();
        customerManager.printListCustomers(clients);
        System.out.println("Выберите номер покупателя");
        int numberClient = scanner.nextInt();scanner.nextLine();
        
        System.out.println("Список продуктов");
        ProductManager productmanager = new ProductManager();
        productmanager.printListProducts(products);
        System.out.print("Выберите продукт: ");
        int numberProduct = scanner.nextInt();scanner.nextLine();
        System.out.println("Сколько экземляров? ");
        int quantity = scanner.nextInt();
        if(!products[numberProduct-1].quantityMinuss(quantity)){
            System.out.println("Продукта нет");
            return null;
        }

        clients[numberClient-1].setCash(clients[numberClient-1].getCash()- products[numberProduct-1].getProductPrice()*quantity);
        purchase.setProduct(products[numberProduct-1]);
        purchase.setClient(clients[numberClient-1]);
        purchase.setDate(new GregorianCalendar().getTime());
        purchase.setQuantity(quantity);
        
        
        return purchase;
        
    } 
}
