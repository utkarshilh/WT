// Multiple Exception Handling 

public class three{

    public static void main(String args[])
    {
        try{
            int a[] = new int[5];

            // here tow Exception can be occured ya to out of bound ya to ArithmeticException aur dono occur hoga to ??
            // if the array is out of bound or if the ArithmeticException then other Exception we shoudl get hence we need to give two cath option wich is known as multiple Exception handling 
            a[7] = 50/0;
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception " + e);


        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndex out of bound exception " + e);
        }

        // for general exeption 

        catch(Exception e){
            System.out.println("Exception "+e);

        }

        System.out.println("Remaining Code");



        // note - ek time pe ek hi cath chalega and if more than one exception occur then jo first milega tabhi bahar aa jaayega

        // Question - if we have the genreal method of exception handling line then why we need to two the abouve two cath blocks
        // Ans = We can slect the appropriate the corrective method;

    }

}