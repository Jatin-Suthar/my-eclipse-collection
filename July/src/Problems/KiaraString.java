package Problems;

import java.util.Scanner;

public class KiaraString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		String a = b.toLowerCase();
		int v=0, c=0, w=0, s=0, d=0;
		for(int i = 0 ; i < a.length() ; i++) {
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u')
				v++;
			else if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
				c++;
			else if(a.charAt(i) == ' ')
				w++;
			else if(Character.isDigit(a.charAt(i)))
			      d++;
			else
				s++;
		}
		System.out.println("Vowels:"+v);
		System.out.println("Consonants:"+c);
		System.out.println("White Spaces:"+w);
		System.out.println("Digits:"+d);
		System.out.println("Symbols:"+s);
	}
}
