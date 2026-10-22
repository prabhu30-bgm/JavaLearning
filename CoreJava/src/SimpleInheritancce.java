//class Employees
//{
//    String name;
//    double salary;
//
//    void showDetails()
//    {
//        System.out.println("Name is : "+name);
//        System.out.println("Salary is : "+salary);
//    }
//}
//
//class Developers extends Employee
//{
//    String Prgm;
//
//    void work()
//    {
//        System.out.println("writting code in "+Prgm+" Language");
//    }
//}
//
//public class SimpleInheritancce {
//    public static void main(String[] args) {
//
//        Developers d = new Developers();
//        d.name = "Prabhu";
//        d.salary = 45000;
//        d.Prgm = "Java";
//
//        d.showDetails();
//        d.work();
//    }
//}
//
//
//class Animal
//{
//    void sound()
//    {
//        System.out.println("Animal");
//    }
//}
//
//class Dog extends Animal
//{
//    @Override
//    void sound()
//    {
//        System.out.println("Dog barks");
//    }
//}
//
//class Cat extends Animal
//{
//    @Override
//    void sound()
//    {
//        System.out.println("Cat barks");
//    }
//}
//
//public class SimpleInheritancce {
//    public static void main(String[] args) {
//        Animal d = new Dog();
//        d.sound();
//        Animal c = new Cat();
//        c.sound();
//    }
//}

//class Animal
//{
//    void sound()
//    {
//        System.out.println("Animal");
//    }
//}
//
//class Dog extends Animal
//{
//    @Override
//    void sound()
//    {
//        System.out.println("Dog barks");
//    }
//}
//
//class Cat extends Animal
//{
//    @Override
//    void sound()
//    {
//        System.out.println("Cat barks");
//    }
//}
//
//public class SimpleInheritancce {
//    public static void main(String[] args) {
//        Animal d = new Dog();
//        d.sound();
//        Animal c = new Cat();
//        c.sound();
//    }
//}
//
//class Employees
//{
//    String name;
//    double salary;
//
//    void showDetailss()
//    {
//        System.out.println("Name is : "+name);
//        System.out.println("Salary is : "+salary);
//    }
//
//    void calculateBonus()
//    {
//        // ...
//    }
//
//}
//
//class Developers extends Employees
//{
//    void calculateBonus()
//    {
//        System.out.println("Bonus of Employee salary is : "+(salary*0.10));
//    }
//}
//
//class Manegers extends Employees
//{
//
//    void calculateBonus()
//    {
//        System.out.println("Bonus of Employee salary is : "+(salary*0.20));
//    }
//}
//
//public class SimpleInheritancce {
//    public static void main(String[] args) {
//
//        Employees d = new Developers();
//        d.name = "Prabhu";
//        d.salary = 45000;
//        d.showDetailss();
//        d.calculateBonus();
//
//        Employees m = new Manegers();
//        m.name = "Ravi";
//        m.salary = 85000;
//        m.showDetailss();
//        m.calculateBonus();
//    }
//}


class Paymentt {

    void pay(double amount) {
        System.out.println("Payment of ₹" + amount);
    }
}

class CashPayment extends Paymentt {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

class CardPayment extends Paymentt {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

class UPIPayment extends Paymentt {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

public class SimpleInheritancce {

    public static void main(String[] args) {

        Paymentt p1 = new CashPayment();
        Paymentt p2 = new CardPayment();
        Paymentt p3 = new UPIPayment();

        p1.pay(1000);
        p2.pay(1000);
        p3.pay(1000);
    }
}


