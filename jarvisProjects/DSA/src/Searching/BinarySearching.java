package Searching;

public class BinarySearching {
    int binarySearch(int a[], int x) 
    { 
    	int l = 0 , r = a.length - 1 ; 
    	if(r >= l) {
    		int mid = l + (r - 1)/2;
    		if(a[mid] == x) {
    			return mid;
    		}
    		if(a[mid] > x) {
    			r = mid - 1;
    		}else {
    			l = mid + 1;
    		}
    	}
    	return -1;
    } 
	public static void main(String[] args) {
		BinarySearching obj = new BinarySearching();
		int a[] = {10, 20, 30, 40, 50};
		int x = 20;
		int result = obj.binarySearch(a, x);
		if(result == -1) {
			System.out.println("element not found !");
		}else {
			System.out.println("element found ! at position : " + result);
		}
	}
}
