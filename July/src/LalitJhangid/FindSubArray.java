package LalitJhangid;

import java.util.*;

public class FindSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		findMaxLenSubarray(a, sum);
		findSubArray(a, sum);
	}

	public static void findSubArray(int[] a, int sum) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int count = 0;
		int start = 0;
		int end = -1;
		for(int i = 0 ; i < a.length ; i++) {
			count += a[i];
			
			map.putIfAbsent(sum, i);
			
			if(map.containsKey(count - sum) && start < i - map.get(count - sum)) {
				start = i - map.get(count - sum);
				end = i;
			}
		}
		if(end == -1) 
			System.out.println("There is no subarray whose sum is " + sum);
		else 
			System.out.println("the subarray lies between " + (end - start + 1) + " and " + end + " whose sum is " + sum);
	}
	public static void findMaxLenSubarray(int[] A, int S) {
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);
        int sum = 0;
        int len = 0;
        int end = -1;
        for (int i = 0; i < A.length; i++)
        {
            sum += A[i];
            
            map.putIfAbsent(sum, i);
            
            if (map.containsKey(sum - S) && len < i - map.get(sum - S))
            {
                len = i - map.get(sum - S);
                end = i;
            }
        }
        if(end == -1)
        	System.out.println("No subarray found for the sum : " + S);
        else
        	System.out.println("The longest subarray lies between " + (end - len + 1) + " to " + end + " with the sum of " + S);
    }
}
