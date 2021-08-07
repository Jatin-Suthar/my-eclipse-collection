package jarvis;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("HELLO WORLD");

		int a = 2;
		
		for(int i = 1 ; i <= 10 ; i++) {
			
			a =  a + (1 << i);
		
			System.out.println(a);
		}
		
	}

}
