package recursion;

import java.util.*;
public class PermutationOfGivenString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		permutation(s , 0 , s.length()-1);
		sc.close();
	}
	
	static void permutation(String s , int l , int r) {
		if(r == l+1) {
			System.out.println(s);
			return ;
		}
		
		for(int i = 0 ; i < s.length() ; i++) {
			s = tochangeChar(s , l , i);
			permutation(s , l+1 , r);
			s = tochangeChar(s , l , i);
		}
	}
	
	static String tochangeChar(String s , int a , int b) {
		char array[] = s.toCharArray();
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return String.valueOf(array);
	}
}
