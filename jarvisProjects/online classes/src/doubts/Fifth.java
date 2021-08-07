package doubts;

import java.util.Scanner;

public class Fifth {
	public static void main(String[] args) {
		try {
			 throw 10;
		}catch(int e) {
			System.out.println("Got the Exception " + e);
		}
	}
}
