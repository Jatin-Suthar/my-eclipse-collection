package hackerRank;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String time = sc.nextLine();
		
		String listTime[] = time.split(":");
		
		String h = listTime[0];
		
		String m = listTime[1];
		
		String s = listTime[2].substring(0,2);
		
		String caser = listTime[2].substring(2,4);
		
		if(caser.equals("AM")) {
			
			if(h.equals("12")) {
				
				h = "00";
				
				System.out.println(h+":"+m+":"+s);
				
			}else if(!h.equals("12")){
					
				System.out.println(h+":"+m+":"+s);	
				
			}
			
		}
		
		if(caser.equals("PM")) {
			
			if(h.equals("12")) {
				
				h = "12";
				
				System.out.println(h+":"+m+":"+s);
				
			}else {
				
				if(!h.equals("12")) {
					
					int d = Integer.parseInt(h);
					d = d + 12;
					h = "" +d;
					
				}
				
				System.out.println(h+":"+m+":"+s);	
				
			}
				
		}
	   
	}

}
