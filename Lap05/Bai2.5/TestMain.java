package oop1;

public class TestMain
{
    public static void main(String[] args)
    {
        Customer customer1 = new Customer(123, "Zed", 'm');
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getID());
        System.out.println("name is: " + customer1.getName());
        System.out.println("gender is: " + customer1.getGender());

        Account account1 = new Account(456, customer1, 121.167);
        System.out.println(account1);
        System.out.println("id is: " + account1.getId());
        System.out.println("balance is: " + account1.getBalance());
        System.out.println("customer name is: " + account1.getCustomerName());
        System.out.println("customer is: " + account1.getCustomer());
        Account account2 = account1.deposit(50.587);
        System.out.println(account2);
        Account account3 = account1.withDraw(30.746);
        System.out.println(account3);
    }

}
