package geeksForGeeksProblems;

import java.util.Scanner;
import java.util.Stack;

public class EqualStack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();		
		int n3 = sc.nextInt();		
		int p[] = new int[n1];
		int q[] = new int[n2];
		int s[] = new int[n3]; 
		int h1 = 0;
		int h2 = 0;
		int h3 = 0;
		int min = 0;
		Stack<Integer> a = new Stack<>(); 
		Stack<Integer> b = new Stack<>();
		Stack<Integer> c = new Stack<>();
		
		for(int i = 0 ; i < n1 ; i++) {
		
			p[i] = sc.nextInt();
			
		}
		
		for(int i = n1 - 1 ; i >= 0 ; i--) {
			
			a.push(p[i]);
			h1 += p[i];
			
		}
		
		for(int j = 0 ; j < n2 ; j++) {
			
			q[j] = sc.nextInt();
			
		}
		
		for(int j = n2 - 1 ; j >= 0 ; j--) {
			
			b.push(q[j]);
			h2 += q[j];
			
		}		
		
		for(int k = 0 ; k < n3 ; k++) {
			
			s[k] = sc.nextInt();
			
		}
		
		for(int k = n3 - 1 ; k >= 0 ; k--) {
			
			c.push(s[k]);
			h3 += s[k];
			
		}
		
		min = Math.min(h1, Math.min(h2, h3));
		
		while(h1 != h2 || h1 != h3) {
			
			while(h1 > min) {
				
				h1 -= a.pop();
				
			}
			
			while(h2 > min) {
				
				h2 -= b.pop();
				
			}			
			
			while(h3 > min) {
				
				h3 -= c.pop();
				
			}			
			
			min = Math.min(h1, Math.min(h2, h3));
			
		}
		
		System.out.println(min);
		
	}

}
