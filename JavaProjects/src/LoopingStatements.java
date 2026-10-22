import java.util.Scanner;
public class LoopingStatements {
    public void ForLoop(int a,int n)
    {

        for(int i = a; i<=n; i++)
        {
            for(int j = 1; j<=10; j++)
            {
                System.out.println(i + "*" + j + "=" + i * j);

            }
            System.out.println("");
        }
    }

    public void WhileLoop(int num1,int num2)
    {
        int sum = 0, reverse = 0;
        while( num1 > 0)
        {
            sum =  sum + num1 % 10; // calculate remeinder
            num1 = num1 / 10; // Leaves remeinder
        }
        System.out.println("Sume of num1 = "+sum);

        while( num2 > 0)
        {
            int summ = num2 % 10; // calculate remeinder
            reverse = reverse * 10 + summ; // * 10 move the value one step next
            num2 = num2 / 10; // Leaves remeinder
        }
        System.out.println("Reverse of num2 = "+reverse);
    }

    public void DoWhile(Scanner sc)
    {
        double num;
        do
        {
            System.out.print("Enter a number : ");
            num = sc.nextDouble();
            if(num > 0)
                System.out.println("Positive");
            else if(num < 0)
                System.out.println("Negetive");

        }while(num != 0);
        System.out.println("It is neither negative nor positive");
    }

    public void ForEach()
    {
        String[] names = {"Hallo", "Hii", "Bye"};
        for(String name : names)
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LoopingStatements ls = new LoopingStatements();
        System.out.print("Enter start value:" );
        int a = sc.nextInt();

        System.out.print("Enter end value:" );
        int n = sc.nextInt();
        ls.ForLoop(a,n);

        System.out.print("Enter Num1 value:" );
        int num1 = sc.nextInt();
        System.out.print("Enter Num2 value:" );
        int num2 = sc.nextInt();
        ls.WhileLoop(num1,num2);

        System.out.println("Do-while Loop" );
        ls.DoWhile(sc);

        System.out.println("Foe Each Loop" );
        ls.ForEach();

        sc.close();
    }
}
