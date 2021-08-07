package Sorting;

import java.util.Scanner;

public class QuickSort {
	public int Partition(int a[] , int l , int r) {
		int pivot = a[r];
		int i = l - 1;
		for(int j = l ; j < r ; j++) {
			if(a[j] < pivot) {
				i++;
				swap(a , i , j);
			}
		}
		swap(a , i+1 , r);
		return (i+1);
	}
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	public void printArray(int[] a, int n) {
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void sort(int[] a, int l, int r) {
		if(l < r) {
			int pivot_location = Partition(a , l , r);
	
			sort(a , l , pivot_location - 1);
			sort(a , pivot_location + 1 , r);
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
		QuickSort sort = new QuickSort();
		sort.printArray(a, n);
		sort.sort(a, 0, n-1);
		System.out.print("\n\nAfter Sorting, the array is : ");
		sort.printArray(a, n);
	}
}
