package managers;

import entity.Customers;
import java.util.Scanner;

public class CustomerManager {
    private Scanner scanner;

    public CustomerManager() {
        this.scanner = new Scanner(System.in);
    }
    public Customers createCustomer(){
    Customers customer = new Customers();
    System.out.println("Имя");
    customer.setFirstname(scanner.nextLine());
    System.out.println("Фамиллия");
    customer.setLastname(scanner.nextLine());
    System.out.println("Денег");
    customer.setCash(scanner.nextInt());
    return customer;
    }

}