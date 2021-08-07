package hackerRank;

import java.util.Scanner;

public class IsPanagram {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
			
		int n = a.length();
			
		int b = 0;
			
		for(char i = 0 ; i < n ; i++) {
			
			if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
					
				b = b + 1;
					
			}

		}
			
		if(b < n) {
				
			System.out.println("panagram");
			
		}else {
			
			System.out.println("not panagram");
			
		}
			
	}
}

