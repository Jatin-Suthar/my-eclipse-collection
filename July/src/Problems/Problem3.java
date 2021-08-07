package Problems;

import java.util.Scanner;

public class Problem3 {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for(int i = 0 ; i < n ; i++) {
	    	a[i] = sc.nextInt();
	    }
	    int store[] = new int[n];
	    find(a, n, store);
	    for(int i = 0 ; i < n ; i++) {
	    	System.out.println(store[i]);
	    }
	}
	public static void find(int a[], int n, int store[]){
		store[0] = 1;
		for(int i = 1 ; i < n ; i++) {
			store[i] = 1;
			for(int j = i-1 ; (j >= 0) && (a[i] >= a[j]) ; j--){
				store[i]++;
			}
		}
	}
}
