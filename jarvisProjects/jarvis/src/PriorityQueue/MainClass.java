package PriorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("jatin");
		pq.add("jayesh");
		pq.add("bhavesh");
		pq.add("sumit");
		pq.add("anuj");
		pq.add("dhruv");
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
	}

}
