package AllAlgoBased;

public class FindingThePathProblem {
	public static void main(String[] args) {
		int a[][] = {{1,2,3,4},{5,6,7,8},{5,4,3,2},{8,2,5,4}};
		int m = a[0].length;
		int n = a.length;
		System.out.println(usingDyanmic(a,m,n));
	}
	public static int minCost(int a[][], int m, int n){
		//From recursion but its complexity is in exponential terms.
		if(m == 0 || n == 0) {
			return Integer.MAX_VALUE;
		}
		if(m == 1 && n == 1) {
			return a[0][0];
		}
		
		return Math.min(minCost(a,m-1,n), minCost(a,m,n-1)) + a[m-1][n-1];
	}
	public static int usingDyanmic(int a[][], int m , int n) {
		int b[][] = new int[m][n];
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				b[i][j] = a[i][j];
				if(i == 0 && j > 0) {
					b[0][j]+=b[0][j-1];
				}else if(j == 0 && i > 0) {
					b[i][0]+=b[i-1][0];
				}else if(j > 0 && i > 0) {
					b[i][j]+=Math.min(b[i-1][j], b[i][j-1]);
				}
			}
		}
		return b[m-1][n-1];
	}
	
}
