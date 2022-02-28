import java.util.*;
import java.io.*;

public class height{
    public static void main(String args[])
    {
        Node root = new Node(30);
        root.right = new Node(60);
        root.left = new Node(40);
        root.left.left = new Node(70);
        root.left.left.left = new Node(80);

        // it will return the height of the tree
         int n = call(root,0);

         System.out.println("the height of the tree is" + n);

    }

    public static int call(Node root,int max_height)
    {
        
        if(root!=null)
        {
            int temp1 = 1 + call(root.right,max_height);
            int temp2 = 1 + call(root.left,max_height);

             return Integer.max(temp1,temp2);
             

        }

        // yahan tak function kahbi pahuchega hi nahi so it is written to remove the error of return 
        return 0;

    }
   
};


class Node{
    int key;
    Node left;
    Node right;
     Node(int k)
     {
         key = k;

     }
}