package hackerRank;

import java.util.Scanner;

public class GradingStudent {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0 ; i < n ; i++){

            a[i] = sc.nextInt();

        }
        
        for(int i = 0 ; i < n ; i++) {
        	
        	if(a[i] < 38) {
        	
        		System.out.println(a[i]);
        	
        	}else {
        		
            	if(((a[i]/5)+1)*5 - a[i] < 3) {
            		
            		a[i] = ((a[i]/5)+1)*5;
            		
            		System.out.println(a[i]);
            		
            	}else if(((a[i]/5)+1)*5 - a[i] == 3){
            		
            		System.out.println(a[i]);
            	
            	}else if(((a[i]/5)+1)*5 - a[i] > 3){
            		
            		System.out.println(a[i]);
            	
            	}
            	
        		
        	}
        	
        }
		
	}

}
