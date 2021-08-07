package Searching;

import java.util.Scanner;

public class Binarybyrecursion {
	public static void main(String[] args) {
		Binarybyrecursion obj = new Binarybyrecursion();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j = 0 ; j < t ; j++){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    int x = sc.nextInt();
		    for(int i = 0 ; i < n ; i++){
		        a[i] = sc.nextInt();
		    }
			int result = obj.Search(a , 0 , n - 1 , x);
			if(result == -1){
			    System.out.println("-1");
			}else{
			    System.out.println("1");
			}
		}
	}
	int Search(int a[] , int l , int r , int x) {
		if(r >= l) {
			int mid = l + (r-l)/2;
			if(a[mid] == x) {
				return mid;
			}
			if(a[mid] > x) {
				return Search(a , l , mid - 1 , x);
			}else {
				return Search(a , mid + 1 , r , x);
			}
		}
		
		return -1;
	}
}
