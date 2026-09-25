import java.util.Arrays;
import java.util.Scanner;
public class JavaArrays {
    public void OneDArray(Scanner sc)
    {
        System.out.print("1-D ARRAY");
        System.out.print("\nEnetr n value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enetr "+i+" array value: ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("SORTED ARRAY");
        for(int ar : arr)
        {
            System.out.print(ar+" ");
        }
        System.out.println("");
    }

    public void PrintString(Scanner sc)
    {
        System.out.print("\nEnetr n value: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enetr "+i+" String value: ");
            arr[i] = sc.next();
        }

        for(String ar : arr)
        {
            System.out.print(ar+" ");
        }
        System.out.println("");
    }

    public void TwoDArray(Scanner sc)
    {
        System.out.println("\n2-D ARRAY");
        System.out.print("Enetr a & b size: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];

        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                System.out.print("Enter ["+i+"] ["+j+"] Values : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a; i++)
        {
            Arrays.sort(arr[i]);
        }

        System.out.println("\nMATRIX ARRAY");
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < b; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // LINEAR SEARCH APPROCH
    public void SearchIndex(Scanner sc)
    {
        System.out.print("\nEnetr n value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enetr "+i+" array value: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnetr Search value: ");
        int search = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == search)
            {
                System.out.println("index ["+i+"]");
                found = true;
                break;
            }
        }
        if(!(found))
        {
                System.out.println("Not present in array");
        }
    }


    public void SearchIndexOf2D(Scanner sc) {
        System.out.print("\nEnetr m & n value: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter [" + i + "][" + j + "] array value: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("\nEnetr Search value: ");
        int search = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (arr[i][j] == search)
                {
                    System.out.println("index [" + i + "] [" + j + "]");
                    found = true;
                    break;
                }
            }
        }

        if (!(found)) {
            System.out.println("Not present in array");
        }
    }

    public void MaxMin(Scanner sc)
    {
        System.out.print("\nEnetr n value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enetr "+i+" array value: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("SORTED ARRAY");
        for(int ar : arr)
        {
            System.out.print(ar+" ");
        }
        System.out.println("");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min Value = "+min+"\nMax Value = "+max);
        System.out.println("Max Number = "+arr[n-1]);
        System.out.println("Min Number = "+arr[0]);
    }

    public void SortedOrNot(Scanner sc)
    {
        System.out.print("\nEnetr n value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enetr " + i + " array value: ");
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;
        for (int i = 1; i < n; i++)
        {
            if(arr[i] < arr[i-1])
            {
                sorted = false;
                break;
            }
        }
        if((sorted))
            System.out.println("Soretd ");
        else
            System.out.println("Not Soretd ");
    }

    public void SumOfArray(Scanner sc)
    {
        System.out.print("\nEnetr n value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enetr "+i+" array value: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("SORTED ARRAY");
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            //        int sum = 0;
            System.out.print(arr[i]+" ");
            sum = sum + arr[i];
        }
        System.out.println("\nSum = "+sum);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        JavaArrays ja = new JavaArrays();

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Primitive Example Array");
        for(int ar : arr)
            System.out.print(ar+" ");
        System.out.print("\n\n");

        ja.OneDArray(sc);

        ja.TwoDArray(sc);

        ja.SearchIndex(sc);

        ja.PrintString(sc);

        ja.MaxMin(sc);

        ja.SortedOrNot(sc);
        ja.SearchIndexOf2D(sc);
        ja.SumOfArray(sc);
        sc.close();
    }
}
