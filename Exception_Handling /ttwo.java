public class ttwo{
    public static void main(String args[])
    {
        // the aim is to tell the compiler /computer that this statement can have error
        try{
            int a = 5/0;
        }

        catch(ArithmeticException e)
        {
            System.out.println("Eception raised " );

            // we can print the Exception also 

            //  System.out.println("Eception raised "+e);
        }

        System.out.println("Reamaining code");


        // here we concluded that we can run further code even after the error occured

    }
};