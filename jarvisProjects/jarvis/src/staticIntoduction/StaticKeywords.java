package staticIntoduction;

import staticIntoduction.StaticNestedClass.*;

public class StaticKeywords {

	static {
		
		System.out.println("static block 1");
		
	}
	
	static {
		
		System.out.println("static block 2");
		
	}
	
	
	
	public static void main(String[] args) {

//		StaticNestedClass obj = new StaticNestedClass();
//		
//		b objb = obj.new b();
//		
//		c objc = new StaticNestedClass.c();

		System.out.println("insert main");
		
	}
	
	static {
		
		System.out.println("static block 3");
		
	}

}
