package methods;

public class MethodsIntoduction {

	public static void main(String[] args) {
	
		int a = 32;
		int b = 24;
		
		int result = maxOf(a , b);
		
		maxOf(100, 101);
		
		System.out.println(result);
		
		sayHi();
		
		sayHi();
		
		sayHi();
	}

	static int maxOf(int a , int b) {
		
		if(a > b) {
			
			return a;
			
		}else {
			
			return b;
			
		}
			
	}
	
	static int maxOf(int a , int b , int c ) {
		
		
		return 0;
	}
	
	static void sayHi() {
		
		System.out.print("Hi");
		
		System.out.println(" Good Morning");
		
	}
	
	
}
