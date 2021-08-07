package AllAlgoBased;

import java.util.*;

public class BinarySearchInCircularArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the circular array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("\nEnter the element of the array : ");
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("\nEnter the element to be found : ");
		int x = sc.nextInt();
		System.out.println("\n" + findTheElementInRotationArray(a, n , x));
	}
	public static int findTheElementInRotationArray(int a[] , int n , int x) {
		int low = 0; int high = n-1;
		while(low <= high) {
			int mid = (low + high)/2; //0
			if(x == a[mid]) {
				return mid;
			}
			if(a[mid] < a[high]) {
				if(x > a[mid] && x <= a[high]) {
					low = mid + 1;
				}else {
					high = mid - 1;
				}
			}else {
				if(x >= a[low] && x < a[mid]) {
					high = mid - 1;
				}else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}
}
