import java.util.Scanner;

public class input_using_Scanner{

   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);


     System.out.println("Input Integer");
     int n = sc.nextInt();
     System.out.println("Integer : " + n);


     System.out.println("Input char");
     char ss  = sc.next().charAt(0);
     System.out.println("char : " +ss);

    System.out.println("Input String");
     String i = sc.nextLine();
     System.out.println("String : " + i);

   System.out.println("Input float");
     float gg  = sc.nextFloat();
     System.out.println("float : " + gg);
  
    
  
}
}







     
