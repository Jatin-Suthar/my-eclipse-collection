package recursion;

import java.util.Scanner;

public class SubsetOfAnString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ip = sc.next();
		int index = 0;
		String op = " ";
		solve(ip , index , op);
		sc.close();
	}
	
	static void solve(String ip , int index ,String op) {
		int n = ip.length();
		if(index == n) {
			System.out.print(op);
			return;
		}
		
		//two cases for every character
		//1.we consider first element in output. 
		//2.we not consider first element in output.
		//subset
		solve(ip , index + 1 , op + ip.charAt(index));
		solve(ip , index + 1 , op);
		return;
	}

}
