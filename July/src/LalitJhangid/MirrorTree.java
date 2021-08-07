package LalitJhangid;

import java.util.*;

class TreeNode{
	int data;
	TreeNode left, right;
	public TreeNode(int data) {
		this.data = data;
	}
}
public class MirrorTree {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		TreeNode root = createBinaryTree();
		System.out.println("Original Tree : ");
		printTree(root);
		System.out.println();
		findMirror(root);
		System.out.println("Mirror Tree : ");
		printTree(root);
	}
	public static TreeNode createBinaryTree() {
		TreeNode root = null;
		System.out.println("data : ");
		int data = sc.nextInt();
		if(data == -1)
			return null;
		
		root = new TreeNode(data);
		System.out.println("left data : ");
		root.left = createBinaryTree();
		System.out.println("right data : ");
		root.right = createBinaryTree();
		return root;
	}
	public static void printTree(TreeNode root) {
		if(root == null) {
			return;
		}
		
		printTree(root.left);
		System.out.print(root.data + " ");
		printTree(root.right);
	}
	public static void findItsMirror(TreeNode root) {
		if(root == null) {
			return;
		}
		
		findItsMirror(root.left);
		findItsMirror(root.right);
		TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
	}
	public static void findMirror(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		do {
			while(root != null) {
				
				if(root.right != null) 
					stack.push(root.right);
				
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			
			if(stack.isEmpty()) {
				TreeNode temp = root.left;
				root.left = root.right;
				root.right = temp;
				break;
			}
			
			if(root.right != null && root.right == stack.peek()) {
				stack.pop();
				stack.push(root);
				root = root.right;
			}else {
				root = stack.pop();
				stack.pop();
				TreeNode temp = root.left;
				root.left = root.right;
				root.right = temp;
				root = null;
			}
			
		}while(!stack.isEmpty());
	}
}
