// unchecked exception in exception propogation

public class nnine{
    public static void main(String args[])
    {
        nnine obj = new nnine();

        obj.m();
        System.out.println("remaining code");


    }

    void m(){

        n();

    }

    void n(){
        try{
             o();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");

        }

    }

    void o(){
        throw new ArithmeticException("sorry");  
    }
}