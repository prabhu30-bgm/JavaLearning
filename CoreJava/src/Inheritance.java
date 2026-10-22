class Shape{ //BASE CLASS OF INHERITANCE OR PARENT CLASS

}

//SINGLE AND MULTILEVEL INHERITANCE
class Square extends Shape{  //CHILD CLASS OR SUB CLASS
    public void display(int height, int width)
    {
        System.out.println("Square = "+(height*width));
    }
}

class PerfectSquare extends Square //CHILD CLASS OR SUB CLASS
{
    public void Show(int height, int width)
    {
        System.out.println("PerfectSquare = "+(height*width));
    }
}


//HIERARCHIAL INHERITANCE
class Circle extends Shape{ //CHILD CLASS OR SUB CLASS
    public void display(int radius)
    {
        System.out.println("Circle = "+(2*3.142*radius));
    }
}

class Triangle extends Shape //CHILD CLASS OR SUB CLASS
{
    public void Show(int height, int breadth)
    {
        System.out.println("Triangle = "+(height*breadth));
    }
}

public class Inheritance {
    public static void main(String[] args){

//        SINGLE AND MULTILEVEL INHERITANCE
//        Square s = new Square();
        System.out.println("SINGLE AND MULTILEVEL INHERITANCE Example");
        PerfectSquare ps = new PerfectSquare();
        ps.display(85,74);
        ps.Show(85,85);

//        HIERARCHIAL INHERITANCE
        System.out.println("\nHIERARCHIAL INHERITANCE Example");
        Circle c = new Circle();
        c.display(50);

        Triangle t = new Triangle();
        t.Show(85,85);
    }
}


