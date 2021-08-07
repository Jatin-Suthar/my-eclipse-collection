package hello;

import java.util.*;
public class StackProblems2 {
    /*
     * Complete the twoStacks function below.
     */
    static int twoStacks(int x, int[] a, int[] b) {
    	int lb = 0; 
    	int sum = 0;
    	while(lb < b.length && sum + b[lb] <= x) {
    		sum += b[lb];
    		lb++;
    	}
    	int maxSum = lb; 
    	for(int la = 1 ; la <= a.length ; la++) {
    		sum += a[la - 1];
    		while(sum > x && lb > 0) {
    			lb--;
    			sum -= b[lb];
    		} 
    		if(sum > x) {
    			break;
    		}
    		maxSum = Math.max(maxSum, la + lb);
    	}
    	return maxSum;
    	
    }
    public static int[] readArray(Scanner sc , int size) {
    	int result[] = new int[size];
    	for(int i = 0 ; i < size ; i++) {
    		result[i] = sc.nextInt();
    	}
    	return result;
    } 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while(t-- != 0) {
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	int x = sc.nextInt();
        	int a[] = readArray(sc , n);
        	int b[] = readArray(sc , m);
    		System.out.println(twoStacks(x , a , b));
    	}
    }
}

