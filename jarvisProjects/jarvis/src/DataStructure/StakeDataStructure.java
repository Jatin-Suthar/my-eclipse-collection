package DataStructure;

import java.util.Stack;

public class StakeDataStructure {

	public static void main(String[] args) throws Exception {

		MyStack<Integer> stack = new MyStack();
		
		stack.push(12);
		stack.push(24);
		stack.push(32);
		stack.push(22);
		stack.push(21);
		
		int poping = stack.pop();	
		System.out.println(poping);
		
		int peeking = stack.peek();
		System.out.println(peeking);
		
	}

}
