package Array;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int n =sc.nextInt();
			String a[][] = new String[n][n];
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					a[i][j] = "O";
				}
			}
			int max = 0;
			int min = 0;
			if(n == 1) {
				System.out.println("X");
			}
			if(n % 2 == 0) {
				System.out.println("Wrong Input");
			} 
			max = n-2;
			min = 1;
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					if(i == j) {
						a[i][j] = "O";
					}
					if(a[i][j] == a[i][max]) {
						for(int k = 0 ; k < n - 1 ; k++) {
							a[k][max] = "X";
							if(max == 0) {
								break;
							}
							max--;
						}
					}
					if(a[i][j] == a[min][j]) {
						for(int k = n-1 ; k >= 0 ; k--) {
							a[min][k] = "X";
							if(min == n-1) {
								break;
							}
							min++;
						}
					}
				}
			}
			a[0][0] = "O";
			a[n-1][n-1] = "O";
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
