package LalitJhangid;

import java.util.*;

public class HasZeroSumProblem {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		boolean result = hasZeroSum(a, n);
		if(result)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean hasZeroSum(int[] a, int n) {
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		int sum = 0;
		set.add(0);
		for(int i = 0 ; i < n ; i++) {
			sum += a[i];
			if(set.contains(sum))
				return true;
			else 
				set.add(sum);
		}
		return false;
	}
}		
