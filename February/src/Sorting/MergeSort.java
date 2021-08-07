package Sorting;

import java.util.Scanner;

public class MergeSort {
	public void Merge(int a[] , int l , int r , int m) {
		//[4,2,6,3,1] = [4, 2, 6] [3, 1] merge = [4, 2] [6] [3] [1] merge = [4] [2] [6] [3] [1] merge
		int l1 = m - l + 1;
		int r1 = r - m;
		int sub1[] = new int[l1];
		int sub2[] = new int[r1];
		//we add the element of the subarray into sub1[] and sub2[] 
		for(int i = 0 ; i < l1; i++) {
			sub1[i] = a[l + i];
		}
		for(int i = 0 ; i < r1; i++) {
			sub2[i] = a[m + 1 + i];
		}
		int i = 0;
		int j = 0;
		int k = l;
		//we traverse through the subarray and check the element is small or not if small then add to array a[]
		while(i < l1 && j < r1) {
			if(sub1[i] <= sub2[j]) {
				a[k] = sub1[i];
				i++;
			}else {
				a[k] = sub2[j];
				j++;
			}
			k++;
		}
		//there are some remaining element that is stored in array in below step.
		while(i < l1) {
			a[k] = sub1[i];
			i++;
			k++;
		}
		//there are some remaining element that is stored in array in below step.
		while(j < r1) {
			a[k] = sub2[j];
			j++;
			k++;
		}
	}
	public void sort(int a[] , int l , int r) {
		if(l < r) {
			int m = (l+r)/2;
			sort(a , l , m);
			sort(a , m+1 , r);
			Merge(a , l , r , m);
		}
	}
	public void printArray(int a[] , int n) {
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("\nEnter the element of the array : ");
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("\nBefore Sorting, the array is : ");
		MergeSort sort = new MergeSort();
		sort.printArray(a, n);
		sort.sort(a, 0, n-1);
		System.out.print("\n\nAfter Sorting, the array is : ");
		sort.printArray(a, n);
	}
}
