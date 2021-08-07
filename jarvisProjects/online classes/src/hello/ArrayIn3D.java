package hello;

import java.util.Scanner;

public class ArrayIn3D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int c[][] = new int[3][3];
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				c[i][j] = 0;
				for(int k = 0 ; k < 3 ; k++) {
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				}
			}
		}
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
