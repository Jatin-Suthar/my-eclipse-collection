package loopKeywords;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		
		
//		for(int i = 0; i < 100; i = i + 2){
//			
//			System.out.println("hello world " + i);
//			
//		}
		
//		int a = 0;
//		int n = 10;
//		
//		for(int i = 1; i <= n; i++) {
//		
//			a = a + i;
//			
//		}
//		System.out.println("sum is " + a);
	
//		for(int i = 100 ; i > 0 ; i--) {
//			
//			System.out.println(i);
//			
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//	    int r = 1 ;
//		
//	    
//	    
//		for(int i = a ; i >= 1; i--) {
//			
//			r = r * i ;
//					
//		}
//		System.out.println(r);
		
//		fibonacci numbers :: 0 1 1 2 3 5 8 13 21
	
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int n = sc.nextInt();
//		
//		int a = 0;
//		
//		int b = 1;
//		
//		
//		System.out.println(a + " ");
//		
//		System.out.println(b + " ");
//		
//		for(int i = 0 ; i < n-2 ; i++) {
//			
//			int r = a + b ;
//			
//			System.out.println(r);
//			
//			a = b ; 
//			b = r ; 
//			
//		}
//		
//		x raised to power y : x^2 = x*x 
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//		System.out.println("enter any no.");
//		
//		int b = sc.nextInt();
//		
//		int c = 1 ; 
//		
//		for(int i = 0 ; i < b ; i++) {
//			
//			c = c * a ; 
//					
//		}
//			
//		    System.out.println(c);	
		
//		prime or not : 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//		boolean isPrime = true;
//		
//		if(a == 1) isPrime = false;
//		
//		for(int i = 2 ; i < a ; i++) {
//			
//			if(a % i == 0) {
//				
//				isPrime = false;
//				break;
//			}
//		
//		}
//		
//		System.out.println("is prime " + isPrime);
		
//		(-:-) series programme 1 : 1 + 1/2 + 1/3 + 1/4 + 1/5 + .... + 1/n
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//		int b = 1; 
//		
//		float r = 0;
//		
//		for(float i = 1 ; i <= a ; i++) {
//			
//			 r = r + b/i ;
//			
//		}
//		
//		System.out.println(r);
		
//		(-:-)series programme 2 : 1 - 1/2 + 1/3 - 1/4 + 1/5 - ..... 1/n 
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//		int b = 1; 
//		
//		float r = 1;
//		
//		for(float i = 2 ; i <= a ; i += 2) {
//		
//			 r = r - b/i + b/(i+1);	 
//			 
//		}
//		
//		System.out.println(r);
		
//		               (-:-)write the tables of the given all no.  : 1 - 20 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//		
//        for(int i = 1 ; i <= a ; i++) {
//        		
//            for(int k = 1 ; k <= 1 ; k++) {
//            			
//            		int b = 1;
//            		
//            	for(int j = 1 ; j <= 10 ; j++) {
//            			
//            		System.out.print(b*i + "  ");
//            			
//            		b++;
//            	}
//            	
//              System.out.println();
//            	
//        	}
//        	
//        }

//                       (-:-)wap to draw shapes with for loop : 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//		for(int i = a ; i >= 1 ; i--) {
//				
//			for(int k = 1 ; k <= i ; k++) {
//					
//				    System.out.print(" * ");
//					
//			}
//			
//			System.out.println();
//			
//		}
//		                 (-:-) pattern 2 :         
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//		for(int i = a ; i >= 1 ; i--) {
//				
//			for(int k = i-1 ; k >= 1 ; k--) {
//					
//				    System.out.print("  ");
//					
//			}
//			
//			for(int j = 1 ; j <= a-i+1 ; j++) {
//				
//			    System.out.print("*   ");
//				
//		    }
//			
//			System.out.println();
//			
//		}     
		
//                        (-:-) pattern 3 :		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//		int b = 1; 
//		
//		for(int i = 1 ; i <= a ; i++) {
//				
//			for(int k = 1 ; k <= a-i ; k++) {
//					
//				    System.out.print("  ");
//					
//			}
//			
//			for(int j = 1 ; j <= i ; j++) {
//				
//				
//				System.out.print(b++ +"   ");
//			    
//		    }
//			
//			System.out.println();
//			
//		}  
		
//                      (-:-) pattern 4 #best example :	      *
//                                                          * *
//                                                        * * *
//                                                      * * * * 
//                                                        * * * 
//                                                          * * 
//                                                            *
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//		int rows = 2 * a - 1;
//		
//		for(int i = 1 ; i <= rows ; i++) {
//			
//			if(i <= a) {
//				
//				for(int k = 1 ; k <= rows - a - i + 1 ; k++) {
//					
//					System.out.print("  ");
//					
//				}
//			
//				for(int j = 1 ; j <= i ; j++) {
//				
//					System.out.print("* ");
//					
//				}
//				
//				System.out.println();
//				
//			}else {
//				
//				for(int k = 1 ; k <= i - a ; k++) {
//					
//					System.out.print("  ");
//					
//				}
//				
//				for(int j=1 ; j <= rows-i+1 ; j++) {
//					
//					System.out.print("* ");
//				}
//			
//				System.out.println();
//				
//			}
//			
//			System.out.println();
//			
//		}
		
//					(-:-) pattern 4 :		
	
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter any no.");
//		
//		int a = sc.nextInt();
//		
//		System.out.println("*");
//		
//			for(int i = 2 ; i <= a-1 ; i++) {
//				
//				System.out.print("*");
//				
//				for(int j = 1 ; j <= i-1 ; j++) {
//					
//					System.out.print("  ");
//					
//				}
//				
//				System.out.print("*");
//				
//				System.out.println();
//				
//			}
//			
//			for(int i = 1 ; i <= a ; i++) {
//				
//				System.out.print("* ");
//			}
//		System.out.println();
	}

}
