package recursion;

import java.util.*;
public class TowerOfHanoi {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 1;
		int h = 2;
		int d = 3; 
		int steps = 0;
		System.out.println("moving plates from source to destination");
		solve(s , d , h , n , steps);
	}
	
	public static void solve(int s , int d , int h , int n , int steps) {
		steps++;
		if(n == 1) {
			System.out.println("moving plate from s to d");
			return;
		}
		
		solve(s , h , d , n-1 , steps);
		System.out.println("moving n-1 plate from s to h .");
		solve(h , d , s , n-1 , steps);
		System.out.println(steps);
		return;
	}	
}
