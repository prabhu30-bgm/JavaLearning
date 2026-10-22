import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        long result = sc.nextLong();

        while (true)
        {
            System.out.print("Enter Your Choice(+, -, *, /, To exit ?) : ");
            char choice = sc.next().charAt(0);

            if (choice == '?')
                break;

            System.out.print("Enter number (0 to stop): ");
            int number = sc.nextInt();

            switch(choice)
            {
                case '+' :
                    result += number;
                    break;
                case '-' :
                    result -= number;
                    break;
                case '*' :
                    result *= number;
                    break;
                case '/'  :
                    result /= number;
                    break;
                default:
                    System.out.print("Invalid choice");
//                    break;
            }

        /*    if(choice == '+')
                result += number;
            else if (choice == '-')
                result -= number;
            else if (choice == '*')
                result *= number;
            else if (choice == '/')
                result /= number;
            else if (choice == '?')
                System.exit(0);
            else
                System.out.print("Invalid choice"); */

        }
        System.out.println("Result: " + result);
        sc.close();
    }
}