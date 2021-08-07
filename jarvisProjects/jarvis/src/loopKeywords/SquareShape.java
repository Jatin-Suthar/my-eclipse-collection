package loopKeywords;

import java.util.Scanner;

public class SquareShape {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any no.");
		
		int a = sc.nextInt();
		
		int rows = 2 * a + 1;
		
		for(int i = 1 ; i <= rows ; i++) {
			
			if(i == a + 1) {
				
				System.out.println();
				
			}
			
			if(i <= a) {
				
				for(int k = 1 ; k <= rows - a - i ; k++) {
					
					System.out.print("* ");
					
				}
			
				for(int j = 1 ; j <= 2 * i - 1 ; j++) {
				
					System.out.print("  ");
					
				}
				
				for(int k = 1 ; k <= rows - a - i ; k++) {
					
					System.out.print("* ");
					
				}
				
				
				
			}	else {
				
				for(int k = 1 ; k <= i - a - 1 ; k++) {
					
					System.out.print("* ");
					
				}
				
				for(int j=1 ; j <=  rows + (2 * a) + 2 - (2 * i) ; j++) {
					
					System.out.print("  ");
				}
				
				for(int k = 1 ; k <= i - a - 1 ; k++) {
					
					System.out.print("* ");
					
				}
			
				
				
			}
			
			System.out.println();
			
		}

	}

}
