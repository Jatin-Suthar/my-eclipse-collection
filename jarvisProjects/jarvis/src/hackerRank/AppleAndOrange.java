package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AppleAndOrange {
	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int s = sc.nextInt();
	        int t = sc.nextInt();
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int m = sc.nextInt();
	        int n = sc.nextInt();

	        int apple[] = new int[m];
	        int appleCount = 0;
	        for(int apple_i = 0 ; apple_i < m ; apple_i++){

	            apple[apple_i] = sc.nextInt();
	            if(a + apple[apple_i] >= s && a + apple[apple_i] <= t){

	                appleCount++;

	            }

	        }
	        int orange[] = new int[n];
	        int orangeCount = 0;
	        for(int orange_i = 0 ; orange_i < n ; orange_i++){

	            orange[orange_i] = sc.nextInt();
	            if(b + orange[orange_i] >= s && b + orange[orange_i] <= t){

	            	orangeCount++;

	            }
	        }

	        System.out.println(appleCount);
	        System.out.println(orangeCount);

	    }
}


