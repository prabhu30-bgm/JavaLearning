class Persons {
    private String firstName;
    private String lastName;

    public Persons(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    // Getters and Setters
    public String getFirstName()
    {
        return firstName + lastName;
    }
    public void setFirstName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class Father extends Persons {
    private double age;

    public Father(String firstName, String lastName, double age)
    {
        super(firstName, lastName);
        this.age = age;
    }

    public double getAge()
    {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Father f = new Father("Suresh", "Kudenatti", 50000);
        System.out.println("Father: " + f.getFullName()+" AND his Age is "+f.getAge());
    }
}