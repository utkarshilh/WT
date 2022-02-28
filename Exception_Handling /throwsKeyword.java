import java.io.IOException;

public class throwsKeyword{
    public static void main(String args[])
    {
        throwsKeyword obj = new throwsKeyword();

        obj.m();
        System.out.println("Remaining Code");

    }
    void m() 
    {
        try{
             n();
        }
        catch(IOException e)
        {

        }

    }

    void n() throws IOException
    {
        o();

    }

    void o() throws IOException
    {
        throw new IOException("My Exception");

    }
}