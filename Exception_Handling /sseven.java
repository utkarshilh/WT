public class sseven{
    
    public static void main(String args[])
    {
        try 
        {
            int a = 50/0;
            System.out.println(a);


        }

        catch(ArithmeticException e)
        {
            System.out.println("Exception Handled");

        }
         finally
         {
            System.out.println("finally Block");
         }

         System.out.println("Remaining Code");

        //    ques kis case me finally keyword run nahi hoga
    }
   
}