package doubts;

import java.util.*;
public class Second {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		while(n-- != 0) {
			solve();
		}
	}
	public static void solve() {
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
	    for(int i = 0; i < 6; i++){
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i = 0; i < 2; i++){
	        for(int j = i + 1; j < 3; j++){
	            if(arr[i] == arr[j]){
	                if(arr[i + 3] != arr[j + 3]){
	                    System.out.println("NOT FAIR");
	                    return;
	                }
	            }
	            else if(arr[i] < arr[j]){
	                if(arr[i + 3] >= arr[j + 3]){
	                    System.out.println("NOT FAIR");
	                    return;
	                }
	            }
	            else{
	                if(arr[i + 3] <= arr[j + 3]){
	                    System.out.println("NOT FAIR");
	                    return;
	                }
	            }
	        }
	    }
	    
	    System.out.println("FAIR");
	}
}
