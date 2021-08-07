package AllAlgoBased;

public class MultipleSearchesInCircularArray {
	public static int BinaryMultipleSearch(int a[] , int n , int flag, int x) {
		int low = 0, high = n-1, result = -1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(x == a[mid]) {
				result = mid;
				if(flag == 1) {
					high = mid - 1;
				}else {
					low = mid + 1;
				}
			}else if(x > a[mid]) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int a[] = {1,2,2,2,3,4,4,4,4,5,5,6,7,8,9,9,9};
		int n = a.length;
		int x = 9;
		int f = BinaryMultipleSearch(a , n , 1 , x);
		int l = BinaryMultipleSearch(a, n, 0, x);
		if(f == -1) {
			System.out.println("Element not found!");
		}else {
			System.out.println(l - f + 1);
		}
	}
}
