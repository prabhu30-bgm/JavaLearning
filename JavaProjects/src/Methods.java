public class Methods {
    public static void main(String[] args)
    {
        Methods md = new Methods();
        md.sum(10,20);
        int[] result = add(90, 98);
        System.out.println("Multiplication = " + result[0]);
        System.out.println("Addition = " + result[1]);
    }
    void sum(int a, int b)
    {
        System.out.println("Addition = " + (a - b));
        System.out.println("Addition = " + (a + b));
    }

    static int[] add(int a, int b)
    {
        int c = a*b;
        int d = a+b;
        return new int[]{c, d};
    }
}
