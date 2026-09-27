import java.util.Scanner;

public class ConditionalStatements {
    public void IfElse(int pwd)
    {
        if(pwd == 1310) {
            System.out.println("Basavaprahu Kudenatti ");
            System.out.println("MCA Student @BMSIT ");
            System.out.println("Software Developer");
        }
        else
            System.out.println("Wrong Password ");
    }

    public void IfElseIf(int age)
    {
        if(age >= 45 )
            System.out.println("Promote as HOD");
        else if(age > 30 && age < 45)
            System.out.println("Promote as Associate Professor ");
        else
            System.out.println("Assistant Professor");
    }

    public void NestedIf(int ageis, Scanner sc)
    {
        if(ageis >= 18)
        {
            System.out.print("Do you have license: ");
            boolean license = sc.nextBoolean();
            if(license )
            {
                System.out.println("Eligible for driving");
            }
            else
                System.out.println("Not Eligible for driving");
        }
        else
            System.out.println("Under 18 are not allowed to drive ");

    }

    public void SwitchCase(char grade, Scanner sc)
    {
        switch(grade)
        {
            case 'A' :
                System.out.println("Distiction");
                break;
            case 'B' :
                System.out.println("Best");
                break;
            case 'C' :
                System.out.println("Average");
                break;
            case 'D' :
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ConditionalStatements cs = new ConditionalStatements();
        while(true)
        {
            System.out.print("Enter pwd value: ");
            int pwd = sc.nextInt();
            cs.IfElse(pwd);

            System.out.print("Enter age value: ");
            int age = sc.nextInt();
            cs.IfElseIf(age);

            System.out.print("Enter ageis value: ");
            int ageis = sc.nextInt();
            cs.NestedIf(ageis, sc);

            System.out.print("Enter Student Grade: ");
            char grade = sc.next().charAt(0);
            cs.SwitchCase(grade, sc);

            System.out.print("Do you want to continue: ");
            String des = sc.next();

            if(des.equalsIgnoreCase("no"))
            {
                break;
            }
        }
        sc.close();
    }
}
