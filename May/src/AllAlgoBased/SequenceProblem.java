package AllAlgoBased;

import java.util.*;

public class SequenceProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(function(a, n));
	}

	public static int function(int[] a, int n) {
		ArrayList<Integer> al = new ArrayList<>();
		int b[] = new int[n-3];
		boolean result = true; 
		int count = 0;
		int j = 0;
		for(int i = 0 ; i < n-3 ; i++) {
			int sum = 0;
			for(j = 0 ; j < 4 ; j++) {
				sum += a[i + j];
				b[i] = sum;
			}
		}
		Arrays.sort(b);
		return b[b.length-1];
	}
}
