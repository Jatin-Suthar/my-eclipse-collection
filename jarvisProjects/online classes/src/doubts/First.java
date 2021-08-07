package doubts;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 5;
		for(int j = 1 ; j < 6 ; j++) {
			int RegNol = sc.nextInt();
			String Name = sc.next();
			int n = 3;
			int a[] = new int[n];
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("Details of student " + j + ": ");
			int sumOfSub = a[0] + a[1] + a[2];
			System.out.println("RegNo is : " + RegNol);
			System.out.println("Name is : " + Name);
			for(int i = 0 ; i < n ; i++) {
				System.out.print("Marks of three Subject : " + a[i] + " ");
			}
			System.out.println();
			System.out.println("Total marks is : " + sumOfSub);
		}
	}
}


