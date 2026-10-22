import java.util.Scanner;

public class SimpleBank {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long balance = 0;
        System.out.print("Enter Your pin: ");
        int pin = sc.nextInt();

        while(true)
        {
            if(pin == 1310)
            {
                System.out.println("Enter Your Choice: ");
                System.out.println("1.Check Balance \n2.Deposite \n3.Withdraw \n4.Exit");
                int choice = sc.nextInt();

                if(choice == 1)
                {
                    System.out.println("Balance Amount is "+balance);
                }
                else if(choice == 2)
                {
                    System.out.print("Enter deposite amount: ");
                    long deposite = sc.nextLong();
                    if(deposite >= 500)
                    {
                        balance += deposite;
                        System.out.println("Balance Amount is "+balance);
                    }
                    else
                        System.out.println("Deposite amount should be atleast 500");
                }
                else if(choice == 3)
                {
                    System.out.print("Enter Withdraw: ");
                    long withdraw = sc.nextLong();
                    if(balance >= withdraw )
                    {
                        balance = balance - withdraw;
                        System.out.println("Balance Amount is "+balance);
                    }
                    else
                        System.out.println("Insufficient balance");
                }
                else if(choice == 4)
                    System.exit(0);
                else
                    System.out.println("Invalid Choice");
            }
            else
                System.out.println("Wrong PIN ");
        }
    }
}
