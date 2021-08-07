package AllAlgoBased;

import java.util.*;

public class StringProblems {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		int n = sc.nextInt();
		int count = 0;
//		for(int i = 0 ; i < str.length()-(n-1) ; i++) {
//			count = 0;
//			result = str.substring(i , n + i);
//			for(int j = 0 ; j < n ; j++) {
//				count = 0;
//				for(int k = 0 ; k < n; k++) {
//					if(result.charAt(j) == result.charAt(k)) {
//						count++;
//					}
//					if(count > 2) {
//						count = 0;
//						break;
//					}
//				}
//				if(count == 2) {
//					break;
//				}
//			}
//			if(count == 2) {
//				break;
//			}
//		}
		
		System.out.println(checkString(str, n, result));
	}
	public static String checkString(String str, int n, String result) {
		int i = 0;
		int count = 0;
		result = str.substring(i, n+i);
		
		if(sub(result, i, count, n, result.charAt(i))) {
			return result;
		}
			
		i++;
		return result;
	}
	public static boolean sub(String s, int i, int count, int n, char p) {
		if(s.length() == 0) {
			return false;
		}
		
		int mid = i + ((s.length()-1) - i)/2;

		if(p == s.charAt(mid)) {
			count++;
			if(count == 2) {
				return true;
			}
		}
		
		if(mid == 0) {
			return false;
		}
		if(mid == n) {
			return false;
		}
		
		
		sub(s.substring(i, mid-1), i, count, n, p);
		
		sub(s.substring(mid+1, n-1), i, count, n, p);
		
		return false;
	}
}
