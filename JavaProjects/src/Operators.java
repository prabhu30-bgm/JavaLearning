import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Operators {

        public void ArithmeticOpe(Scanner sc)
        {
            System.out.print("Airthmetic Operators\n");
            System.out.print("Enter first number : ");
            long result = sc.nextLong();

            while (true)
            {
                System.out.print("Enter Your Choice(+, -, *, /, To exit ?) : ");
                char choice = sc.next().charAt(0);

                if (choice == '?')
                    break;

                System.out.print("Enter number ( 0 to stop): ");
                int number = sc.nextInt();

                if(number == 0)
                    break;

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
                        break;
                }

            }
            System.out.println("Result: " + result);
    }

    public void RelationalOpe(Scanner sc)
    {
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter "+i+"th array values: ");
            arr[i] = sc.nextInt();
        }
        int big = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > big)
            {
                big = arr[i];
            }
        }
        System.out.println("Biggest = "+big);

        System.out.print("Enter first value : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second value : ");
        int num2 = sc.nextInt();

        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
    }

    public void LogicalOpe(Scanner sc)
    {
        System.out.print("Enter first value : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second value : ");
        int num2 = sc.nextInt();

        System.out.println(num1 > num2 || num1 <= num2 );
        System.out.println(num1 < num2 && num1 <= num2);
        System.out.println(!(num1 == num2) );
    }

    public void IncreDecre(Scanner sc)
    {
        System.out.print("Enter first value : ");
        int num1 = sc.nextInt();
        System.out.println(num1++);
        System.out.println(num1--);
        System.out.println(--num1 );
        System.out.println(++num1);

        System.out.print("Enter first value : ");
        int num2 = sc.nextInt();

        System.out.println(++num2 );
        System.out.println(--num2);
        System.out.println(num2--);
        System.out.println(num2++ );
    }

    public void AssignmentOpe(Scanner sc)
    {
        System.out.print("Enter first value : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second value : ");
        int num2 = sc.nextInt();
        System.out.println(num1 += num2 );
        System.out.println(num1 -= num2 );
        System.out.println(num1 *= num2 );
        System.out.println(num1 /= num2 );
    }

    public void TernaryOpe(Scanner sc)
    {
        System.out.print("Enter first value : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second value : ");
        int num2 = sc.nextInt();
        System.out.print("Enter second value : ");
        int num3 = sc.nextInt();
        int c = (num1 > num2)?(num1 > num3 ?num1:num2):(num2 > num3?num2 : num3);
        System.out.print(c);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Operators op = new Operators();

        op.ArithmeticOpe(sc);
        op.RelationalOpe(sc);
        op.LogicalOpe(sc);
        op.IncreDecre(sc);
        op.AssignmentOpe(sc);
        op.TernaryOpe(sc);
        sc.close();
    }
}
