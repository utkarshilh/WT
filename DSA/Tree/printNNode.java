public class printNNode{
    public static void main(String args[])
    {
        Node root = new Node(10);

        root.right = new Node(30);
        root.left = new Node(20);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

       root.right.right = new Node(30);
       

       int k =2 ;

    //    it will print the node which is at the distance of k ie 2 
       call(root,0,k);
    }

    public static void call(Node root,int temp,int k)
    {
        if( root!=null && temp<=k)
        {
            if(temp==k)
            System.out.println(root.key+" ");

            call(root.left,temp+1,k);
            call(root.right,temp+1,k);



        }
    }
};
class Node{
    Node left;
    Node right;
    int key;

    Node(int k)
    {
        key = k;

    }
}
