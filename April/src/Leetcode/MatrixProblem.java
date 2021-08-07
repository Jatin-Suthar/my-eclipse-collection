package Leetcode;

import java.util.*;
//5
//0 1 6 8 8 9
//5 6 1 6 8 9 
//6 5 6 1 1 9
//1 6 6 1 1 9
//6 3 3 3 3 9
//Sample Output 1
//1
//Explanation 1
//Following elements are present consecutively at least four times: Element 3 horizontally in the 5th row. Element 1 diagonally starting from the 2nd column
//in the first row. Element 6 diagonally starting from the 4th column in the second row. Element 9 vertically in the 6th column. As element 1 is the smallest 
//value of the four identified sets of consecutive values, the output is 1  
//
//
//
//Sample input 2
//5
//0 1 6 8 6 0
//5 5 2 1 8 2
//6 5 6 1 1 9
//1 5 6 1 4 0
//3 7 3 3 4 0 
//Sample Output 2
//-1
public class MatrixProblem {
	public int sub(int a[][] , int m , int n) {
		//store all the available values
		//i use the array list to store the max possible outcoms
		//coz it is simple when i sort the array only i have to do is just return arrayList[0] element 
		//very ezz
		ArrayList<Integer> al = new ArrayList<Integer>();
		int num = 0;
		int p = 0, q = 0;
		int length = 0;
		int k = 3;
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				//this statement is for the right diagonal match if its equal to its parent element
				if(i < 2 && j < 3) {
					k = 3;
					p = i;
					q = j;
					while(k != 0) {
						if(a[i][j] == a[p+1][q+1]) {
							length++;
							p++;
							q++;
						}
						k--;
					}
					if(length == 3) {
						al.add(a[i][j]);
					}
				}
				//this statement is for the downward match if its equal to its parent element
				if(i < 2) {
					length = 0;
					p = i;
					q = j;
					k = 3;
					while(k != 0) {
						if(a[i][j] == a[p+1][q]) {//a[1][5] p = 1 2nd p = 2
							length++;
							p++;
						}
						k--;
					}
					if(length == 3) {
						al.add(a[i][j]);
					}
				}
				//this statement is for the forward match if its equal to its parent element
				if(j < 3) {
					 length = 0;
					 k = 3;
					 p = i;
					 q = j;
					 while(k != 0) {
						 if(a[i][j] == a[p][q+1]) {
							 length++;
							 q++;
						 }
						 k--;
					 }
					 if(length == 3) {
						 al.add(a[i][j]);
					 }
				}
				//this statement is for left diagonal match if its equal to its parent element
				if(i < 2 && j > 2) {
					length = 0;
					p = i;
					q = j;
					k = 3;
					while(k != 0) {
						if(a[i][j] == a[p+1][q-1]) {
							length++;
							p++;
							q--;
						}
						k--;
					}
					if(length == 3) {
						al.add(a[i][j]);
					}
				}
			}
		}
		if(al.isEmpty()) {
			return -1;
		}
		Collections.sort(al);
		int min = al.get(0);
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// m x n array
		int m = sc.nextInt();
		int n = 6;
		int a[][] = new int[m][n];
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		MatrixProblem mx = new MatrixProblem();
		System.out.println(mx.sub(a, m, n));
	}
}
