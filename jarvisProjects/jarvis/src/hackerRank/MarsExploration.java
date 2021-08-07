package hackerRank;

import java.util.Scanner;

public class MarsExploration {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    
   		String a = sc.nextLine();
    
   		int n = a.length(); 
    
   		int b = 0;
    
   		for(int i = 0 ; i < n ; i += 3) {
        
   			if(a.charAt(i) != 'S') {
   				
   				b = b + 1;
   				
   			}
   			
   			if(a.charAt(i + 1) != 'O') {
   				
   				b = b + 1;
   				
   			}
   			
   			if(a.charAt(i + 2) != 'S') {
   				
   				b = b + 1;
   				
   			}
       
   		}
    System.out.println(b);
    
    }

}
