package Problems;

import java.util.Scanner;

public class RemoveThe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] a = s.split(" ");
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i].equals("the")) {
				a[i] = "";
			}
		}
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] != "") {
				System.out.print(a[i] + " ");
			}
		}
	}
}
