package hello;

import java.util.*;
public class MapDsaDetails {
	public static void main(String[] args) {
		Map<String , Integer> hm = new HashMap<String , Integer>();
		hm.put("jatin suthar" , 591);
		hm.put("piyush kedia", 627);
		hm.put("pulastya sharma", 401);
		hm.replace("pulastya sharma", 402);
		System.out.println(hm.containsKey("manthan pareek"));
		System.out.println(hm.get("jatin suthar"));
		System.out.println("friends are : " + hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		for(Map.Entry<String , Integer> friends : hm.entrySet()) {
			String s = friends.getKey();
			int i = friends.getValue();
			System.out.println(s + " : " + i);
		}
		hm.remove("jatin suthar");
		System.out.println("after removing" + hm);
	}
}
//The Map interface present in java.util package represents a mapping 
//between a key and a value. The Map interface is not a subtype of the 
//Collection interface. Therefore it behaves a bit differently from 
//the rest of the collection types. A map contains unique keys.