package AllAlgoBased;

public class FamousCoinTrackProblem {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {3,4,5,1,2};
		int result = getTour(a,b,5);
		if(result == 1) {
			System.out.println("Path exist....");
		}else {
			System.out.println("No path exist....");
		}
	}

	static int getTour(int[] a, int[] b, int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		int start = 0;
		int diff = 0;
		for(int i = 0 ; i < n ; i++) {
			sum = sum + a[i]-b[i];
			if(sum < 0) {
				start = i+1;
				diff += sum;
				sum = 0;
			}
		}
		
		if(sum + diff >= 0) {
			return 1;
		} else {
			return -1;
		}
	}
}	
