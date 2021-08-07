package recursion;

public class AdvanceRecursion {

	public static void main(String[] args) {

		int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
					{1, 1, 1, 1, 1, 1, 0, 0},
					{1, 0, 0, 1, 1, 0, 1, 1},
					{1, 2, 2, 2, 2, 0, 1, 0},
					{1, 1, 1, 2, 2, 0, 1, 0},
					{1, 1, 1, 2, 2, 2, 2, 0},
					{1, 1, 1, 1, 1, 2, 1, 1},
					{1, 1, 1, 1, 1, 2, 2, 1},
					};
		
		floodfill(a , 3 , 3 , 8 , 2);
		printMatrix(a);
		
	}
	
	static void floodfill(int a[][] , int c , int r , int toFill , int prevFill ) {
		int rows = a.length;
		int col = a[0].length;
		
		if(r < 0 || r >= rows || c < 0 || c >= col) return;
		if(a[r][c] != prevFill) return;
		
		a[r][c] = toFill;
		floodfill(a , c , r - 1 , toFill , prevFill);
		floodfill(a , c - 1 , r , toFill , prevFill);
		floodfill(a , c + 1 , r , toFill , prevFill);
		floodfill(a , c , r + 1 , toFill , prevFill);	
	}
	
	static void printMatrix(int a[][]) {
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0 ; j < 8 ; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
