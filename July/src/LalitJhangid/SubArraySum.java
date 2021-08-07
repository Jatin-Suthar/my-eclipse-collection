package LalitJhangid;

import java.util.Scanner;
import java.util.Stack;

public class SubArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		findSubArray(a, x, stack);
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		while(!stack.isEmpty()) {
			if(max < stack.peek()) {
				max = stack.peek();
			}
			if(min > stack.peek()) {
				min = stack.peek();
			}
			stack.pop();
		}
		System.out.println("Maximum in the array is : " + max);
		System.out.println("Minimum in the array is : " + min);
	}
	public static void findSubArray(int a[], int x, Stack<Integer> stack){
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++) {
			if(i < x) {
				sum = sum + a[i];
				if(i == x-1)
					stack.push(sum);
			}else {
				sum = sum + a[i] - a[i-x];
				stack.push(sum);
			}
		}
	}
}	
