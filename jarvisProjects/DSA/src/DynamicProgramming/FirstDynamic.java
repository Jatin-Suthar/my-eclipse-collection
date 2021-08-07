package DynamicProgramming;

import java.util.Scanner;

public class FirstDynamic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FirstDynamic obj = new FirstDynamic();
		obj._initialize();
		System.out.println(obj.DynamicP(n));
	}
	final static int MAX = 100; 
	final static int NIL = -1; 
	 
	static int lookup[] = new int[MAX]; 
	  
	void _initialize() { 
		for (int i = 0; i < MAX; i++) 
			lookup[i] = NIL; 
	} 
	int DynamicP(int n) {
		if(n < 1) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}
		if(n == 1) {
			return 1;
		}
		
		if(lookup[n] != -1) {
			return lookup[n];
		}
		return lookup[n] =  DynamicP(n - 2) + DynamicP(n - 3) + DynamicP(n - 5);
	}
}
