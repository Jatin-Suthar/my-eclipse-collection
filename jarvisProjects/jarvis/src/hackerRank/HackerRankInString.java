package hackerRank;

import java.util.Scanner;

public class HackerRankInString {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);

		int q = scan.nextInt();
		while(q-- > 0) {
			String s1 = scan.next();
			String s2 = "hackerrank";
			int m = s1.length();
			int n = s2.length();

			char a[] = s1.toCharArray();
			char b[] = s2.toCharArray();

			int c[][] = new int[n + 1][m + 1];

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					if (b[i - 1] == a[j - 1]) {
						c[i][j] = c[i - 1][j - 1] + 1;
					} else {
						c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
					}
				}
			}
			
			int count = c[n][m];
			if(count == n) {
				
				System.out.println("YES");
				
			} else {
				System.out.println("NO");
			}
		}
	}
}

	
