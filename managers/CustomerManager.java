package managers;

import entity.Customers;
import java.util.Scanner;

public class CustomerManager {
    private final Scanner scanner;

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

    public void printListCustomers(Customers[] customers) {
        for (int i = 0; i < customers.length; i++) {
            Customers c = customers[i];
            System.out.printf(i+1+".%s %s %s%n"
                    ,c.getFirstname()
                    ,c.getLastname()
                    ,c.getCash()
            );
        }
    }
}
