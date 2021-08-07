package LalitJhangid;

import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
	}
}
public class IsTreeIdentical {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the data of first root : ");
		Node root1 = createBinaryTree();
		System.out.println("Enter the data of second root : ");
		Node root2 = createBinaryTree();
		
		boolean result = isIdentical(root1, root2);
		
		if(result)
			System.out.println("Both tree are identical");
		else
			System.out.println("Both tree are not identical");
	}
	public static Node createBinaryTree() {
		Node root = null;
		System.out.println("data :");
		int data = sc.nextInt();
		if(data == -1) {
			return null;
		}
		root = new Node(data);
		
		System.out.println("data of left node : ");
		root.left = createBinaryTree();
		System.out.println("data of right node : ");
		root.right = createBinaryTree();
		
		return root;
	}
	public static boolean isIdentical(Node root1, Node root2) {
		if(root1 == null && root2 == null)
			return true;
		
		return (root1 != null && root2 != null) && (root1.data == root2.data) && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
	}
}
