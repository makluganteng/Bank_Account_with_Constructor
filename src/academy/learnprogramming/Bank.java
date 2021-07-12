package academy.learnprogramming;

public class Bank {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(){ // this is constructor
        this("56789", 2.50 , "anjing" , " default address", " default phone"); // this is special and its not really used but like if u want to check the constructor is called
        System.out.println("empty constructor");
    }

    public Bank(String accountNumber, double balance, String customerName , String email , String phoneNumber){ // this is constructor with parameter this is for the setter
        System.out.println("Bank with parameters is called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Bank(String customerName, String email, String phoneNumber) {
        this("9999",100.55,customerName,email,phoneNumber);
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public double deposit(double dollar){
        this.balance += dollar;
        System.out.println("$ "+this.balance);
        return this.balance;
    }

    public double withdraw(double dollar){
        if(dollar <= this.balance){
            double total = this.balance - dollar;
            System.out.println("$ "+total);
            return total;
        }else{
            System.out.println("Insufficient funds");
            return -1;
        }
    }
}
