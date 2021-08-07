package LalitJhangid;

import java.util.Stack;

public class MaxFromRight {
	public static void main(String[] args) {
		int a[] = {10, 4, 6, 7, 5};
		int max = Integer.MIN_VALUE;
		Stack<Integer> stack = new Stack<>();
		for(int i = a.length-1 ; i >= 0 ; i--) {
			if(a[i] > max) {
				max = a[i];
				stack.push(max);
			}
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
