package managers;

import entity.Products;
import entity.Price;
import java.util.Scanner;

public class ProductManager {
    private Scanner scanner;
    
    public ProductManager() {
        this.scanner = new Scanner(System.in);
    }
        
        public Products createProduct(){
        Products productName = new Products();
        
        System.out.println("Введите название товара: ");
        productName.setName(scanner.nextLine());
        System.out.println("Введите бренд: ");
        
        System.out.println("Введите цену: ");
        productName.setPrice(scanner.nextInt());
        System.out.println("Введите кол-во товаров: ");
        productName.setQuantity(scanner.nextInt());

        return productName;
        }
        
          
}


