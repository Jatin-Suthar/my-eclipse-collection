package Array;

import java.util.Scanner;

public class array1 {
	public void insert(int ar[] , int posi , int num) {
		for(int i = ar.length - 1 ; i >= posi ; i--) {
			ar[i] = ar[i-1];
		}
		ar[posi - 1] = num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		a[0] = 1;
		a[1] = 2;
		a[2] = 4;
		a[3] = 5;
		a[4] = 6;
		array1 array = new array1();
		array.insert(a, 3, 3);
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
	}
}
