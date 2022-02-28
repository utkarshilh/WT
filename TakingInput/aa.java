import java.io.Console;


// // to take the input using Console calss
// Benefits - it gives the features of taking input of passowrd

public class aa{
    public static void main(String args[])
    {
        Console in = System.console();

        System.out.println("Enter any Integer");
        int i = Integer.parseInt(in.readLine());
        System.out.println("integer: "+i);

        System.out.println("Enter nay float number");
        float f = parseFloat(in.readLine());
        System.out.println("float :" + f);

        System.out.println("Enter any string ");
        String s = in.readLine();
        System.out.println("String is "+ s);

        System.out.println("Enter any character");
        char c= (in.readLine()).charAt(0);

        System.out.println("charcter"+ c);

        // Taking input of password 

        System.out.println("Enter the password");
        char[] pass = in.readPassword();
        String spass = String.valueOfPassword();
        System.out.println("password"+spass);


        // String spass = String.valueOf(pass);





    }
}