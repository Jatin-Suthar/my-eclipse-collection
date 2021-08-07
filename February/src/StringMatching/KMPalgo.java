package StringMatching;

import java.util.Scanner;

public class KMPalgo {
	public void getPrefixSuffix(char[] pat , int m , int[] pi) {
		int length = 0;
		pi[0] = 0;
		int i = 1;
		while(i < m) {
			if(pat[i] == pat[length]) {
				length++;
				pi[i] = length;
				i++;
			}else {
				if(length != 0) {
					length = pi[length - 1];
				}else {
					pi[i] = 0;
					i++;
				}
			}
		}
		System.out.print("LPS : ");
		for(int j = 0 ; j < pi.length ; j++) {
			System.out.print(pi[j] + " ");
		}
		System.out.println();
	}
	public void KmpAlgo(char[] text , char[] pat) {
		int n = text.length;
		int m = pat.length;
		int pi[] = new int[m];
		getPrefixSuffix(pat , m , pi);
		int i = 0 ;
		int j = 0;
		while(i < n) {
			if(pat[j] == text[i]) {
				i++;
				j++;
			}
			if(j == m) {
				System.out.println("Match found at Index : " + (i - j));
				j = pi[j-1];
			}else if(i < n && pat[j] != text[i]) {
				if(j != 0) {
					j = pi[j - 1];
				}else {
					i++;
				}
			}
		}
	}
	public static void main(String[] args) {
		KMPalgo k = new KMPalgo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the both Strings : ");
		String s1 = sc.next();
		String s2 = sc.next();
		char[] text = s1.trim().toCharArray();
		char[] pat = s2.trim().toCharArray();
		k.KmpAlgo(text , pat);
	}
}
