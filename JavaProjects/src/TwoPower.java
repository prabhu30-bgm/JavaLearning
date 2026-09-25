import java.util.Scanner;

public class TwoPower {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        int rem = n;
        while(rem > 1)
        {
            rem %= 2;
            if(rem == 1)
                return false;
            n = n/2;
            rem = n;
        }
        return rem == 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        TwoPower tp = new TwoPower();
        System.out.println(tp.isPowerOfTwo(n));
        sc.close();
    }
}
