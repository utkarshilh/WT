import java.io.*;
import java.net.*;

class EchoServer
{
    ServerSocket ssoc;
    Socket soc;

    public static void main(String args[])
    {
        new EchoServer();

    }
    public EchoServer()
    {
        try
        {
            ssoc=new ServerSocket(2004);
            System.out.println("Echo Server Started");
            soc=ssoc.accept();
            System.out.println("Clienet connected");
            ObjectInputStream input=new ObjectInputStream(soc.getInputStream());
            String cmessage=(String)input.readObject();
            System.out.println("Client Message :"+cmessage);
            ObjectOutputStream output=new ObjectOutputStream(soc.getOutputStream());
            output.writeObject(cmessage);
            System.out.println("Data Send");
            soc.close();
        }
        catch(Exception e)
          {
            System.out.println(e);
         }
    }
}