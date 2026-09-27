import java.util.Scanner;

public class PatternsJava {

    public void SquareStar(int n, Scanner sc)
    {

        System.out.println("Square BOX");
        for(int i = 1; i <= n; i++)
        {
            System.out.print("\t");
            for(int j = 1; j <= n; j++)
            {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public void Triangle1Star(int n, Scanner sc)
    {
        System.out.println("Triangle");
        for(int i = 1; i <= 5; i++)
        {
            System.out.print("\t");
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public void Numbersle1Star(int n, Scanner sc)
    {
        System.out.println("Triangle");
        for(int i = 1; i <= 5; i++)
        {
            int num = 1;
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public void SameNumbersle1Star(int n, Scanner sc)
    {
        System.out.println("Triangle");
        for(int i = 1; i <= 5; i++)
        {
            System.out.print("\t");
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public void ContinuesNumbersle1Star(int n, Scanner sc)
    {
        System.out.println("Triangle");
        int num = 1;
        for(int i = 1; i <= 5; i++)
        {
            System.out.print("\t");
            for(int j = 1; j <= i; j++)
            {
                System.out.print(num);
                num++;
            }
            System.out.println("");
        }
    }

    public void ReveraseTriangle1Star(int n, Scanner sc)
    {
        System.out.println("ReverseTriangle ");
        for(int i = n; i >= 1; i--)
        {
            System.out.print("\t");
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public void ZeroOneTriangle1Star(int n, Scanner sc)
    {
        System.out.println("ReverseTriangle ");
        for(int i = 1; i <= n; i++)
        {
            System.out.print("\t");
            for(int j = 1; j <= i; j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print("0");
                }else
                    System.out.print("1");
            }
            System.out.println("");
        }
    }

    public void BoxSpace(int n, Scanner sc)
    {
        System.out.println("ReverseTriangle ");
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void Pyramid1Star(int n, Scanner sc)
    {
        System.out.println("PYRAMID");
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }

//        for (int i = 1; i < n; i++)
//        {
//            for (int j = i; j < n; j++)
//                System.out.print("  ");
//            for (int j = 1; j < i; j++)
//                System.out.print("1");
//            System.out.println(" ");
//        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PatternsJava pj = new PatternsJava();

        System.out.print("Enter n value :");
        int n = sc.nextInt();

        pj.SquareStar(n, sc);
        System.out.print("\n");
        pj.Triangle1Star(n, sc);
        System.out.print("\n");
        pj.ReveraseTriangle1Star(n, sc);
        System.out.print("\n");
        pj.Pyramid1Star(n, sc);
        System.out.print("\n");
        pj.Numbersle1Star(n, sc);
        System.out.print("\n");
        pj.SameNumbersle1Star(n, sc);
        System.out.print("\n");
        pj.ContinuesNumbersle1Star(n, sc);
        System.out.print("\n");
        pj.ZeroOneTriangle1Star(n, sc);
        System.out.print("\n");
        pj.BoxSpace(n, sc);
    }
}
