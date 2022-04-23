import java.io.*;
import java.net.*;
class DServer
{
    public static void main(String []args) throws IOException
    {
        new DServer();

    }

    public DServer() throws IOException
    {
        // crating datagram socket and binding port 3000
        DatagramSocket ds = new DatagramSocket(3000);
        System.out.println("Server Started");
        byte[] buff = new byte[1024];
        // creating datagram packets for receiving data
        DatagramPacket dp = new DatagramPacket(buff,1024);
        ds.receive(dp);
        String cmessage = new String(dp.getData(),0,dp.getLength());
        System.out.println("client : "+cmessage);
        ds.close();

    }
}