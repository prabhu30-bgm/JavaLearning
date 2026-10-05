//METHOD OVERLOADING - COMPILE TIME POLYMORPHISM
class Payment{
    String bankName;
    int amount;
    void card(int amount)
    {
        System.out.println("Ammount Paid "+amount);
    }
    void card(String bankName, int amount)
    {
        System.out.println("Ammount Paid "+amount+" Through "+bankName+" Bank");
    }
}

public class CompileTimePolyMorphism {
    public static void main(String[] args)
    {
        Payment p = new Payment();
        p.bankName = "KVG";
        p.amount = 9000;
        p.card(p.bankName,p.amount);
        p.card(p.amount);
    }
}
