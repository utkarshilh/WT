import java.io.*;
import java.net.*;
class ChatServer extends Thread{
	ServerSocket ssoc;
	Socket soc;
	int totalClients=0;
	public static void main(String args[]) throws IOException{
		new ChatServer();
		
	}
	public ChatServer() throws IOException{
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			ssoc=new ServerSocket(2006);
			System.out.println("server started");
			while(true){
				soc=ssoc.accept();System.out.println("client connected");
               totalClients++;System.out.println("total clinents connected :"+totalClients);
			   childhandler obj=new childhandler(soc,totalClients);
			   obj.start();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			ssoc.close();
		}
	}
	
}
class childhandler extends Thread{
	String smessage="";
	Socket csoc;
	int number;
	public childhandler(Socket soc,int totalClients){
		this.csoc=soc;
		this.number=totalClients;
	}
	public void run(){
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			while(!smessage.equalsIgnoreCase("Bye")){
				ObjectInputStream input=new ObjectInputStream(csoc.getInputStream());
				String cmessage=(String)input.readObject();
				System.out.println("clinet"+number+":"+cmessage);
				System.out.print("Sever: ");
				smessage =in.readLine();
				ObjectOutputStream output=new ObjectOutputStream(csoc.getOutputStream());
				output.writeObject(smessage);
			}
			csoc.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}