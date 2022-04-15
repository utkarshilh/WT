import java.io.*;
import java.net.*;

public class MathServer{
    ServerSocket ssoc;
    Socket soc;

    public static void main(String []args)
    {
        new MathServer();

    }
    public MathServer()
    {
        try{
            ssoc = new ServerSocket(2005);
            System.out.println("server started");
            soc = ssoc.accept();
            System.out.println("client connected");
            ObjectInputStream input = new ObjectInputStream(soc.getInputStream());
            String cmessage = (String)input.readObject();
            int num =  Integer.parseInt(cmessage);
            int result =1;
            for(int i=1;i<=num;i++)
            {
                result=result*i;
            }
            String smessage = result+"";
            System.out.println("Computation completed");
           ObjectOutputStream output = new ObjectOutputStream(soc.getOutputStream());
           output.writeObject(smessage);
           System.out.println("Response send");
           soc.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}