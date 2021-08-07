package stackDataStructure;

import java.util.*;
public class Queue {
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	public void enQueue(int x) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		
		s1.push(x);
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	public int deQueue() {
		if(s1.isEmpty()) {
			System.out.println("we cann't apply dequeue operation on empty queue!");
		}
		
		int x = s1.pop();
		return x;
	}
	public static void main(String[] args) {
		Queue q = new Queue();  
	    q.enQueue(1);  
	    q.enQueue(2);  
	    q.enQueue(3);  
	  
	    System.out.println(q.deQueue());  
	    System.out.println(q.deQueue()); 
	    System.out.println(q.deQueue()); 
	}
}
