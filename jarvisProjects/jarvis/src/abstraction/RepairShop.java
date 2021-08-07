package abstraction;

public class RepairShop {

	public static void repairCar(Car car) {
		
		System.out.println("car is repaired");
		
	}
	
	public static void main(String[] args) {

		Nano nano = new Nano();
		Audi audi = new Audi();
		
	    repairCar(nano);
	    repairCar(audi);
		
	}

}
