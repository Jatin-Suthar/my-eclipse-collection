package algorithm;

import java.util.Scanner;

public class StringPallindromApproach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int left = 0;
		int right = s.length()-1;
		boolean result = findPallindrom(s, left, right);
		if(result)
			System.out.println("This String : '" + s + "' is Pallindrom....");
		else
			System.out.println("This String : '" + s + "' is not Pallindrom....");
	}

	public static boolean findPallindrom(String s, int left, int right) {
		if(left >= right) {
			return true;
		}
		if(s.charAt(left) != s.charAt(right)) {
			return false;
		}
		return findPallindrom(s, left+1, right-1);
	}
}
