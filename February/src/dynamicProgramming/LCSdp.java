package dynamicProgramming;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;


//time complexity of longest common sequence is O(m*n) and m and n are the length of the string.

public class LCSdp {
	
	static int N = 100;
	static int [][]L = new int[N][N];
	
	static Set<String> findLCS(String X, String Y, int m, int n)
	{
	    Set<String> s = new HashSet<>();
	    if (m == 0 || n == 0)
	    {
	        s.add("");
	        return s;
	    }
	    if (X.charAt(m - 1) == Y.charAt(n - 1))
	    {
	        Set<String> tmp = findLCS(X, Y, m - 1, n - 1);
	        for (String str : tmp)
	            s.add(str + X.charAt(m - 1));
	    }
	    else
	    {
	        if (L[m - 1][n] >= L[m][n - 1])
	            s = findLCS(X, Y, m - 1, n);
	        if (L[m][n - 1] >= L[m - 1][n])
	        {
	            Set<String> tmp = findLCS(X, Y, m, n - 1);
	            s.addAll(tmp);
	        }
	    }
	    return s;
	}
	public static int LcsDp(String s1, String s2, int m, int n) {
		//using memorisation with the help of dynamic programming!
		int a[][] = new int[m+1][n+1];
		for(int i = 0 ; i < m ; i++) {
			a[i][0] = 0;
		}
		for(int i = 0 ; i < n ; i++) {
			a[0][i] = 0;
		}
		for(int i = 1 ; i < m ; i++) {
			for(int j = 1 ; j < n ; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					a[i][j] = 1 + a[i-1][j-1];
				}else {
					a[i][j] = Math.max(a[i][j-1] , a[i-1][j]);
				}
			}
		}
		return a[m-1][n-1];
	}
	int lcs( char[] X, char[] Y, int m, int n) { 
	    if (m == 0 || n == 0) { 
	    	return 0; 
	    }
	    if (X[m-1] == Y[n-1]) {
	    	return 1 + lcs(X, Y, m-1, n-1); 
	    }else {
	    	return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n)); 
	    }
	    //complexity of this is O(n*2^m)
	}
	int max(int a, int b){ 
	    return (a > b)? a : b; 
	}
	public static void main(String[] args) {
		LCSdp lcs = new LCSdp(); 
	    String s1 = "ABC"; 
	    String s2 = "DEF"; 
	    String last = "ABCDEF";
	    String res = s1.concat(s2);
	    System.out.println(res);
	    if(last.length()-1 == LcsDp(res, last, res.length(), last.length())) {
	    	System.out.println("FOUND...");
	    }else {
	    	System.out.println("NOT FOUND....");
	    }
//	    Map<String, Integer> map = new HashMap<>();
//	    char[] X=s1.toCharArray(); 
//	    char[] Y=s2.toCharArray(); 
//	    int m = X.length; 
//	    int n = Y.length; 
//	    Set<String> s= findLCS(s1, s2, m, n);
//	    Stack<String> stk = new Stack<String>();
//	    for(String str : s) {
//	    	stk.push(str);
//	    }
//	    System.out.println(stk.pop());
//	    System.out.println("Length of LCS is" + " " + lcs.lcs( X, Y, m, n) );
	}
	
}
