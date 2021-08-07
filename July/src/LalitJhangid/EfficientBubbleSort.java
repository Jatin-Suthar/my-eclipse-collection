package LalitJhangid;

import java.util.Scanner;

public class EfficientBubbleSort {
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
		printArray(a, n);
		msort(a, 0, n-1);
		System.out.print("\n\nAfter Sorting, the array is : ");
		printArray(a, n);
	}

	public static void printArray(int a[] , int n) {
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void sort(int[] a, int n) {
		int f;
		for(int i = 0 ; i < n - 1 ; i++) {
			f = 0;
			for(int j = 0 ; j < n - 1 - i ; j++) {
				if(a[j] > a[j+1]) {
					f = 1;
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			if(f == 0) {
				break;
			}
		}
	}
	
	public static void selectionSort(int a[] , int n) {
		for(int i = 0 ; i < n ; i++) {
			int min = i;
			for(int j = i+1 ; j < n ; j++) {
				if(a[min] > a[j])
					min = j;
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}
	public static void msort(int a[], int low , int high) {
		if(low < high) {
			int mid = (low + high)/2;
			msort(a, low, mid);
			msort(a, mid + 1, high);
			merge(a, low, high, mid);
		}
	}

	public static void merge(int[] a, int low, int high, int mid) {
		int l = mid - low + 1;
		int r = high - mid;
		int left[] = new int[l];
		int right[] = new int[r];
		for(int i = 0 ; i < l ; i++) {
			left[i] = a[low + i];
		}
		for(int i = 0 ; i < r ; i++) {
			right[i] = a[mid + 1 + i];
		}
		int i = 0;
		int j = 0;
		int k = low;
		while(i < l && j < r) {
			if(left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			}else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < l) {
			a[k] = left[i];
			i++;
			k++;
		}
		while(j < r) {
			a[k] = right[j];
			j++;
			k++;
		}
	}
}	
