package oops;

class Dog {
	
	boolean hasFur;
	String color,beard;
	int legs,tails;
	
	public void walk(){
		System.out.println("dog is walking");
	}
	public void eat() {
		System.out.println("dog is eating");
	}
	public void description() {
		System.out.println(" dog has " + legs + " legs" + " dog has " + tails + " tails");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.legs = 4;
		dog1.tails = 1;
		dog2.legs = 6;
		dog2.tails = 1;
		
		dog1.description();
		dog2.description();

	}

}
