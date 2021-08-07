package algorithm;

import java.util.*;

public class SubsetApproach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int index = 0;
		String curr = "";
		Set<String> set = new HashSet<>();
		findAllSubset(s, index, curr, set);
		set.remove("");
		System.out.println(set);
	}

	public static void findAllSubset(String s, int index, String curr, Set<String> set) {
		int n = s.length();
		if(n == index){
			
			
			set.add(curr);
			return;
		}
		
		findAllSubset(s, index+1, curr + s.charAt(index), set);
		findAllSubset(s, index+1, curr, set);
	}
}
