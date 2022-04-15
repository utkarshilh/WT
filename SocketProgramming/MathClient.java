// public class MathClient{
//     public static void main(String []args)
//     {
//         new MathClient();
//     }

//     public MathClient{
//         try{
// 			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
// 			soc =new Socket("localhost",2005);
// 			System.out.println("server started");
// 			System.out.println("enter nay int number :");
// 			int num=Integer.parseInt(in.readLine());
// 			String cmessage=num+"";
// 			ObjectOutputStream output=new ObjectOutputStream(soc.getOutputStream());
// 			output.writeObject(cmessage);
// 			ObjectInputStream input=new ObjectInputStream(soc.getInputStream());
// 			String smessage=(String)input.readObject();
// 			System.out.println("server result :"+ smessage);
// 			soc.close();
			
			
// 		}
    
//         catch(Exception e)
//         {
//          System.out.println(e);
//          }
//     }
// }
import java.io.*;
import java.net.*;
class MathClient{
	//ServerSocket ssoc;
	Socket soc;
	public static void main(String args[]){
		new MathClient();
	}
	public MathClient(){
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			soc =new Socket("localhost",2005);
			System.out.println("server started");
			System.out.println("enter nay int number :");
			int num=Integer.parseInt(in.readLine());
			String cmessage=num+"";
			ObjectOutputStream output=new ObjectOutputStream(soc.getOutputStream());
			output.writeObject(cmessage);
			ObjectInputStream input=new ObjectInputStream(soc.getInputStream());
			String smessage=(String)input.readObject();
			System.out.println("server result :"+ smessage);
			soc.close();
			
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}