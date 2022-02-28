public class preorder{
    public static void main(String args[])
    {
         Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(70);
        root.left.right.right = new Node(80);

        root.right = new Node(30);
        root.right.right= new Node(60);

        preorder(root);


    }

    public static void preorder(Node root)
    {
        if(root!= null)
        {
            System.out.println(root.key+" ");
            preorder(root.left);
            preorder(root.right);
            
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