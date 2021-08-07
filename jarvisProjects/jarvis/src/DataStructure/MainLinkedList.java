package DataStructure;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {

		MyLinkedList ll = new MyLinkedList();
		
		for(int i = 0 ; i < 10 ; i++) {
			
			ll.add(i);
			
		}
		
		ll.print();
		
	}
}
