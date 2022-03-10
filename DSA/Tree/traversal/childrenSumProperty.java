// public class childrenSumProperty{
//     public static void main(String args[])
//     {
//          Node root = new Node(10);
//         root.left = new Node(5);
//         root.right = new Node(5);
//         root.left.left = new Node(8);
//         root.left.right = new Node(7);
//         root.left.right.left = new Node(9);
//         root.left.right.right = new Node(15);
//         root.right.right = new Node(6);

//         boolean b = call(root);

//     }
//     public boolean call(Node root)
//     {
//         if(root==null)
//     }
// }

// class Node{
//     int data;
//     Node left;
//     Node right;

//     Node(int key)
//     {
//         data = key;
//         left = null;
//         right = null;

//     }
// }


public class childrenSumProperty{
    public static void main(String args[])
    {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right = new Node(5);

         int ll  = height(root);
         System.out.println(ll);
         
        boolean temp = call(root);
        System.out.println(temp);


         
    }

    public static boolean call(Node root)
    {
        // System.out.println("hello");
        if(root==null)
        {
            return true;

        }

        else
        {
            int temp1 = root.key;
            int temp2;
            int temp3;

            if(root.left!=null)
            temp2 = root.left.key;
            else
            temp2 = 0;

            if(root.right!=null)
            temp3 = root.right.key;
            else
            temp3 = 0;
            
            if((temp1 == temp2 + temp3)||(temp2+ temp3)==0)
            {
                return (call(root.left)&& call(root.right));
            }
            else
            return false;
        }
    }
}

class Node{
    Node left;
    Node right;
    int key;

    Node(int k)
    {
        key = k;

    }
}