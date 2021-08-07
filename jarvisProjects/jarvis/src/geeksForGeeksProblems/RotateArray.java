package geeksForGeeksProblems;

import java.util.*;

public class RotateArray {
	
	static void reverseArray(int a[] , int l , int r) {
		int temp ;
		while(l < r) {
			temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
	}
	
	static void print(int a[]) {
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0 ; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			reverseArray(a , 0 , d-1);
			reverseArray(a , d , n-1);
			reverseArray(a , 0 , n-1);
			
			print(a);
		}
		
	}

}
