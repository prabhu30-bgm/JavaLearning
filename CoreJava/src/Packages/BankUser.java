package Packages;  //Packages

public class BankUser {
    public static void main(String[] args)
    {
        Packages.BankAccount b1 = new Packages.BankAccount();
        b1.name = "Prabhu ";
        b1.accountType = "Savings";
        b1.user = "Email0";
        System.out.println(b1.name+" customer account type is "+b1.accountType +" "+b1.user);
        System.out.println("Password is "+b1.getPassword());
    }
}
