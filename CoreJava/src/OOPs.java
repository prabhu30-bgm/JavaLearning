import java.lang.invoke.StringConcatFactory;

class Pen
{
    String color;
    String type;

    public void write()
    {
        System.out.println("write something with "+color+" pen like ");
    }
}
public class OOPs {
    public static void main(String[] args)
    {
        Pen pen = new Pen();
        pen.color = "Black";
        pen.type = " BallPen";
        pen.write();
    }
}
