package Array;

import java.util.Scanner;

public class Chef1 {
	public int max(int a[]) {
		int max = 0;
		max = a[0];
		int index = 0;
		for(int i = 1 ; i < a.length ; i++) {
			if(a[i] > max) {
				index = i;
			}
		}
		return index;
	}
	public int min(int a[]) {
		int min = 0;
		min = a[0];
		int index = 0;
		for(int i = 1 ; i < a.length ; i++) {
			if(a[i] < min) {
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) throws java.lang.Exception {
		try {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-- != 0) {
				int n = sc.nextInt();
				int a[] = new int[n];
				int b[] = new int[n];
				for(int i = 0 ; i < n ; i++) {
					a[i] = sc.nextInt();
				}
				for(int i = 0 ; i < n ; i++) {
					b[i] = sc.nextInt();
				}
				Chef1 f = new Chef1();
				int max = f.max(a);
				int result = 0;
				if(a.length == 2) {
					if(a[0] == a[1]) {
						System.out.println(0);
					}
				}
				for(int i = 0 ; i < n ; i++) {
					if(a[i] == a[max]) {
						continue;
					}
					for(int j = a[i] ; j < a[max] ; j++) {
						result = result + b[i];
					}
				}
				System.out.println(result);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
