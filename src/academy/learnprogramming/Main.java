package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("12345", 0.00, "Bob Brown", "myemail@bob.com","(+60)1234567"); // ini ada parameter nya
        System.out.println(bank.getBalance());
        System.out.println(bank.getPhoneNumber());

        bank.deposit(150.55);

        Bank timsaccount = new Bank("Tim", "tim@mail.com" , "12345");
        System.out.println(timsaccount.getPhoneNumber() + " name " + timsaccount.getCustomerName());
        System.out.println("current balance is " + timsaccount.getBalance());
        timsaccount.withdraw(100.55);

        /*VIP_Customer person1 = new VIP_Customer();
        System.out.println(person1.getName()); // ini kan no parameter jadi dia bakal ambil default yang kita bikin di class

        VIP_Customer person2 = new VIP_Customer("anjing" , 50000);
        System.out.println(person2.getEmailAddress() + " " + person2.getName());// since ini ada parameter it will take from parameter tapi kalo gak ada maka akan ambil default dari constructor

        VIP_Customer person3 = new VIP_Customer("Tim" , 100.0 , "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress()); // ini semua parameter nya ada jadi bakal ambil dari parameter */
    }
}
