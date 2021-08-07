
package arrayProblems;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first array rows");
		
		int m = sc.nextInt();
		
		System.out.println("enter the first array colomn");
		
		int n = sc.nextInt();
		
		System.out.println("enter the second array rows");
		
		int o = sc.nextInt();
		
		System.out.println("enter the second array colomn");
		
		int p = sc.nextInt();
		
		int a[][] = new int[m][n];
		
		int b[][] = new int[o][p];
		
		int sum = 0; 
		
		if(n == o){

		System.out.println("enter the first matrix : ");
		
		for(int i = 0 ; i < m ; i++) {
			
			for(int j = 0 ; j < n ; j++) {
				
				a[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("enter the second matrix : ");
		
		for(int i = 0 ; i < m ; i++) {
			
			for(int j = 0 ; j < n ; j++) {
				
				b[i][j] = sc.nextInt();
				
			}
			
		}
		
		int c[][] = new int[m][n];
		
		for(int i = 0 ; i < m ; i++) {
			
			for(int j = 0 ; j < n ; j++) {
				
				for(int k = 0 ; k < n ; k++ ) {
	
				c[i][j] = c[i][j] + a[i][k] * b[k][j];
				
				}
			}
			
		}
		
		System.out.println("multiplication of the matrixes is");
		for(int i = 0 ; i < m ; i++) {
			
			for(int j = 0 ; j < n ; j++) {
	
				System.out.print(c[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		}else {
			
			System.out.println("multipication cant be done");
			
		}
	}

}
