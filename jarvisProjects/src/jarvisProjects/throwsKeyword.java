package jarvisProjects;

import java.util.Scanner;

public class throwsKeyword {
	public static void main(String[] args) throws MyException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if(n == 1 || n == 2) {
			System.out.println(n + " is a prime no.");
		}
		for(int i = 2 ; i < n ; i++) {
			if(n % i != 0) {
				throw new MyException(n);
			}else {
				System.out.println(n + " is not a prime number.");
			}
		}
	}
}
class MyException extends Exception {
	int a;
	MyException(int b){
		a = b;
	}
	public String toString() {
		return (a + " is a prime no.");
	} 
}
