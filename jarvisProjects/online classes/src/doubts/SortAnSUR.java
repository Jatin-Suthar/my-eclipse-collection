package doubts;

import java.util.*;
public class SortAnSUR {
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			stack.push(a[i]);
		}
		System.out.println("Before Sorting : ");
		System.out.println(stack);
		sort_an_Stack();
		System.out.println("After Sorting : ");
		System.out.println(stack);
	}
	static void SortedInsert(int c) {
		if(stack.isEmpty() || c > stack.peek()) {
			stack.push(c);
		} else {
			int temp = stack.pop();
			SortedInsert(c);
			stack.push(temp);
		}
	}
	static void sort_an_Stack() {
		if(stack.size() > 0) {
			int temp = stack.pop();
			sort_an_Stack();
			SortedInsert(temp);
		}
	}
}
