package jptv21shopzadera;

import entity.Products;
import entity.Customers;

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
    int history[];
   
    public App() {
        this.products = new Products[0];
        this.customers = new Customers[0];
        ProductManager = new ProductManager();
        CustomerManager = new CustomerManager();
        this.history=new int[0];
       
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        int repeat = 1;
        do{
            System.out.println("Функции приложения:");
            System.out.println("Выберите номер функции");
            System.out.println("1. Закрыть приложение");
            System.out.println("2. Добавить продукт");
            System.out.println("3. Список продоваемых продуктов");
            System.out.println("4. Добавтиь покупателя");
            System.out.println("5. Список зарегестрированных покупателей");
            System.out.println("6. Покупка покупателем продукта");
            System.out.println("7. Доход магазина за время работы");
            System.out.println("8. Добавить денег покупателю");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 1:
                    System.out.println("Приложение закрывается!");
                    break;
                case 2:
                    System.out.println("Добавление продукта");
                    ProductManager product = new ProductManager();
                    
                    this.products = Arrays.copyOf(this.products, this.products.length+1);
                    this.products[this.products.length-1] = product.createProduct();
                    
                    break;
                case 3:
                    System.out.println("Добавление клиента");
                    CustomerManager customerManager = new CustomerManager();
                    
                    this.customers = Arrays.copyOf(this.customers, this.customers.length+1);
                    this.customers[this.customers.length-1] = customerManager.createCustomer();
                    break;
                case 4:
                    System.out.println("Все товары");
                    for (int i = 0; i<products.length;i++){
                        Products productName = products[i];
                        System.out.println("\t[");
                        System.out.printf(i+1+".product{title    = %s%n", productName.getName());
                        System.out.printf("product{price    = %s%n", productName.getPrice());
                        System.out.printf("product{quantity = %s%n", productName.getQuantity());
                        System.out.println("\t]");
                    }
                    break;
                case 5:
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
                case 6:
                    System.out.println("Покупка");
                    System.out.println("Customer List");
                    for (int i = 0; i<customers.length;i++){
                        Customers customer = customers[i];
                        System.out.println("\t[");
                        System.out.printf(i+1+".Customer{Firstname = %s%n", customer.getFirstname());
                        System.out.printf("        {Lastname  = %s%n", customer.getLastname());
                        System.out.printf("        {Cash      = %s%n", customer.getCash());
                        System.out.println("\t]");
                    }
                    System.out.println("Товары");
                        for (int j = 0; j<products.length;j++){
                        Products productName = products[j];
                        System.out.println("\t[");
                        System.out.printf(j+1+".product{title    = %s%n", productName.getName());
                        System.out.printf("      {price    = %s%n", productName.getPrice());
                        System.out.printf("      {quantity = %s%n", productName.getQuantity());     
                        System.out.println("\t]");
                    }
                    System.out.println("Выберите клиента");
                    int pur = scanner.nextInt();
                    System.out.println("Выберите товар");
                    int pur1 = scanner.nextInt();
                    int newpur = customers[pur-1].getCash() - products[pur1-1].getPrice();
                    customers[pur-1].setCash(newpur);
                    int newpurl = products[pur1-1].getQuantity() - 1;
                    products[pur1-1].setQuantity(newpurl);
                    

                    this.history = Arrays.copyOf(this.history, this.history.length+1);
                    this.history[this.history.length-1] = products[pur1-1].getPrice();
                    
                    break;
                case 7:
                    System.out.println("Доход магазина");
                    int sum = IntStream.of(history).sum();
                    System.out.println("Все доходы=" + sum);
                   
                    break;
                case 8:
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
        }while(repeat!=1);
        System.out.println("Пока!");
    }
}
