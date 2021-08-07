package LalitJhangid;

import java.util.*;

class TNode{
	int data;
	TNode left, right;
	public TNode(int data) {
		this.data = data;
	}
}

public class LevelSumProblem {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		TNode root = create();
	}
	public static TNode create() {
		TNode root = null;
		
		System.out.println("data : ");
		int data = sc.nextInt();
		
		if(data == -1)
			return null;
		
		root = new TNode(data); 
		
		System.out.print("left node ");
		root.left = create();
		System.out.print("right node ");
		root.right = create();
		
		return root;
	}
}
