package AllAlgoBased;

public class CoinNamountProblem {
	public static int minAmount(int a[], int n, int amount) {
		//this following code is using recursion
		if(amount == 0) {
			return 0;
		}
		if(amount < 0) {
			return Integer.MAX_VALUE;
		}
		int coin = Integer.MAX_VALUE;
		int result;
		for(int i = 0 ; i < n ; i++) {
			result = minAmount(a, n, amount - a[i]);
			if(result != Integer.MAX_VALUE) {
				coin = Math.min(coin, result + 1);
			}
		}
		return coin;
	}
	public static int minAmountDp(int a[], int n, int amount) {
		int store[] = new int[amount+1];
		store[0] = 0;
		for(int i = 1 ; i <= amount ; i++) {
			store[i] = Integer.MAX_VALUE;
			int result = Integer.MAX_VALUE;
			for(int j = 0 ; j < n ; j++) {
				if((i - a[j]) >= 0) {
					result = store[i - a[j]];
				}
				if(result != Integer.MAX_VALUE) {
					store[i] = Math.min(store[i], result+1);
				}
			}
		}
		return store[amount];
	}
	public static int uniqueWays(int a[], int n, int amount) {
		if(amount == 0) {
			return 1;
		}
		if(amount < 0 || n < 0) {
			return 0;
		}
		
		int include = uniqueWays(a, n, amount - a[n]);
		int exclude = uniqueWays(a, n-1, amount);
		
		return include+exclude;
	}
	public static int numberOfWays(int a[], int n, int amount) {
		if(amount == 0) {
			return 1;
		}
		if(amount < 0) {
			return 0;
		}
		int result = 0;
		
		for(int i = 0 ; i < n ; i++) {
			result+=numberOfWays(a, n, amount - a[i]);
		}
		
		return result;
	}
	public static int sub(int a[], int n, int amount) {
		if(amount == 0) {
			return 1;
		}
		if(amount < 0 || n < 0) {
			return 0;
		}
		int include = sub(a, n-1, amount-a[n]);
		int exclude = sub(a, n-1, amount);
		
		return (include|exclude);
	}
	public static boolean subUsingDP(int a[], int n, int sum) {
		boolean res[][] = new boolean[n+1][sum+1];
		for(int i = 0 ; i <= n ; i++) {
			res[i][0] = true;
		}
		for(int i = 1 ; i <= sum ; i++) {
			res[0][i] = false;
		}
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= sum ; j++) {
				if(a[i-1] > j) {
					res[i][j] = res[i-1][j];
				}else {
					res[i][j] = res[i-1][j]|res[i-1][j - a[i-1]];
				}
			}		
		}
		return res[n][sum];
	}
	public static void main(String[] args) {
		int a[] = {1, 3, 5, 7};
		int n = a.length;
		int amount = 4;
		int f = minAmountDp(a, n, amount);
		if(f == Integer.MAX_VALUE) {
			System.out.println("enter a feasible value");
		}else {
			System.out.println("the min cost it takes to find amount is : " + f);
		}
		int numberOfWaysToFindMin = numberOfWays(a, n, amount); 
		System.out.println("the total no. of ways to find costs in which amount is filled is : " + numberOfWaysToFindMin);
		System.out.println("the no. of unique ways to find cost in which amount is filled is: " + uniqueWays(a, n - 1, amount));
		int res = sub(a, n-1, 14);
		if(res == 1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		if(subUsingDP(a, n, 15)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
