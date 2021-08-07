package geeksForGeeksProblems;

import java.util.Arrays;
import java.util.Scanner;

public class TripletOfAnArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		Triplet g = new Triplet();
		
		if(g.findTriplets(arr, n)) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
	}
}
	
	class Triplet{
		
		public boolean findTriplets(int arr[] , int n) {
			
			Arrays.sort(arr);
			
			for(int i = 0 ; i < n-2 ; i++) {
				
				if(twoSum(arr , -arr[i], i-1 )) {
					return true;
				}
				
			}
			return false;		
		}

		public boolean twoSum(int a[], int x, int i) {
			
			int j = a.length-1;
			
			while(i < j) {
				
				if(i > x) {
					j--;	
				}
				else if(j < x) {
					i++;
				}
				else {
					return true;
				}	
	
			}
			return false;
		}
		
	}


