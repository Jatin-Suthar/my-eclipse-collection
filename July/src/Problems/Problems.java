package Problems;

import java.util.*;
public class Problems {
	public static void main(String args[])
	  {
	    Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int a[][] = new int[m][n];
	    for(int i = 0 ; i < m ; i++){
	    	for(int j = 0 ; j < n ; j++){
	        	a[i][j] = sc.nextInt();
	        }
	    }
	    int row[] = new int[m];
	    int col[] = new int[n];
	    int sum1 = 0;
	    int sum2 = 0;
	    for(int i = 0 ; i < m ; i++){
	      	sum1 = 0;
	    	sum2 = 0;
	    	for(int j = 0 ; j < n ; j++){
	        	sum1 = sum1 + a[i][j];
	          	sum2 = sum2 + a[j][i];
	        }
	      	row[i] = sum1;
	      	col[i] = sum2;
	    }
	    int max = 0;
	    int indexr = 0;
	    int indexc = 0;
	    System.out.print("Sum of rows is ");
	    for(int i = 0 ; i < row.length ; i++) {
	    	System.out.print(row[i] + " ");
	    	if(max < row[i]) {
	    		max = row[i];
	    		indexr = i+1;
	    	}
	    }
	    System.out.println();
	    System.out.println("Row "+indexr+" has maximum sum");
	    System.out.print("Sum of columns is ");
	    max = 0;
	    for(int i = 0 ; i < col.length ; i++) {
	    	System.out.print(col[i] + " ");
	    	if(max < col[i]) {
	    		max = col[i];
	    		indexc = i+1;
	    	}
	    }
	    System.out.println();
	    System.out.print("Column "+indexc+" has maximum sum");
	  }
}
