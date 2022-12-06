package entity;

public class Customers {
    private String firstname;
    private String lastname;
    private int cash;
    public Customers() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Покупатель{" + "Имя=" + firstname 
                           + ", Фамилия=" + lastname 
                           + ", Деньги=" + cash 
                        + '}';
    }
    
}
