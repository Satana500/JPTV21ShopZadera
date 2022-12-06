package jptv21shopzadera;

import entity.Products;
import entity.Customers;
import entity.Purchase;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import managers.CustomerManager;
import managers.ProductManager;

public class App {
    private Products[] products;
    private Customers[] customers;
    private final ProductManager ProductManager;
    private final CustomerManager CustomerManager;
 
    public App() {
        
        this.products = new Products[0];
        this.customers = new Customers[0];
        ProductManager = new ProductManager();
        CustomerManager = new CustomerManager();
       
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        int repeat = 1;
        do{
            System.out.println("Функции приложения:");
            System.out.println("Выберите номер функции");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить продукт");
            System.out.println("2. Добавтиь покупателя");
            System.out.println("3. Список продоваемых продуктов");
            System.out.println("4. Список зарегестрированных покупателей");
            System.out.println("5. Покупка покупателем продукта");
            System.out.println("6. Доход магазина за время работы");
            System.out.println("7. Добавить денег покупателю");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Приложение закрывается!");
                    break;
                case 1:
                    System.out.println("Добавление продукта");
                    ProductManager product = new ProductManager();
                    
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = product.createProduct();
                    
                    break;
                case 2:
                    System.out.println("Добавление клиента");
                    CustomerManager customerManager = new CustomerManager();
                    
                    this.customers = Arrays.copyOf(this.customers, this.customers.length+1);
                    this.customers[this.customers.length-1] = customerManager.createCustomer();
                    break;
                case 3:
                    System.out.println("Все товары");
                    for (int i = 0; i<products.length;i++){
                        Products productName = products[i];
                        System.out.println("\t[");
                        System.out.printf(i+1+".product{title    = %s%n", productName.getProductName());
                        System.out.printf("product{price    = %s%n", productName.getProductPrice());
                        System.out.printf("product{quantity = %s%n", productName.getProductQuantity());
                        System.out.println("\t]");
                    }
                    break;
                case 4:
                    System.out.println("Клиент");
                    for (int i = 0; i<customers.length;i++){
                        Customers customer = customers[i];
                        System.out.println("\t[");
                        System.out.printf(i+1+".Customer{Firstname = %s%n", customer.getFirstname());
                        System.out.printf("Customer{Lastname  = %s%n", customer.getLastname());
                        System.out.printf("Customer{Cash      = %s%n", customer.getCash());
                        System.out.println("\t]");
                    }
                        
                    
                    break;
                case 5:
                    System.out.println("Покупка продукта");
                    System.out.println("список покупателей: ");
                    for(int i = 0; i < customers.length; i++){
                        System.out.printf("%d %s %s. money: %s %n",
                                i+1
                                ,customers[i].getFirstname()
                                ,customers[i].getLastname()
                                ,customers[i].getCash()
                        );
                    }
                    int buy1 = scanner.nextInt();
                    System.out.println("Продукты: ");
                    for(int j = 0; j< products.length; j++){
                        System.out.println(j+1);
                    }
                    int buy2 = scanner.nextInt();
                    int pur = customers[buy1-1].getCash() - products[buy2-1].getProductPrice();
                    customers[buy1-1].setCash(pur);
                    this.purchase = Arrays.copyOf(this.purchase,this.purchase.length+1);
                    this.purchase[this.purchase.length-1]=PurchaseManager.buyProduct(products,customers);
                    break;
                case 6:
                    System.out.println("Доход магазина");
                    int sum = IntStream.of(purchase).sum();
                    System.out.println("Все доходы=" + sum);
                   
                    break;
                case 7:
                    for (int i = 0; i<customers.length;i++){
                        Customers customer = customers[i];
                        System.out.println("\t[");
                        System.out.printf(i+1+".Customer{Firstname = %s%n", customer.getFirstname());
                        System.out.printf(" {Lastname = %s%n", customer.getLastname());
                        System.out.printf(" {Cash = %s%n", customer.getCash());
                        System.out.println("\t]");
                    }
                    System.out.println("Выберите клиента");
                    int num = scanner.nextInt();
                    System.out.println("Ведите сколько денег добавить");
                    int num2 = scanner.nextInt();
                    int newcash = customers[num-1].getCash() + num2;
                    customers[num-1].setCash(newcash);
                    break;
            }
            System.out.println("=========----------=========");
        }while(repeat!=0);
        System.out.println("Пока!");
    }
}
