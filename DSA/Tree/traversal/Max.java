class Node{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;

    }
}

public class Max{
    public static void main(String args[])
    {

        Node head = new Node(10);
        head.left = new Node(20);
        head.right = new Node(80);
        head.right.right = new Node(77);
        head.right.right = new Node(88);
        head.left.left = new Node(67);
        

        System.out.println("the inorder traversal");
        call(head);

    }

    public static void call(Node root)
    {
        if(root==null)
        return ;

        call(root.left);
        System.out.println(root.data+" ");
        call(root.right);

    }
}

    
