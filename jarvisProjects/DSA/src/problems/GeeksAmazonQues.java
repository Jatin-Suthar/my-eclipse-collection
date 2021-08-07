package problems;

import java.util.*;
public class GeeksAmazonQues {
	
	static void sort(int a[]) {
		Arrays.sort(a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0 ; i < a.length ; i++) {
				a[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			sort(a);
			int temp = 0;
			for(int i = 0 ; i < a.length ; i++) {
				if(a.length == k) {
					System.out.println(a[a.length-1]);
					break;
				}
				if(a[i] < a[a.length-1]) {
					temp += 1;
					if(temp == k) {
						System.out.println(a[i]);
						break;
					}
				}
			}
		}
		sc.close();
	}

}
