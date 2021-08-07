package FirstUnit;

import java.util.*;

public class BasicInJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int i;
		double mark_avg;
		int result;
		int arr[] = new int[s];
		for(i = 0 ; i < s ; i++) {
			arr[i] = sc.nextInt(); 
		}
		result = arr[0];
		mark_avg = (double) arr[0];
	    for(i = 1 ; i < s ; i++){
	       if(result < arr[i]){
	         result = arr[i];
	       }
	       mark_avg += (double) arr[i];
	    }
	    System.out.println(result);
	    System.out.print(mark_avg/s);
	}
}
