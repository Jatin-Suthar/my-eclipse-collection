package IoStream;

import java.io.*;
import java.util.Scanner;

public class FirstIOclass {
	public static void main(String[] args) {
		int c=0;
        try{
           InputStreamReader r=new InputStreamReader(System.in);  
           BufferedReader br=new BufferedReader(r);  
           String s1 = br.readLine();
           for(int i = 0 ; i < s1.length() ; i++) {
        	   if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u' || s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O' || s1.charAt(i) == 'U') {
        		   c += 1;
        	   }
           }
           System.out.println(c); 
 	   }
        catch (Exception e){
 		 System.out.println(e);
 	    }
	}
}
