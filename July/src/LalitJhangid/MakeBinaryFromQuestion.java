package LalitJhangid;

import java.util.Arrays;
import java.util.Stack;

public class MakeBinaryFromQuestion {
	public static void main(String[] args) {
		String s = "01?1?0";
		Stack<String> stack = new Stack<>();
		String a[] = s.split("");
		makeBinary(s, a, stack);
	}

	public static void makeBinary(String s, String a[], Stack<String> stack) {
		int i, j;
		for(i = 0 ; i < a.length ; i++) {
			if(s.charAt(i) == '?') {
				break;
			}
		}
		for(j = a.length-1 ; j >= 0 ; j--) {
			if(s.charAt(j) == '?') {
				break;
			}
		}
		if(s.charAt(i) == '?' && s.charAt(j) == '?') {
			for(int k = 0 ; k < 2 ; k++) {
				if(k == 0) {
					a[i] = "0";
					a[j] = "0";
					stack.push(Arrays.toString(a));
					a[i] = "0";
					a[j] = "1";
					stack.push(Arrays.toString(a));
				}else {
					a[i] = "1";
					a[j] = "0";
					stack.push(Arrays.toString(a));
					a[i] = "1";
					a[j] = "1";
					stack.push(Arrays.toString(a));
				}
			}
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
