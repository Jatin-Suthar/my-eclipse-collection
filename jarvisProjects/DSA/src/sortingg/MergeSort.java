package sortingg;

import java.util.*;
public class MergeSort {
	static void merge(int a[] , int l , int m , int r) {
		int l1 = m - l + 1;
		int r1 = r - m;
		int L[] = new int[l1];
		int R[] = new int[r1];
		//store the value of sub arrays
		for(int i = 0 ; i < l1 ; ++i) {
			L[i] = a[l + i];
		}
		for(int j = 0 ; j < r1 ; ++j) {
			R[j] = a[m + 1 + j];
		}
		int i = 0 , j = 0;
		int  k = l; 
		//comparing element of L[i] and R[j]
		while(i < l1 && j < r1) {
			if(L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			}else {
				a[k] = R[j];
				j++;
			}
			k++;
		}
		//this while loop is for remaining element
		while(i < l1) {
			a[k] = L[i];
			i++;
			k++;
		}
		//this while loop is for remaining element
		while(j < r1) {
			a[k] = R[j];
			j++;
			k++;
		}
	}
	void sort(int a[] , int l , int r) {
		if(l < r) {
			//dividing the array
			int m = (l+r)/2;
			sort(a , l , m);
			sort(a , m + 1 , r);
			merge(a , l , m , r);
		}
	}
	void printArray(int a[] , int n) {
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String[] args) {
		MergeSort obj = new MergeSort();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		obj.sort(a, 0, n - 1);
		System.out.print("sorted array is : ");
		obj.printArray(a, n);
		sc.close();
	}
}
