package AllAlgoBased;

public class TernarySearch {
	public static int ternarySearchOperation(int a[], int n, int x) {
		int low = 0, high = n-1;
		while(low <= high) {
			int lmid = low + (high - low)/3;
			int rmid = high - (high - low)/3;
			
			if(a[lmid] == x) {
				return lmid;
			}
			if(a[rmid] == x) {
				return rmid;
			}
			
			if(a[lmid] > x) {
				high = lmid - 1;
			}else if(a[rmid] < x) {
				low = rmid + 1;
			}else {
				low = lmid + 1;
				high = rmid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int n = a.length;
		int x = 1;
		int result = ternarySearchOperation(a,n,x);
		if(result == -1) {
			System.out.println("Element not found!");
		}else {
			System.out.println("Element found at Position " + result);
		}
	}
}
