import java.util.Scanner;

public class TransferStatements {
    public void Continue(int n)
    {
           for(int i = 1; i<=n; i++) {
               if (i % 2 == 0){
                   System.out.print("* ");
                   continue;
               }
               if(i == 11)
                   break;
               System.out.print(i + " ");
           }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransferStatements ls = new TransferStatements();
        System.out.print("Enter n value:");
        int n = sc.nextInt();
        ls.Continue(n);
    }
}
