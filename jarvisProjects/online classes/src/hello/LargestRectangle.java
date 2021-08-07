package hello;

import java.util.*;
public class LargestRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		long maxArea = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0 ; i < a.length ; i++) {
			while(!stack.empty() && a[i] <= a[stack.peek()]) {
				int index = stack.pop();
				long area = (long) a[index] * (i - (stack.isEmpty() ? 0 : (stack.peek() + 1)));
				maxArea = Math.max(area, maxArea);
			}
			stack.push(i);
		}
		System.out.println(maxArea);
		sc.close();
	}
}
