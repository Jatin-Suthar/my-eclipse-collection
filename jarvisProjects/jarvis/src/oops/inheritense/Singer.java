package oops.inheritense;

public class Singer extends Person{

	public Singer(String name) {
		
		super(name);
		
	}
	
	public void singing() {
		
		System.out.println(name + " is singing");
		
	}

	public void eat() {
		
		System.out.println("singer "+ name + " is eating");
		
	}
	
}
