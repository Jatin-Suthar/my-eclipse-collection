package AllAlgoBased;

public class BinarySearchInNearlySortedArray {
	public static int BinarySpecialSearch(int a[], int n, int x) {
		//write code here.
		int low = 0, high = n-1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(x == a[mid]) {
				return mid;
			}
			if(mid-1 >= low && a[mid-1] == x) {
				return mid-1;
			}
			if(mid+1 <= high && a[mid+1] == x) {
				return mid+1;
			}
			
			if(x > a[mid]) {
				low = mid + 2;
			}else {
				high = mid - 2;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		//this array is nearly sorted array 
		//and we have to apply binary special search.
		int a[] = {1,3,2,4,6,5,7,9,8};
		int n = a.length;
		int x = 9;
		int result = BinarySpecialSearch(a, n, x);
		if(result == -1) {
			System.out.println("Element not found !");
		}else {
			System.out.println(result);
		}
	}
}
