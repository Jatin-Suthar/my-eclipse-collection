//handshaking lemma equation for k ary tree  =:  L = (k - 1)*I + 1 
package treeDSA;

public class Solution {
	Node root;
	Solution(int key){
		root = new Node(key);
	}
	Solution(){
		root = null;
	}
	public static void main(String[] args)  {
		Solution tree = new Solution();
		tree.root = new Node(5);
		tree.root.left = new Node(3);
		tree.root.right = new Node(4);
		
	}
}
class Node{
	int key; 

	Node left , right;	
	
	public Node(int item) {
		key = item;
		left = right = null;
	}
}
