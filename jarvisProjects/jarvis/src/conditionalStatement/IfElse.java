package conditionalStatement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
//		int number = 40;
//		
//		if(number <= 20) {
//			System.out.println("number is less than 20");
//		}
//		else if(number > 20 && number <= 45){
//			System.out.println("number is greater than 20 and less than 45");
//		}
//		else if(number > 20 && number <= 35){
//			System.out.println("number is greater than 20 and less than 35");
//		}
//		else {
//			System.out.println("it is not valid");
//		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a = ");
		int a = sc.nextInt();
		
		System.out.println("enter b = ");
		int b = sc.nextInt();
		
		
		int maxOfBothNo = 0;
		
		maxOfBothNo = a > b ? a : b;
		
		System.out.println("max of both no. = " + maxOfBothNo);
	}

}
