package setsDataStructure;

import java.util.*;

public class SetsInterface {

	public static void main(String[] args) {

		Set<Integer> a = new HashSet<>();
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		Set<Integer> b = new HashSet<>();
		b.add(2);
		
		System.out.println(a.containsAll(b));
		
	}

}
