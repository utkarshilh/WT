// We can jave the try inside try  hence java supports the nested try cath

public class four{

    public static void main(String args[])
    {
        try
        {
            int c = 50/0;

            try
            {
                int a[]= new int[5];
                 a[7] = c;


            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException" + e);


            }  
        }

        catch(ArithmeticException e){
            System.out.println("ArithmeticExcepton "+e);

        }
        System.out.println("Remainign code");


    }

}