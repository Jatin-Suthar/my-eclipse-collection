package mapDataStructure;

import java.util.*;
import java.util.Map.Entry;
public class HashMapIntro {

	public static void main(String[] args) {

		Map<String, Integer> numbers = new HashMap<>();
		
		System.out.println(getHash("CAT"));
 		
	}
	
	public static int getHash(String s) {
		
		int hash = 0;
		for(int i = 0 ;  i < s.length() ; i++) {
			
			hash += s.charAt(i); 
			
		}
		
		return hash;
		
	}

}
