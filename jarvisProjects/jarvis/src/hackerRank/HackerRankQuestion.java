package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class HackerRankQuestion {


//        
//        int sum1 = 0;
//        int sum2 = 0;
//        int sum3 = 0;
//        int sum4 = 0;
//        int sum5 = 0;
        


//        int a[] = new int[3];
//        int b[] = new int[3]; 
//        int sum1 = 0;
//    	int sum2 = 0;
//    	
//        
//        for(int i = 0 ; i < 3 ; i++) {
//        		
//        	a[i] = sc.nextInt();
//        	
//        }
//        	
//        for(int i = 0 ; i < 3 ; i++) {
//            		
//            b[i] = sc.nextInt();
//            	
//        }
        	
//        for(int i = 0 ; i < 3 ; i++) {
//        	
//        	
//        	 	
//        if(a[i] > b[i]) {
//        		
//        	sum1 =  sum1 + 1;
//        	
//        	
//        	
//        }else if(b[i] > a[i]) {
//        		
//        	sum2 = sum2 + 1;
//        	
//        	
//        	
//        }else {
//        		
//        }  
//        
//        if(i == 2) {
//        	
//        	System.out.println(sum1 + " " +sum2);
//        	
//        }
//        
//        }
        

        
//        for(int i = 0 ; i  < 5 ; i ++) {
//
//            if(i == 0) {
//            	
//            	sum1 = sum1 + a[1] + a[2] + a[3] + a[4] ;
//            	
//            }
//            
//            if(i == 1) {
//            	
//        		sum2 = sum2 + a[0] + a[2] + a[3] + a[4] ;
//        	
//            }  
//            
//            if(i == 2) {
//            	
//        		sum3 = sum3 + a[1] + a[0] + a[3] + a[4] ;
//        	
//            }
//            
//            if(i == 3) {
//            	
//        		sum4 = sum4 + a[1] + a[2] + a[0] + a[4] ;
//        	
//            }
//            
//            if(i == 4) {
//            	
//        		sum5 = sum5 + a[1] + a[2] + a[3] + a[0] ;
//        	
//            }
//          
//        }
//        
//        max = (sum1 > sum2 && sum1 > sum3 && sum1 > sum4 && sum1 > sum5) ?  
//        		sum1 : (((sum2 > sum3 && sum2 > sum4 && sum2 > sum5) ?
//        		sum2 : ((sum3 > sum4 && sum3 > sum5) ?
//        		sum3 : (sum4 > sum5 ? sum4 : sum5))));		
//        
//        System.out.print(max + " ");
//        
//        min = (sum1 < sum2 && sum1 < sum3 && sum1 < sum4 && sum1 < sum5) ?  
//        		sum1 : (((sum2 < sum3 && sum2 < sum4 && sum2 < sum5) ?
//        		sum2 : ((sum3 < sum4 && sum3 < sum5) ?
//        		sum3 : (sum4 < sum5 ? sum4 : sum5))));		
//        
//        System.out.print(min);
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[5];
        
        for(int i = 0 ; i  < 5 ; i++) {
        	
        	a[i] = sc.nextInt();
        	
        }
        
        Arrays.sort(a);
        
        long max = 0 ;
        long min = 0;
        
        for(int i = 0 ; i < 4 ; i++) {
        	
        	min = min + a[i];
        	
        }
        
        for(int i = 1 ; i < 5 ; i++) {

        	max = max + a[i];
        	
	    }
        
        System.out.println(min + " " + max);
	}    
}
