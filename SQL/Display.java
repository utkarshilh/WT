import java.sql.*;

public class Display{
    public static void main(String args[])
    {
        try{
            Class.forName(com.mysql.jdbc.Driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","12345");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from detail");
            while(rs.next())
            {
                System.out.println(rs.getInt(l)+" "+rs.getString(2)+" "+rs.getInt(3));



            }
            con.close();

        }
        catch(Exeception e)
        {
            
        }
    }
}