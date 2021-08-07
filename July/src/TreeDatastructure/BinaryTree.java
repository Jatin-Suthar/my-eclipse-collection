package TreeDatastructure;

import java.util.*;

class Node {
	Node left, right;
	int data;
	public Node(int data) {
		this.data = data;
	}
}

public class BinaryTree {
	static Scanner sc = null;
	public static void main(String[]  args) {
		sc = new Scanner(System.in);
		Node root = createBinaryTree();
		System.out.println();
		System.out.println("Preorder traversal is as follows : ");
		preorder(root);
		System.out.println();
		System.out.println("Without Recursion : ");
		PreOrderWR(root);
		System.out.println();
		System.out.println("Inorder traversal is as follows : ");
		List<Integer> al = inorder(root);
		for(int i = 0 ; i < al.size() ; i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("Without Recursion : ");
		InOrderWR(root);
		System.out.println();
		System.out.println("Postorder traversal is as follows : ");
		postorder(root);
		System.out.println();
		System.out.println("Without Recursion : ");
		PostOrderWR(root);
	}
	
	public static void preorder(Node root) {
		if(root == null)
			return;
		
		preorder(root.left);
		System.out.print(root.data + " ");
		preorder(root.right);
	}
	static List<Integer> al = new ArrayList<>();
	public static List<Integer> inorder(Node root) {
		if(root == null)
			return al;

		al.add(root.data);
		inorder(root.left);
		inorder(root.right);
		
		return al;
	}
	
	public static void postorder(Node root) {
		if(root == null)
			return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
	public static void printBinaryTree(Node root) {
		System.out.println(root.data);
		
		if(root.left != null) {
			printBinaryTree(root.left);
		}
		
		if(root.right != null) {
			printBinaryTree(root.right);
		}
	}

	public static Node createBinaryTree() {
		Node root = null;
		
		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		if(data == -1) 
			return null;
		
		root = new Node(data);
		
		System.out.println("Enter the data for the left child : ");
		root.left = createBinaryTree();
		
		System.out.println("Enter the data for the right child : ");
		root.right = createBinaryTree();
		
		return root;
	}
	public static void InOrderWR(Node root) {//without recursion
		Stack<Node> stack = new Stack<>();
		while(root != null) {
			while(root != null) {
				System.out.print(root.data + " ");
				
				if(root.right != null)
					stack.push(root.right);
				
				root = root.left;
			}
			
			if(!stack.isEmpty())
				root = stack.pop();
			else
				break;
		}
	}
	public static void PreOrderWR(Node root) {//without recursion
		Stack<Node> stack = new Stack<>();
		while(root != null || !stack.isEmpty()) {
			while(root != null) {
				stack.push(root);
				root = root.left;
			}
			
			root = stack.pop();
			System.out.print(root.data + " ");
			
			root = root.right;
		}
	}
	public static void PostOrderWR(Node root) {
		Stack<Node> stack = new Stack<>();
		do {
			while(root != null) {
				if(root.right != null)
					stack.push(root.right);
				stack.push(root);
				root = root.left;
			}
			
			root = stack.pop();
			if(stack.isEmpty()) {
				System.out.println(root.data);
				break;
			}
			if(root.right != null && root.right == stack.peek()) {
				stack.pop();
				stack.push(root);
				root = root.right;
			}else {
				System.out.print(root.data+" ");
				root = null;
			}
		}while(!stack.isEmpty());
	}
}
