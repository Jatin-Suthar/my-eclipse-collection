package recursion;

public class GameTheory {

	public static void main(String[] args) {

		int a[] = {1, 5, 7, 3, 2, 4};
		System.out.println(gameTheory(a , 0 , a.length - 1));
		
	}
	
	static int gameTheory(int a[] , int l , int r) {
		
		if(l+1 == r) {
			
			return Math.max(a[l], a[r]);
			
		}
		
		return Math.max(a[l] + Math.min(gameTheory(a , l + 2 , r), gameTheory(a , l + 1 , r - 1)) , 
				a[r] + Math.min(gameTheory(a , l + 1 , r - 1), gameTheory(a , l , r - 2)));
		
	}

}
