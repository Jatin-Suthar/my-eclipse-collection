package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
	
		int a = 14;
		int b = 4;
		int c = 12;
		int result = 0;
		
		if(a > b) {
			if(a > c){
				result = a;
			}else {
				result = c;
			}
		}else {
			if(b > c) {
				result = b;
			}else {
				result = c;
			}
		}
		
		System.out.println("largest of three no. is : " + result);
		
	}

}
