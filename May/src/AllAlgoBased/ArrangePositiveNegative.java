package AllAlgoBased;

public class ArrangePositiveNegative {
	public static void arrange(int a[], int n) {
		int i = 0, temp;
        for(int j = 0 ; j < n ; j++) {
        	if(a[j] < 0) {
        		temp = a[i];
        		a[i] = a[j];
        		a[j] = temp;
        		i++;
        	}
        }
        
        for(int j = 0 ; (i < n) && (j < i) ; i++, j+=2) {
        	temp = a[i];
        	a[i] = a[j];
        	a[j] = temp;
        }
	}
	public static void arrangePN(int a[], int n) {
		int temp;
		for(int i = 0 ; i < n ; i++) {
			if(a[i] >= 0) {
				for(int j = i ; j < n ; j++) {
					if(a[j] < 0) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[] = {-1,-20,8,-4,5,-6,7,-3,30,40};
		int n = a.length;
		arrange(a,n);
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
