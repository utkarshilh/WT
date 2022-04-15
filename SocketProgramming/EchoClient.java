import java.io.*;
import java.net.*;



public class EchoClient{
    Socket soc;

    public static void main(String []args)
    {
        new EchoClient();

    }

    public EchoClient()
    {
        try{
            soc = new Socket("127.0.0.1",2004);
            System.out.println("server connected");

            ObjectOutputStream output = new ObjectOutputStream(soc.getOutputStream());

            String message = "hello";
            output.writeObject(message);
            System.out.println("messae send");
            
            ObjectInputStream input= new ObjectInputStream(soc.getInputStream());
            String smessage = (String)input.readObject();

            System.out.println("server :" +smessage);
            soc.close();
        }

        catch(Exception e)
        {
            System.out.println(e);

        }
    }
}