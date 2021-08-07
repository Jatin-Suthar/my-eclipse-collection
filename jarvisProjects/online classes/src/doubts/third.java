package doubts;

import java.util.*;

public class third {
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++) {
			stack.push(i);	
		}
		System.out.println("Before reversal of stack :");
		System.out.println(stack);
		reverse();
		System.out.println("After reversal of stack :");
		System.out.println(stack);
	}
	static void insert_at_bottom(int x) {
		if(stack.isEmpty()) {
			stack.push(x);
		}
		else {
			int c = stack.peek();
			stack.pop();
			insert_at_bottom(x);
			
			stack.push(c);
		}
	}
	static void reverse() {
		if(stack.size() > 0) {
			int x = stack.peek();
			stack.pop();
			reverse();
			
			insert_at_bottom(x);
		}
	}
}
