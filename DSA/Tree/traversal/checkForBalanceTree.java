public class checkForBalanceTree{
    public static void main(String args[])
    {

        Node root = new Node(8);
        root.left = new Node(12);
        root.left.left = new Node(13);
        root.right = new Node(15);
        root.right.right= new Node(16);
        root.right.rigth.right = new Node(17);

       c

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
