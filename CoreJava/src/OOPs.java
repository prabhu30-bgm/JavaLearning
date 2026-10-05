class Pen
{
    String color; // multiple attributes
    String type;
    int price = 20;

    //PARAMETERIZED CONSTRUCTOR
    Pen(String colour, String PenType)
    {
        this.color = colour;
        this.type = PenType;
    }

    public void write()
    {
        System.out.println("write something with "+color+" with "+type+" pen like ");
    }
}

class Car
{
    String brand;
    String name;
    int milage;

    public void Details()
    {
        System.out.println("This car is made by "+brand+" and name of this car is "+name+" and this car also gives the milege upto "+milage+" KM per hour");
    }

    public void carSpeed(int speed)
    {
        System.out.println("Speed of the "+name+" is "+speed+" KM/hour");
    }

    //COPY CONSTRUCTORS IN JAVA
    Car(Car c2)
    {
        this.brand = c2.brand;
        this.name = c2.name;
        this.milage = c2.milage;
    }

    Car()
    {

    }
}


class Person
{
    String city;
    int population;

    //NON-PARAMETERIZED CONSTRUCTOR
    Person()
    {
        System.out.println("Non Parameter Constructor");
    }

}
public class OOPs {
    public static void main(String[] args)
    {
        System.out.println("PEN CLASS");
        Pen pen = new Pen("Black", "Gen Pen");  // Multiple Objects pen and pen1
        Pen pen1 = new Pen("Blue","Boll Pen");
        pen.write();
        pen1.write();
        System.out.println(pen1.price); // Accessing attribute
        pen.price = 30; //Modifying attribute
        System.out.println(pen.price);

        System.out.println("\nCAR CLASS");
        Car car1 = new Car();
        car1.brand = "TATA";
        car1.name = "Fortuner";
        car1.milage = 20;
        Car c2 = new Car(car1);
        c2.Details();
        car1.carSpeed(pen1.price); // Accessing the attribute value of different class

        System.out.println("\nPERSON CLASS");
        Person p = new Person();
        p.city = "Bengaluru";
        p.population = 5000;
        System.out.println(p.city +" "+ p.population);

    }
}
