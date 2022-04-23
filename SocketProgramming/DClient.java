// import java.io.*;
// import java.net.*;

// class DClient{
//    public static void main(String []args) throws IOException
//    {
//        new DClient();

//    }

//    public DClient() throws IOException
//    {
//     //    creating datagram socket

//     DatagramSocket ds = new DatagramSocket();
//     String cmessage = "hello";
//     //  Reading the IP address of server 
//     InetAddress ip = InetAddress.getByName("Utkarsh’s MacBook Air");
//     // creating datagram packet and sending the packet

//     DatagramPacket dp = new DatagramPacket(cmessage.getBytes(),cmessage.length(),ip,3000);
//     ds.send(dp);
//     // closing the connection

//     ds.close();


//    }
// }

import java.io.*;
import java.net.*;
class DClient
{
    public static void main(String args[])throws IOException
    {
	new DClient();
	}
        public DClient()throws IOException
        {
            DatagramSocket ds=new DatagramSocket();
            String cmessage="HELLO";
            InetAddress ip=InetAddress.getByName("Utkarsh’s MacBook Air");
            DatagramPacket dp=new DatagramPacket(cmessage.getBytes(),cmessage.length(),ip,3000);
            ds.send(dp);
            ds.close();
        }
    
}