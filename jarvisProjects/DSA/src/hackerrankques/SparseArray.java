package hackerrankques;

import java.util.*;
public class SparseArray {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String[] a = new String[m];
        
        for(int i = 0 ; i < m ; i ++) {
        	a[i] = sc.next();
        }
        
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
        	String b = sc.next();
        	
        	int sum = 0;
        	for(int j = 0 ; j < m ; j++) {
        		if(b.equals(a[j])) sum++;
        	}
        	System.out.println(sum);
        	
        }
	}
}
