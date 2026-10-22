import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a & b value:" );
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("Result = "+result );
    }
}
