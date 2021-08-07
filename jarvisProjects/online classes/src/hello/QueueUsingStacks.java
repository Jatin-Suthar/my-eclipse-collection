package hello;

import java.util.*;
public class QueueUsingStacks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		while(t-- != 0) {
			int a = sc.nextInt();
			switch(a) {
			case 1 :
				int s = sc.nextInt();
				q.add(s);
				break;
			case 2 : 
				q.remove();
				break;
			case 3 : 
				int num = q.peek();
				System.out.println(num);
				break;
			default : break;	
			}
		}
	}
}
