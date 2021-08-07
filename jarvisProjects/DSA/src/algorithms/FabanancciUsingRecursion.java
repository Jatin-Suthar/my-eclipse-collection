package algorithms;

public class FabanancciUsingRecursion {

	public static void main(String[] args) {
		int n = 15;
		System.out.print(n1 + " " + n2);
		fabnancci(n-2);
	}

	static int n1 = 0 , n2 = 1 , n3 = 0;
	
	static void fabnancci(int n) {
		if(n > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fabnancci(n-1);
		}		
	}

}
