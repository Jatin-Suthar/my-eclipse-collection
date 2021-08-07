package FirstUnit;

public class AbstractClass {
	public static void main(String[] args) {
		Practice abs = new Practice();
		abs.as();
	}
}

interface a{
	public abstract void print(int x);
	public abstract void push();
}
class Practice implements Main {
	public void as() {
		System.out.println("september");
	}
}
interface Main{
	public abstract void as();
}

class Solution implements a{
	public void print(int x) {
		
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}
}