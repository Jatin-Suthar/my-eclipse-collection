package AllAlgoBased;

public class BinaryCodeProblem {
	public static void main(String[] args) {
		int n = 5;
	}
	public static int countBinary(int n, int last_digit) {
		
		if(n == 0) {
			return 0;
		}
		
		if(n ==1) {
			if(last_digit == 1) {
				return 1;
			}else {
				return 2;
			}
		}
		return n;
	}
}
