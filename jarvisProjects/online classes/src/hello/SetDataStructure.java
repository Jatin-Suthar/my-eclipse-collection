package hello;

import java.util.*;
public class SetDataStructure {
	public static void main(String[] args) {
		int arr1[] = {1, 3, 2, 4, 8, 9, 0};
		int arr2[] = {1, 3, 7, 5, 4, 0, 7};
		Set<Integer> a = new HashSet<Integer>();
		for(int i = 0 ; i < arr1.length ; i++) {
			a.add(arr1[i]);
		}
        Set<Integer> b = new HashSet<Integer>();  
		for(int i = 0 ; i < arr2.length ; i++) {
			b.add(arr2[i]);
		}
        
        //Union -:
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of both set is : ");
        System.out.println(union);
        
        //Intersections -:
        Set<Integer> inter = new HashSet<Integer>(a);
        inter.retainAll(b);
        System.out.println("Intersection of both set is : ");
        System.out.println(inter);
        
        //Difference -:
        Set<Integer> diff = new HashSet<Integer>(a);
        diff.removeAll(b);
        System.out.println("difference in both set is : ");
        System.out.println(diff);
    }
}
