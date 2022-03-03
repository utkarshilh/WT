public class childrenSumProperty{
    public static void main(String args[])
    {
         Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(5);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        boolean b = call(root);

    }
    public boolean call(Node root)
    {
        if(root==null)
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        data = key;
        left = null;
        right = null;

    }
}