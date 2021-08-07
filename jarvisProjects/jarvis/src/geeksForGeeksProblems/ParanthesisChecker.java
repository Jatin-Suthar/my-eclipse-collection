package geeksForGeeksProblems;

import java.util.Scanner;
import java.util.Stack;
 
public class ParanthesisChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		sc.nextLine();
		while(n-- != 0) {
		
			String s = sc.nextLine();
			Stack<Character> str = new Stack<>();
			boolean isBalanced = true;

			for(int i = 0 ; i < s.length() ; i++) {
				
				char c = s.charAt(i);
				
				if(c == '(' || c == '{' || c == '[') {
					
					str.push(c);
					continue;
					
				}
				
				if(str.isEmpty()) {
					
					isBalanced = false;
					break;
					
				}
				
				if(c == ')') {
					
					if(str.peek() == '(') {
					
						str.pop();
					
					}else {
					
						isBalanced = false;
						break;
						
					}
				}
				
				if(c == '}') {
					
					if(str.peek() == '{') {
					
						str.pop();
					
					}else {
					
						isBalanced = false;
						break;
						
					}
				}
				
				if(c == ']') {
					
					if(str.peek() == '[') {
						
						str.pop();
						
					}else {
						
						isBalanced = false;
						break;
						
					}
					
				}
				
			}

			if(!str.isEmpty()) {
				
				isBalanced = false;
				
			}
			
			if(isBalanced) {
				
				System.out.println("balanced");
				
			}else {
				
				System.out.println("not balanced");
				
			}
			
		}
		
	}

}
