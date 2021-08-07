package hackerrankques;

import java.util.Scanner;

public class ArrayManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a[] = new int[n+1];
		for(int i = 0 ; i <= n ; i++) {
			a[i] = 0;
		}
		while(t-- != 0) {		
			int l = sc.nextInt();
			int r = sc.nextInt();
			int summand = sc.nextInt();
			System.out.println();
			summandfind(a , l , r , summand);
			for(int i = 1 ; i <= n ; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	    int maxCounter = 0;
	    int element=0;
	    for (int i = 1; i < a.length ; i++) {
	    	int counter =1;
	        for (int j = i+1; j <a.length ; j++) {
	        	if(a[i]==a[j]){
	                counter++;
	            }
	        }
	        if(maxCounter<counter){
	            maxCounter=counter;
	            element = a[i];
	        }
	    }
	    System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);	
		sc.close();
	}
	public static void summandfind(int a[] , int l , int r , int summand) {
		if(a.length == 1 && l == r) {
			a[0] = a[0] + summand;
		}
		for(int i = l ; i < a.length ; i++) {
			if(i >= l && i <=r) {
				a[i] = a[i] + summand;
			}
		}
	}
}
