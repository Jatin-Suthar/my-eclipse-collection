package recursion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSubset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int index = 0;
		String cur = " ";
		Set<String> set = new HashSet<>();
		solve(str , index , cur , set);
		Object[] a = set.toArray();
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i]);
		}
		sc.close();
	}
	
	static Set<String> solve(String str , int index , String cur , Set<String> set){
		int n =  str.length();
		if(index == n) {
			set.add(cur);
			return set;
		}	
		
		String op1 = cur;
		String op2 = cur;
		op2 = cur + str.charAt(index);
		index = index + 1;
		set.add(op1);
		set.add(op2);
		solve(str , index , op1, set);
		solve(str , index , op2 , set);
		return set;		
	}

}
