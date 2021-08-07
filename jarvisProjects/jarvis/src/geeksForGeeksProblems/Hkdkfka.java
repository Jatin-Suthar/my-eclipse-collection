package geeksForGeeksProblems;

import java.util.Scanner;
import java.util.Stack;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
	    int t = sc.nextInt();
		
		sc.nextLine();
		while(t-- != 0){
		    
		    String s = sc.nextLine();
		    Stack<Character> stack = new Stack<>();
		    
		    boolean isBalanced = true;
		    for(int i = 0 ; i < s.length() ; i++){
		        
		        char c = s.charAt(i);
		        
		        if(c == '(' || c == '{' || c == '['){
		            
		            stack.push(c);
                    continue;	
                    
		        }
		        
		        if(stack.isEmpty()){
		            
		            isBalanced = false;
		            break;
		            
		        }
		        
		        if(c == '('){
		            
		            if(stack.peek() == ')'){
		                
		                stack.pop();
		                break;
		                
		            }else{
		                
		                isBalanced = false;
		                
		            }
		            
		        }
		        
		        if(c == '{'){
		            
		            if(stack.peek() == '}'){
		                
		                stack.pop();
		                break;
		                
		            }else{
		                
		                isBalanced = false;
		                
		            }
		            
		        }
		        
		        if(c == '['){
		            
		            if(stack.peek() == ']'){
		                
		                stack.pop();
		                break;
		                
		            }else{
		                
		                isBalanced = false;
		                
		            }
		            
		        }
		        
		    }
		    
		    if(!stack.isEmpty()){
		        
		        isBalanced = false;
		        
		    }
		    
		    if(isBalanced){
		        
		        System.out.println("balanced");
		        
		    }else{
		        
		        System.out.println("not balanced");
		        
		    }
		}
		
		sc.close();
		
	}
}
