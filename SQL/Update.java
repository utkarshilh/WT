import java.util.*;
import java.sql.*;

class Update{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The faculty id : ");
        int iid = in.nextInt();
        System.out.println("Enter new name :");
        String iname : in.next();

        try{
           // step-1 Register the Drive 
           Class.forName("com.mysql.cj.jdbc.Driver");

           // step-2 Create connection 
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucer","root","123456");
           // step-3 create statement 
           Preparedstatement ps = con.PrepareStatement("update faculty set name =? where id = ?");
           ps.setString(1,iname);
           ps.setInt(2,iid);
           // step -4 Execute Query 

           int status = ps.executeUpdate();
           if(status ==1)
           {
               System.out.println("Record Updated ");



           }
           else
           {
               System.out.println("unable to update");

           }
           // step 5  close connection 
           con.close();

        }

        catch(Exception e)
        {
            System.out.println(e);

        }

        

    }
}