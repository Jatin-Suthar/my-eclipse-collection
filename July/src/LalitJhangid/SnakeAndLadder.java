package LalitJhangid;

import java.util.*;

public class SnakeAndLadder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//we have to first implement the concept to run snake and ladder.
		//so first we run while loop untill our count value is not zero.
		int dice;
		int count = 0;
		while(true) {
			dice = sc.nextInt();
			if(dice > 6) {//re-enter the dice value
				dice = sc.nextInt();
				count = count + dice;
			}else {
				count = count + dice;
			}
			if(count == 100) {
				System.out.println("hurray! u are winner");
				break;
			}else if(count > 100) {
				System.out.println("awww! very close");
				count = count - dice;
			}
			//write a switch case program to implement snake and ladder
			switch(count) {
			case 1:
				System.out.println("yeahh! ladder");
				count = 38;
				continue;
			case 4:
				System.out.println("yeahh! ladder");
				count = 14;
				continue;
			case 8:
				System.out.println("yeahh! ladder");
				count = 30;
				continue;
			case 21:
				System.out.println("yeahh! ladder");
				count = 42;
				continue;
			case 28:
				System.out.println("yeahh! ladder");
				count = 76;
				continue;
			case 32:
				System.out.println("snake bite!");
				count = 10;
				continue;
			case 36:
				System.out.println("snake bite!");
				count = 6;
				continue;
			case 48:
				System.out.println("snake bite!");
				count = 26;
				continue;
			case 50:
				System.out.println("yeahh! ladder");
				count = 67;
				continue;
			case 62:
				System.out.println("snake bite!");
				count = 18;
				continue;
			case 71:
				System.out.println("yeahh! ladder");
				count = 92;
				continue;
			case 80:
				System.out.println("yeahh! ladder");
				count = 99;
				continue;
			case 88:
				System.out.println("snake bite!");
				count = 24;
				continue;
			case 95:
				System.out.println("snake bite!");
				count = 56;
				continue;
			case 97:
				System.out.println("snake bite!");
				count = 78;
				continue;
			default:
				System.out.println(count);
				continue;
			}
		}
	}
}
