// a. To write a java program that creates a string object and initializes it with your name and performs the following operations 
// i) To find the length of the string object using appropriate String method.
// ii) To find whether the character ‘a’ is present in the string. If yes find the number of times ‘a’ appear in the name and the location where it appears
package hello;

public class StringBaseQues {
	public static void main(String[] args) {
		String s = new String("jatin suthar");
		int count = 0;
		int location = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == 'a') {
				count += 1;
				location = i;
			}
		}
		if(count > 0) {
			System.out.println("a is present in the given string " + count + " times" + " and the location is " + location);
		}else {
			System.out.println("a is not present in the given string ");
		}
	}
}
