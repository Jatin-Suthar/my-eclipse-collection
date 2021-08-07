// c. To write a java program to print the Armstrong numbers.
package hello;

import java.util.Scanner;

public class Basics {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = new String();
		s = sc.next();
		int l = 0;
		int a = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			l = Character.getNumericValue(s.charAt(i));
			a += Math.pow (l , s.length());
		}
		if(a == Integer.valueOf(s)) {
			System.out.println("the given no is armstrong");
		}else {
			System.out.println("the given no is not armstrong");
		}
		System.out.println(a);
		sc.close();
	}
}
