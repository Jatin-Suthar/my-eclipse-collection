package AllAlgoBased;

import java.util.*;

//A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
//A2[] = {2, 1, 8, 3}

public class GeeksForGeeks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "jatin";
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int b[] = new int[m];
		for(int i = 0 ; i < m ; i++) {
			b[i] = sc.nextInt();
		}
		int result[] = fix(a,n,b,m);
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i] + " ");
		}
	}
	public static int[] fix(int a[], int n, int b[], int m) {
		Arrays.sort(a);
		int temp;
		int index;
		for(int i = 0 ; i < n ; i++) {
			ArrayList<Integer> bl = new ArrayList<>();
			if(i >= m) {
				break;
			}
			if(b[i] != a[i]) {
				int f = BinaryMultipleSearch(a , n , 1 , b[i]);
				int l = BinaryMultipleSearch(a, n, 0, b[i]);
				bl = search(a, n, b[i]);
				while((l - f + 1) != 0) {
					int j = 0;
					index = bl.remove(0);
					temp = a[i];
					a[i] = a[index];
					a[index] = temp;
					j++;
				}
			}
		}
		return a;
	}
	public static ArrayList<Integer> search(int a[], int n, int x) {
		ArrayList<Integer> al = new ArrayList<>();
		int flag = 1;
		int result = -1;
		int low = 0, high = n-1; 
		while(low <= high) {
			int mid = (low + high)/2;
			if(x == a[mid]) {
				result = mid;
				al.add(mid);
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
		return al;
	}
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
}
