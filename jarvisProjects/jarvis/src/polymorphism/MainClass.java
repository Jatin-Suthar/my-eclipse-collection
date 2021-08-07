package polymorphism;

public class MainClass {

	public static void main(String[] args) {

//		Dog d = new Dog();
//		
//		Pet p = d;
//		
//		Animals a = d;
//		
//		p.walk();
//		d.walk();
		
		greeting("pussey cat",5);
		
		
	}
	
	public static void greeting() {
		
		System.out.println("hi there");
		
	}
	
	public static void greeting(String name) {
		
		System.out.println(name);
		
	}
	
	public static void greeting(String name , int count) {
		
		for(int i = 0 ; i < count ; i++) {
			
			System.out.println("football");
			
		}
	}

}
