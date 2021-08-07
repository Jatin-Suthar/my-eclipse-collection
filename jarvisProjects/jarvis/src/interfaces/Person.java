package interfaces;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {
		
		Person obj = new Person();
		
		obj.study();
		obj.makeVideo();
		
	}

	@Override
	public void makeVideo(){

		System.out.println("he is making video");
		
	}

	@Override
	public void study(){
		
		System.out.println("he is studying");
		
	}

}
