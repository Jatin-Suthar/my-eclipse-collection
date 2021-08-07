package oops;

class Vehicle{

	int wheels;
	int headLight;
	String color;
	
	Vehicle(int wheels){
		
		this.wheels = wheels;
		
		headLight = 2;
		
	}
	
	Vehicle(int wheels , String color){
		
		this.wheels = wheels;
		this.color = color;
		headLight = 2;
		
	}
	
}

public class MyConstructer {
	
	MyConstructer(){
		
		System.out.println("object is now created");
		
	}

	public static void main(String[] args) {
		
		Vehicle car1 = new Vehicle(4);
		Vehicle car2 = new Vehicle(3);
		
		Vehicle scooty = new Vehicle(2,"yellow");
		
		System.out.println("scooty has "+scooty.color +" color "+ "and "+ scooty.wheels + " wheels.");
		
		System.out.println("car1 has "+car1.wheels + " wheels and " + car1.headLight +" headlight ."+" car2 has "+car2.wheels +" wheels and "+car2.headLight+ " headlight");
		
	}
	
}
