package sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int a[] = {3,7,-1,-4,5,6};
        
		int n = a.length;
		
		for(int i = 0 ; i < n-1 ; i++) {
			
			for(int j = 0 ; j < n-1-i ; j++) {
				
				if(a[j+1] < a[j]) {
				
				int temp = a[j+1];
				
				a[j+1] = a[j];
				
				a[j] = temp;
				
				}
			}
			
		}
		
		for(int e: a) {
			
			System.out.print(e + " ");
			
		}
		
	}

}
