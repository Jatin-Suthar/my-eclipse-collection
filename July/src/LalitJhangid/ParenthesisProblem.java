package LalitJhangid;

import java.util.*;

public class ParenthesisProblem {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String s = sc.next();
		int f = 0;
		char c[] = s.toCharArray();
		for(int i = 0 ; i < c.length ; i++) {
			if(c.length % 2 != 0)
				break;
			if(c[i] == '(' || c[i] == '{' || c[i] == '[') {
				stack.push(c[i]);
				f++;
			}
			if(!stack.isEmpty() && c[i] == ')' && stack.peek() == '(') {
				stack.pop();
				f--;
			}
			if(!stack.isEmpty() && c[i] == ']' && stack.peek() == '[') {
				stack.pop();
				f--;
			}
			if(!stack.isEmpty() && c[i] == '}' && stack.peek() == '{') {
				stack.pop();
				f--;
			}
		}
		if(f == 0) 
			System.out.println("Right Parenthesis!");
		else
			System.out.println("Wrong Parenthesis!");
	}
}
