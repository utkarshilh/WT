// Interface main class

public class InterfaceMainClass{
    public static void main(String args[])
    {  
        Rectangle obj1 = new Rectangle();
        Circle obj2 = new Circle();
        System.out.println("Area of Rectangle :"+ obj1.Area(3f,5f));

        System.out.println("perimeter of Rectangle :" + obj1.Perimeter(3f,5f));

        System.out.println("Area of Circle :" + obj2.Area(5.9f,6.6f));

    }
}