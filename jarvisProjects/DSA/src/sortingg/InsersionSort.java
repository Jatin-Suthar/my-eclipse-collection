package sortingg;

import java.util.*;
public class InsersionSort {
	void sort(int a[]) {
		int n = a.length;
		for(int i = 1 ; i < n ; i++) {
			int key = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
	}
	void print(int a[] , int n) {
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String[] args) {
		InsersionSort obj = new InsersionSort();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		obj.sort(a);
		obj.print(a, n);
		sc.close();
	}
}
