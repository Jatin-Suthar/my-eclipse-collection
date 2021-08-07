package intro;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JarvisProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h1 = 0, h2 = 0, h3 = 0, h4 = 0, h5 = 0, h6 = 0, h7 = 0, h8 = 0, h9 = 0, h10 = 0, h11 = 0, h12 = 0, h13 = 0, h14 = 0, h15 = 0, h16 = 0;

        int n = sc.nextInt();

        int a[][] = new int[6][6];

        for(int i = 0 ; i < 6 ; i++){

            for(int j = 0 ; j < 6 ; j++){

                a[i][j] = sc.nextInt();

            }

        }

        for(int i = 0 ; i < 6 ; i++){

            for(int j = 0 ; j < 6 ; j++){

                h1 = a[0][0] + a[0][1] + a[0][2] + a[1][1] + a[2][0] + a[2][1] + a[2][2]; 
                h2 = a[0][1] + a[0][2] + a[0][3] + a[1][2] + a[2][1] + a[2][2] + a[2][3];  
                h3 = a[0][2] + a[0][3] + a[0][4] + a[1][3] + a[2][2] + a[2][3] + a[2][4];
                h4 = a[0][3] + a[0][4] + a[0][5] + a[1][4] + a[2][3] + a[2][4] + a[2][5];
                h5 = a[1][0] + a[1][1] + a[1][2] + a[2][1] + a[3][0] + a[3][1] + a[3][2];
                h6 = a[1][1] + a[1][2] + a[1][3] + a[2][2] + a[3][1] + a[3][2] + a[3][3];    
                h7 = a[1][2] + a[1][3] + a[1][4] + a[2][3] + a[3][2] + a[3][3] + a[3][4];    
                h8 = a[1][3] + a[1][4] + a[1][5] + a[2][4] + a[3][3] + a[3][4] + a[3][5]; 
                h9 = a[2][0] + a[2][1] + a[2][2] + a[3][1] + a[4][0] + a[4][1] + a[4][2];    
                h10 = a[2][1] + a[2][2] + a[2][3] + a[3][2] + a[4][1] + a[4][2] + a[4][3];      
                h11 = a[2][2] + a[2][3] + a[2][4] + a[3][3] + a[4][2] + a[4][3] + a[4][4];    
                h12 = a[2][3] + a[2][4] + a[2][5] + a[3][4] + a[4][3] + a[4][4] + a[4][5];     
                h13 = a[3][0] + a[3][1] + a[3][2] + a[4][1] + a[5][0] + a[5][1] + a[5][2];   
                h14 = a[3][1] + a[3][2] + a[3][3] + a[4][2] + a[5][1] + a[5][2] + a[5][3];     
                h15 = a[3][2] + a[3][3] + a[3][4] + a[4][3] + a[5][2] + a[5][3] + a[5][4];   
                h16 = a[3][3] + a[3][4] + a[3][5] + a[4][4] + a[5][3] + a[5][4] + a[5][5]; 
            }

        }

        ArrayList<Integer> ll = new ArrayList<>();

        ll.add(h1);
        ll.add(h2);
        ll.add(h3);
        ll.add(h4);
        ll.add(h5);
        ll.add(h6);
        ll.add(h7);
        ll.add(h8);
        ll.add(h9);
        ll.add(h10);
        ll.add(h11);
        ll.add(h12);
        ll.add(h13);
        ll.add(h14);
        ll.add(h15);
        ll.add(h16);

        int max = Integer.MIN_VALUE;
        
        for(int k = 0 ; k < ll.size() ; k++) {
        	
        	if(ll.get(k) > max) {
        		
        		max = ll.get(k);
        		
        	}
        	
        }
        
        System.out.println(max);

    }
    
}
