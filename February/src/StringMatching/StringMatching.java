package StringMatching;

import java.io.*;

public class StringMatching {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the first string : ");
		String s1 = br.readLine();
		System.out.print("\nEnter the second string : ");
		String s2 = br.readLine();
		int result = match(s1 , s2);
		if(result == -1) {
			System.out.println("\nBoth String are not matching");
		}else {
			System.out.println("\nBoth String are matching at " + result);
		}
	}
	static int match(String s1 , String s2) {
		int n = s1.length();
		int m = s2.length();
		int result = -1;
		for(int i = 0 ; i <= n - m ; i++) {
			int j;
			for(j = 0 ; j < m ; j++) {
				if(s1.charAt(i+j) != s2.charAt(j)) {
					break;
				}
			}
			if(j == s2.length()) {
				result = i;
			}
		}
		return result;
	}
}
