package oops.packages.models;

public class Teachers {
	
	public static void main(String[] args) {
		
	
		Student obj = new Student("jatin");
		
		obj.name = "jarvis";
		
		obj.getPassword();
		
		System.out.println("name is " + obj.name + " password is " + obj.getPassword());
		
	}
	
}
