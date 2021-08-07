package scannerNew;
	import java.util.Scanner;
	
public class ScannerNew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("principal is :");
		int p = sc.nextInt();
		System.out.println("rate is :");
		float r = sc.nextFloat();
		System.out.println("time is :");
		int t = sc.nextInt();
		
		float simpleInterest = p*r*t/100;
		
		System.out.println("the simple interest is : " + simpleInterest);
	}

}
