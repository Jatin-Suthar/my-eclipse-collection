package treeDSA;

import java.util.*;
public class DeleteNode {
	static class Node{
		int key;
		Node left , right;
		public Node(int key) {
			this.key = key;
			left = right = null;
		}
	}
	static Node root;
	static Node temp = root;
	public static void inorder(Node temp) {
		if(temp == null) 
			return;
		
		inorder(temp.left);
		System.out.print(temp.key + " ");
		inorder(temp.right);
	}
	static void deleteDeepest(Node root , Node delNode) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		Node temp = null;
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if(temp == delNode) {
				temp = null;
				return;
			}
			if(temp.left != null) {
				if(temp.left == delNode) {
					temp.left = null;
					return;
				}else {
					q.add(temp.left);
				}
			}
			if(temp.right != null) {
				if(temp.right == delNode) {
					temp.right = null;
					return;
				}else {
					q.add(temp.right);
				}
			}
		}
	}
	static void delete(Node root , int key){
		if(root == null) {
			return;
		}
		if(root.left == null && root.right == null) {
			if(root.key == key) {
				return;
			}else {
				return;
			}
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp = null , keyNode = null;
		
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if(temp.key == key) {
				keyNode = temp;
			}
			if(temp.left != null) {
				q.add(temp.left);
			}
			if(temp.right != null) {
				q.add(temp.right);
			}
		}  
	    if (keyNode != null){  
	        int x = temp.key;  
	        deleteDeepest(root, temp);  
	        keyNode.key = x;  
	    }  
	}
	public static void main(String[] args) {
		root = new Node(15);
		root.left = new Node(5);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root.right = new Node(20);
		root.right.left = new Node(17);
		root.right.right = new Node(23);
		
		System.out.print("Inorder traversal before deleting element : ");
		inorder(root);
		
		System.out.println();
		int key = 23;
		delete(root , key);
		
		System.out.print("Inorder traversal after deleting element : ");
		inorder(root);
	}
}
