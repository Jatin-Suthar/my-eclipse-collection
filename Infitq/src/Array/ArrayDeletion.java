package Array;

public class ArrayDeletion {
	public void delete(int arr[] , int posi) {
		for(int i = posi-1 ; i < arr.length - 1 ; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
	}
	public static void main(String[] args) {
		int a[] = new int[6];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		ArrayDeletion array = new ArrayDeletion();
		array.delete(a, 3);
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
	}
}
