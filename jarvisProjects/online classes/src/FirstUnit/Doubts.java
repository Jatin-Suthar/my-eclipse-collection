package FirstUnit;

import java.util.*;
public class Doubts{
	public static void main(String[] args) throws NoSuchElementException {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(sc.hasNextInt()) {
			int t = sc.nextInt();
			n = t;
		for(int i = 0 ; i < n ; i++){
			int c = sc.nextInt();
			int d = sc.nextInt();
			int l = sc.nextInt();
			Stack<Integer> stack = new Stack<>();
			stack.push(4);
			if(l == (c*4) + (d*4)) {
				System.out.println("yes");
				continue;
			}
			if(c == 1 && d > 0) {
				if(l == (d*4)){
					System.out.println("yes");
					continue;
				}
			}
			if(c >= 2 && d > 0) {
				if(l == ((c-2)*4)+d*4) {
					System.out.println("yes");
				}
				if(l == ((c-1)*4)+(d*4)) {
					System.out.println("yes");
					continue;
				}
			}else {
				System.out.println("no");
				continue;
			}
		}
		}
	}
}