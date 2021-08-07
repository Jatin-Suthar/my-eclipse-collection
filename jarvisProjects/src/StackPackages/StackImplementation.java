package StackPackages;

import java.util.Arrays;
import java.util.Scanner;

public class StackImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i = 0 ; i < N ; i++) {
				arr[i] = sc.nextInt();
			}
			int X = sc.nextInt();
			StackImplementation obj = new StackImplementation();
			int result = obj.search(arr, N, X);
			System.out.println(result);
		}
	}
	int search(int arr[], int N, int X)
    {
        int l = 0;
        int r = arr.length - 1;
        if(r >= l) {
        	int mid = l + (r-1)/2;
        	if(arr[mid + 1] == X) {
        		return mid + 1;
        	}
        	if(arr[mid] == X) {
        		return mid;
        	}
        	if(arr[mid] > X) { 
        		r = mid - 1;
        	}
        	if(arr[mid] < X) { 
        		l = mid + 1;
        	}
        }
		return r;
    }
}
