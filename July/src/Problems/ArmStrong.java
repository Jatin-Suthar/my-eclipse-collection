package Problems;

import java.util.*;

public class ArmStrong {
	public static void main(String args[])
	  {
		Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    String a[] = s.split("");
	    boolean check = checkIf(a, s);
	    if(check)
	      System.out.println("Kindly proceed with encrypting");
	    else
	      System.out.println("It is not an Armstrong number");
	  }
	  public static boolean checkIf(String a[], String s){
	  	boolean check = false;
	  	int sum = 0;
	  	for(int i = 0 ; i < a.length ; i++) {
	  		int n = (int) Math.pow(Integer.parseInt(a[i]), s.length());
	  		sum = sum + n;
	  	}
	  	if(sum == Integer.parseInt(s)) 
	  		check = true;
	  	else
	  		check = false;
	  	
	  	return check;
	  }
}
