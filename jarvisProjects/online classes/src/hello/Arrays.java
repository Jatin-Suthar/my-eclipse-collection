package hello;

import java.util.Collection;
import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int min = a[0];
		for(int i = 1 ; i < n ; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("min is : " + min);
		int max = a[0];
		for(int i = 1 ; i < n ; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("max is : " + max);
		sc.close();
	}

	public static Collection<? extends Integer> asList(int i, int j, int k, int l, int m, int n, int o) {
		// TODO Auto-generated method stub
		return null;
	}
}
