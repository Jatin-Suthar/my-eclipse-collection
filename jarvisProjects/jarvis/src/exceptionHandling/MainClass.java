package exceptionHandling;

public class MainClass {

	public static void main(String[] args) {

//		try {
//		int a = 2;
//		int b = 0;
//		
//		int c = a/b;
//		
//		System.out.println("result is " + c);
//		
//		}catch(ArithmeticException e) {
//			
//			System.out.println(e +" : is your error , plz fix it.");
//			
//		}
//		
//		System.out.println("this code is very important");
//		System.out.println("i need this code");
		func1();
//	
	}

	static void func1() {
		
		int a = 2;
		int b = 1;
		
		int c = a/b;
		
		System.out.println("result is " + c);
		
		try {
			
			func2();
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage()+" ocurred.");
			
		}
		
	}
	
	static void func2() throws ArrayIndexOutOfBoundsException{
	
		boolean isDanger = true;
		if(isDanger) {
			
			throw new ArrayIndexOutOfBoundsException("something danger here");
			
		}
		
		
		
	
	
	}
	
	
}
