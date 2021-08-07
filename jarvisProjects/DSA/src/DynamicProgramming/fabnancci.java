package DynamicProgramming;

import java.util.Scanner;

public class fabnancci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f[] = new int[n + 1];
		System.out.println(func(f , n));
	}
	static int func(int f[] , int n) {
		f[0] = 0;
		f[1] = 1;
		
		for(int i = 2 ; i <= n ; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}
}
