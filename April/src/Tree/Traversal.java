package Tree;

import java.util.ArrayList;
import java.util.Stack;
 
public class Traversal {
    static class Pair {
        Node first;
        int second;
 
        public Pair(Node first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
 
    static class Node {
        int data;
        Node left, right;
 
        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
 
    static void allTraversal(Node root) {
       
        // Stores Preorder traversal
        ArrayList<Integer> pre = new ArrayList<>();
 
        // Stores Inorder traversal
        ArrayList<Integer> in = new ArrayList<>();
 
        // Stores Postorder traversal
        ArrayList<Integer> post = new ArrayList<>();
 
        Stack<Pair> s = new Stack<>();
 
        s.push(new Pair(root, 1));
 
        while (!s.empty()) {
 
            Pair p = s.peek();
            //remind the second value always
            if (p.second == 1)
            {
 
                s.peek().second++;//second is 2
 
                pre.add(p.first.data);//data added first 1
 
                if (p.first.left != null) {//check the left node is null or not
                    s.push(new Pair(p.first.left, 1));//second is 1
                }
            }
 
            else if (p.second == 2) {
 
                s.peek().second++;//second is 3
                
                in.add(p.first.data);
 
                if (p.first.right != null) {//add the right element if its not null
 
                    s.push(new Pair(p.first.right, 1));//second is 1
                }
            }
 
            else {
            	
                post.add(p.first.data);
                
                s.pop();
            }
        }
 
        System.out.print("Preorder Traversal: ");
        for (int i : pre) {
            System.out.print(i + " ");
        }
        System.out.println();
 
        System.out.print("Inorder Traversal: ");
        for (int i : in) {
            System.out.print(i + " ");
        }
        System.out.println();
 
        System.out.print("Postorder Traversal: ");
        for (int i : post) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
 
        allTraversal(root);
 
    }
}



