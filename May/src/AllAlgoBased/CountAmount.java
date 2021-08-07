package AllAlgoBased;

public class CountAmount {
	public static void main(String[] args) {
		int a[][] = {{4,7,1,6},{5,7,3,9},{3,2,1,2},{7,1,6,3}};
		int amount = 25;
		int m = 4;
		int n = 4;
		System.out.println("Totol no. of ways : " + countAmount(a, m-1, n-1, amount));
	}

	private static int countAmount(int[][] a, int m, int n, int amount) {
		
		if(amount < 0) {
			return 0;
		}
		
		if(m==0 && n==0)
		{
			if(a[0][0]-amount==0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
			
		}
		
		if(m == 0) {
			return countAmount(a, m, n-1, amount-a[m][n]);
		}
		
		if(n == 0) {
			return countAmount(a, m-1, n, amount-a[m][n]);
		}
		
		return countAmount(a, m-1, n, amount-a[m][n]) + countAmount(a, m, n-1, amount-a[m][n]);
	}
}
