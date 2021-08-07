package hello;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StackProblems {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	Stack<Integer> stack = new Stack<Integer>();
    	Stack<Integer> maxStack = new Stack<Integer>();
	   	for(int i = 0 ; i < t ; i++){
	   		int a = sc.nextInt();
	   		switch(a) {
	   			case 1 :  
	   				int x = sc.nextInt();
	   				stack.push(x);
	   				if(maxStack.isEmpty() || x >= maxStack.peek()) {
	   					maxStack.push(x);
	   				}
	   				break;
	   			case 2 : 
	   				int pop1 = stack.pop();
	   				if(pop1 == maxStack.peek()) {
	   					maxStack.pop();
	   				}
	   				break;
	   			case 3 : 
	   				System.out.println(maxStack.peek());
	   				break;
	   			default : break;	
	   		}
	   	}
	}	
}
