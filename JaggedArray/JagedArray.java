import java.util.*;

public class JagedArray{
     public static void main(String args[])
     {
       int a[][] = new int[5][];

       int s[] = new int[5];

       s[0] = 4;
       s[1] = 3;
       s[2] = 1;
       s[3] = 5;
       s[4] = 2;

     for(int i=0;i<5;i++)
     {
        a[i] = new int[s[i]];
     }

     int count =1;

     for(int i=0;i<5;i++)
     {
        for(int j=0;j<s[i];j++)
        {
         a[i][j] = count;
         count++;

        }
     }

     for(int i=0;i<5;i++)
     {
        for(int j=0;j<s[i];j++)
        {
           System.out.print(a[i][j] + "  ");


        }

         System.out.println("");

     }
}
}



    

      