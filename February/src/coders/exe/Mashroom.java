package coders.exe;

import java.util.*;

public class Mashroom {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int max = 0;
        int a[] = new int[8];
        for(int i = 0  ; i < 8; i++) {
        	a[i] = sc.nextInt();
        }
        int b[] = new int[16];
        for(int i = 0 ; i < 8 ; i++) {
        	b[i] = b[8 + i] = a[i];
        }
        Stack<Integer> s = new Stack<Integer>();
        Stack<Integer> m = new Stack<Integer>();
        for(int i = 0 ; i < 8 ; i++) {
        	c = 0;
 
       		for(int j = i ; j < i+4 ; j++) {
       			s.push(b[j]);
       			c = c + s.pop();
       		}
        	m.push(c);
        	
        }
        max = m.pop();
        for(int i = 0 ; i < 8 ; i++) {
        	if(max < m.peek()) {
        		max = m.pop();
        	}
        }
        System.out.println(max);
	}
}
