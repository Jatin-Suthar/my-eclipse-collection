package recursion;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SortAnStack {

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(2,5,3,9,8);
		Stack<Integer> stack = new Stack<>();
		stack.addAll(ll);
		System.out.println("Before sorting stack <-> ({" + stack + "})");
		sort(stack);
		System.out.println("After sorting stack  <-> ({" + stack + "})");
	}
	
	public static void sort(Stack<Integer> stack) {
		if(stack.size() == 1) {
			return;
		}
		
		int temp = stack.pop();
		sort(stack);
		insert(stack , temp);
	}
	
	public static void insert(Stack<Integer> stack , int key) {
		if(stack.isEmpty() || stack.peek() < key) {
			stack.push(key);
			return;
		}
		
		int temp = stack.pop();
		insert(stack , key);
		stack.push(temp);
	}
}
