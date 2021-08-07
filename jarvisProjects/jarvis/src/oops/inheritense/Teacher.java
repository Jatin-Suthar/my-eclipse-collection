package oops.inheritense;

public class Teacher extends Person{

	public Teacher(String name) {
		
		super(name);
		
		System.out.println("inside teacher constructor");
		
	}

	public void teaching(){
		
		System.out.println(name + " is teaching");
		
	}	
	
	public void eat() {
		
		super.eat();
		
		System.out.println("teacher "+ name + " is eating");
		
	}
	
}
