package arrayProblems;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.println("enter the no of students : ");
//	
//	int a = sc.nextInt();
//	
//	int marks[] = new int[a];
//	
//	System.out.println("enter the marks now : ");
//	
//	for(int i = 0 ; i < a ; i++) {
//		
//		marks[i] = sc.nextInt();
//		
//	}
//	
//	int averageMarks = 0; 
//	
//	for(int i = 0 ; i < a ; i++) {
//		
//		averageMarks = averageMarks + marks[i];
//		
//	}
//	
//	averageMarks = averageMarks/a;
//	
//	System.out.println("average marks : " + averageMarks);
	
		Scanner sc = new Scanner(System.in);
		
//		int temp = sc.nextInt();
//		
//		int n = temp;
//		
//		int m = n;
//		
//		n = temp;
//		
//		int a[][] = new int[n][m];
//		
//		int sum1 = 0;
//		
//		int sum2 = 0;
//
//		if(n == m) {
//		
//		for(int i = 0 ; i < n ; i++) {
//		
//			for(int j = 0 ; j < m ; j++) {
//				
//			a[i][j] = sc.nextInt();
//			
//			}
//			
//		}
//		
//		for(int i = 0, j=0 ; i < n && j < m ; i++,j++) {
//					
//					sum1 = sum1 + a[i][j];
//				
//		}
//		
//		for(int i = 0, j = m - 1 ; i < n && j >= 0 ; i++,j--) {
//					
//					sum2 = sum2 + a[i][j];
//					
//		}
//		
//		int gap = sum2 - sum1;
//		
//		if(gap < 0) {
//			
//			System.out.println(-gap);
//		
//		}else {
//			
//			System.out.println(gap);
//			
//		}
//		}
		
		int n = sc.nextInt();
			
	    int a[] = new int[n];
	    
	    int len = a.length;
	    
		float p = 0;
		float q = 0;
		float r = 0;

	    for(int i = 0 ; i < n ; i++) {
	    	
	    	a[i] = sc.nextInt();
	    	
	    }
	    
	    
	    for(int i = 0 ; i < n ; i++) {
	    	
	    	if(a[i] > 0) {
	    		
	    	    p++;
	    		
	    	}else if(a[i] == 0) {
	    		
	    		q++;
	    		
	    	}else if(a[i] < 0) {
	    		
	    		r++;

	    	}
	
	    }
	         
	    System.out.printf("%1.6f",p/len);
	    
	    System.out.println();

	    System.out.printf("%1.6f",q/len);
	    
	    System.out.println();

	    System.out.printf("%1.6f",r/len);
	    
	    System.out.println();
	    
	}
	

}
