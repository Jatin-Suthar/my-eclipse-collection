package AllAlgoBased;

public class Power {
	public static int powerOf(int a , int x) {
		if(x == 0) {
			return 1;
		}
		if(x % 2 != 0) {
			return 2*powerOf(a, x/2)*powerOf(a, x/2);
		}else {
			return powerOf(a, x/2)*powerOf(a, x/2);
		}
	}
	public static int pow(int a , int x) {
		int power = 1;
		while(x != 0) {
			if(x % 2 != 0) {
				power = power*a;
			}
			x = x/2;
			a = a*a;
		}
		return power;
	} 
	public static void main(String[] args) {
		int a = 2;
		int x = 10;
		System.out.println(powerOf(a,x));
		System.out.println(pow(a,x));
	}
}
