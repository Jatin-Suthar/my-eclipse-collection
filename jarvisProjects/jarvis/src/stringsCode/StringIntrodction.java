package stringsCode;

public class StringIntrodction {

	public static void main(String[] args) {
		
		String name = "jatin:anuj:jayesh:bhavesh:rakesh:dhruv";

//	    String name2 = new String("suthar");
		
		String allName[]  = name.split(":");
				
		for(String name2: allName) {
					
			System.out.println(name2);	
					
		}
		
	}

}
