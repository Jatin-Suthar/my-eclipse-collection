package recursion;

import java.util.*;
public class DeleteMiddleElementFromStack {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
 		Stack<Integer> stack = new Stack<>();
 		stack.addAll(list);
 		System.out.println("stack before deleting middle" + stack);
 		middle(stack , 5);
 		System.out.println("stack after deleting middle" + stack);
	}

	public static Stack<Integer> middle(Stack<Integer> stack , int size){
		if(stack.size() == 0) {
			return stack;
		}
		
		int k = (stack.size()/2) + 1; 
		deleteMiddle(stack , k);
		return stack;
	}
	
	static void deleteMiddle(Stack<Integer> stack , int k) {
		if(k == 1) {
			stack.pop();
			return;
		}
		
		int temp = stack.pop();
		deleteMiddle(stack , k-1);
		stack.push(temp);
		return;
	}
}
