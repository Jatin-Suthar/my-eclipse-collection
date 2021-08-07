package singletonPattern;

public class MainClass {

	public static void main(String[] args) {

		AppConfigue obj = AppConfigue.getInstance();
		
		AppConfigue obj1 = AppConfigue.getInstance();
		
		AppConfigue obj2 = AppConfigue.getInstance();

		
	}

}
