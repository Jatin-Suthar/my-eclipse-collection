package LalitJhangid;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueQuestion1 {
	public static void main(String[] args) {
		String s = "1";
		Stack<String> stack = new Stack<>();
		System.out.println(s);
		
		
		makeBinary(10, s, stack);
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
	}
	public static void makeBinary(int n, String s, Stack<String> stack) {
		if(s.length() == n/2) {
			return;
		}
//		stack.push(s.concat("0"));
//		stack.push(s.concat("1"));
		System.out.println(s.concat("0"));
		System.out.println(s.concat("1"));
		makeBinary(n, s.concat("0"), stack);
	}
}
