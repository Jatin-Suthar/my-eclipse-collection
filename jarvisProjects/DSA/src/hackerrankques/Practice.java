package hackerrankques;

public class Practice {
    int binarySearch(int a[], int x) 
    { 
    	int l = 0 , r = a.length - 1 ; 
    	if(l <= r) {
    		int mid = l + (r - 1)/2;
    		if(a[mid] == x) {
    			return mid;
    		}
    		if(a[mid] < x) {
    			l = mid + 1;
    		}
    		else 
    			r = mid - 1;
    	}
    	return -1;
    } 
    public static void main(String[] args) {    	
    	Practice obj = new Practice();
    	int a[] = {10,20,30,40,50};
    	int x = 40;
    	int result = obj.binarySearch(a , x);
    	if(result == -1) {
    		System.out.println("element not found !");
    	}else {
    		System.out.println("element found ! " + result);
    	}
    }
} 
