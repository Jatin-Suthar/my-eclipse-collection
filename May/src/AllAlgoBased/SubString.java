package AllAlgoBased;

public class SubString {
	public static void main(String[] args) {
		String a = "ABC";
		String b = "DVD";
		String c = "ADVDBC";
		if(a.length() == 0 && b.length() == 0 && c.length() != 0) {
			System.out.println("FOUND");
		}
		if(sub(a, b, c) == 0) {
			System.out.println("NOT FOUND....");
		}else {
			System.out.println("FOUND....");
		}
	}
	public static int sub(String a, String b, String c) {
		if(a.length() == 0 && b.length() == 0 && c.length() == 0) {
			return 1;
		}
		if(c.length() == 0) {
			return 0;
		}
		if(a.length() != 0 && a.charAt(0) == c.charAt(0)) {
			return sub(a.substring(1), b, c.substring(1));
		}
		if(b.length() != 0 && b.charAt(0) == c.charAt(0)) {
			return sub(a, b.substring(1), c.substring(1));
		}
		return 0;
	}
}
