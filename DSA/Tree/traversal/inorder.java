public class inorder{
    public static void main(String args[])
    {
        
        
        System.out.println("hello this is very cool");
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(70);
        root.left.right.right = new Node(80);

        root.right = new Node(30);
        root.right.right= new Node(60);


        inorder(root);


    }

    public static void inorder(Node root)
    {
        if(root!= null)
        {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);

        }
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