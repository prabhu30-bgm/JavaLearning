public class DataTypeVariable {
    int age = 20; //Instance Variables
    static double height = 175.5; //Static Variable
    public static void main(String[] args)
    {
        boolean Car = true; // Local Variable  && Boolean only takes TRUE and FALSE
        // To access the Instance variables we have to create class object
        DataTypeVariable dv = new DataTypeVariable();
        System.out.println("Age = "+dv.age+" Height = "+dv.height+" We have car "+Car);
    }
}