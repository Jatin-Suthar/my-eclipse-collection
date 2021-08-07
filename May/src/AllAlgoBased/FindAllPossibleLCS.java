package AllAlgoBased;

public class FindAllPossibleLCS {
	public static void main(String[] args) {
		String a = "ABCBDAB";//ABCBDAB, Y = BDCABA
		String b = "BDCABA";
		int m = a.length();
		int n = b.length();
		System.out.println(findAllPosibleLCS(a, b, m, n));
	}

	public static int findAllPosibleLCS(String a, String b, int m, int n) {
		
		int temp[][] = new int[m+1][n+1];
		for(int i = 0 ; i < m; i++) {
			temp[i][0] = 0;
		}
		
		for(int i = 0 ; i < n ; i++) {
			temp[0][i] = 0;
		}
		
		
		for(int i = 1 ; i <= m ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					temp[i][j] = 1 + temp[i-1][j-1];
				}else {
					temp[i][j] = Math.max(temp[i-1][j], temp[i][j-1]);
				}
			}
		}
		
		return temp[m][n];
	}
}
