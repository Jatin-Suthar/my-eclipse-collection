package datastructureSearching;

import java.util.Scanner;

public class LinearSearching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("the length of the array is : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements of given array : ");
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be found : ");
		int x = sc.nextInt();
		if(lsearch(a,x) == -1) {
			System.out.println("element not found!");
		}else {
			System.out.println("element found at posi " + lsearch(a,x));
		}
	}

	public static int lsearch(int[] a, int x) {
		// TODO Auto-generated method stub
		int temp = 0;
		int posi = -1;
		for(int i = 1 ; i < a.length ; i++) {
			if(x == a[i]) {
				posi = i + 1;
			}
		}
		return posi;
	}
}
