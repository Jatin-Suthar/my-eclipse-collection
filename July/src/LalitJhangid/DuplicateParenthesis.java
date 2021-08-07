package LalitJhangid;

import java.util.*;

public class DuplicateParenthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char a[] = s.toCharArray();
		checkDuplicate(a, a.length);
	}

	public static void checkDuplicate(char[] a, int n) {
		Stack<Character> stack = new Stack<>();
		if(n < 3) {
			System.out.println("No");
			return;
		}
		for(int i = 0 ; i < n ; i++) {
			if(a[i] != ')') {
				stack.push(a[i]);
			}else {
				if(stack.peek() == '(') {
					System.out.println("Yes");
					return;
				}else {
					while(stack.peek() != '(') {
						stack.pop();
					}
				}
			}
		}
		System.out.println("No");
	}
}
