import java.util.*;

public class temp{
    public static void main(String args[])
    {
        int a[][] = new int[5][];

        // int a[0]= new int[1];
        // int a[1]= new int[2];
        // int a[2]= new int[3];       
        // int a[3]= new int[4];               
        // int a[4]= new int[5];

        int s[] = new int[10000];
        s[0] = 1;
        s[1] = 2;
        s[2] = 3;
        s[3] = 4;
        s[4] = 5;

        for(int i=0;i<5;i++)
        {
            a[i] = new int[s[i]];

        }

        int count = 1;

        for(int i=0;i<5;i++)
        {
            int ss = a[i].length;

            for(int j=0;j<ss;j++)
            {
                a[i][j] = count;
                count++;

            }


        }

        for(int i=0;i<5;i++)
        {
            int ss = a[i].length;

            for(int j=0;j<ss;j++)
            {
                System.out.print(a[i][j]+" ");

                 
            }
            System.out.println("");



        }


    }
}