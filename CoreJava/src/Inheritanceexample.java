import java.util.Scanner;

class Employee {

    String name;
    int employeeId;
    double salary;

    void work() {
        System.out.println(name + " is working.");
    }

    void showDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    void writeCode() {
        System.out.println(name + " is writing "
                + programmingLanguage + " code.");
    }

    void fixBug() {
        System.out.println(name + " is fixing a software bug.");
    }
}

class Manager extends Employee {

    int teamSize;

    void manageTeam() {
        System.out.println(name + " is managing a team of "
                + teamSize + " employees.");
    }

    void conductMeeting() {
        System.out.println(name + " is conducting a team meeting.");
    }
}

public class Inheritanceexample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Developer d = new Developer();

        System.out.print("Enter Name: ");
        d.name = sc.nextLine();
        while (!d.name.matches("[a-zA-Z ]+"))
        {
            System.out.println("Invalid name! Please enter letters only.");
            System.out.print("Enter Name again: ");
            d.name = sc.nextLine();
        }
        System.out.print("Enter EmployeID: ");
        d.employeeId = sc.nextInt();
        System.out.print("Enter Salary: ");
        d.salary = sc.nextDouble();
        System.out.print("Enter Programming Language: ");
        d.programmingLanguage = sc.next();
        System.out.println(" ");
        d.showDetails();       // Inherited
        d.work();             // Inherited
        d.writeCode();        // Developer's own method
        d.fixBug();           // Developer's own method


        System.out.println("----------------------");


        Manager m = new Manager();
        sc.nextLine();
        System.out.print("Enter Name: ");
        m.name = sc.nextLine();
        while (!m.name.matches("[a-zA-Z ]+"))
        {
            System.out.println("Invalid name! Please enter letters only.");
            System.out.print("Enter Name again: ");
            m.name = sc.nextLine();
        }
        System.out.print("Enter EmployeID: ");
        m.employeeId = sc.nextInt();
        System.out.print("Enter Salary: ");
        m.salary = sc.nextDouble();
        System.out.print("Enter TeamSize: ");
        m.teamSize = sc.nextInt();

        m.showDetails();      // Inherited
        m.work();             // Inherited
        m.manageTeam();       // Manager's own method
        m.conductMeeting();  // Manager's own method
    }
}