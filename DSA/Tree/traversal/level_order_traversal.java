// This is the program of traversing and printing the elements of tree in level order that is 
// first we print all the element at level0 from left to right 

// we can do it by doing the listed things

// call a function that returns the highest value of the level of tree

// now run a loop from level 0 to that level and print all the elements to each level

public class level_order_traversal {
    public static void main(String args[]) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        root.right.right = new Node(6);

        int le = Total_Level(root);
        System.out.println(le);

        for (int i = 0; i < le; i++) {

            Print_Element(root, i, 0);
            System.out.println("");

        }

    }

    public static int Total_Level(Node root) {

        if (root == null) {
            return 0;
        }

        int temp1 = 1 + Total_Level(root.right);
        int temp2 = 1 + Total_Level(root.left);
        return Integer.max(temp1, temp2);

    }

    public static void Print_Element(Node root, int k, int i) {
        if (root == null) {
            return;
        }

        if (i == k)
            System.out.print(root.key + "  ");

        Print_Element(root.left, k, i + 1);
        Print_Element(root.right, k, i + 1);

    }

}

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}