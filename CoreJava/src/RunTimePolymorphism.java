//METHOD OVERRIDING - RUN TIME POLYMORPHISM
class PaymentMoney
{
    String bankName = "KVG";
    int amount = 10000;

    void pay()
    {
        System.out.println("Ammount Paid ");
    }
}

class Card extends PaymentMoney
{
    @Override
    void pay()
    {
        System.out.println("Ammount Paid "+amount);
    }
}

class NetBanking extends PaymentMoney
{
    @Override
    void pay()
    {
        System.out.println("Ammount Paid "+amount+" Through "+bankName+ " Packages");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args)
    {
        PaymentMoney p = new Card();
        PaymentMoney p2 = new NetBanking();
        p.pay();
        p2.pay();
    }
}