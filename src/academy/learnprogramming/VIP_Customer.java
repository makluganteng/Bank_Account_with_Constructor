package academy.learnprogramming;

public class VIP_Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIP_Customer() {
        this("default", 50000 , "default@gmail.com");
    }

    public VIP_Customer(String name, double creditLimit) {
        this(name,creditLimit,"unknown@email.com");
    }

    public VIP_Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
