package methods;

public class PassByValue {

	public static void main(String[] args) {
		
//		int c = 23;
//		int d = 43;
//		
//		swap(c , d);
//		
//		System.out.println(c + " " + d);

		Dogs c = new Dogs(); 
		c.legs = 3;
		Dogs d = new Dogs(); 
		d.legs = 4;
		
		System.out.println(c.legs + " " + d.legs);
	}
	
	static void swap(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
		
	}
	
	static void swap(Dogs a, Dogs b) {
		
		Dogs temp = a;
		a = b ;
		b = temp;
		
	}

}

class Dogs{
	
	int legs;
	
}
