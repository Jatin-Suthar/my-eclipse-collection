package Problems;

import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) 
			a[i] = sc.nextInt();
		
		quickSort(a, 0, n-1);
		
		for(int i = 0 ; i < n ; i++) 
			System.out.println(a[i]);
	}
	/*
	 void QuickSort(int *a,int low,int high)
{
	int i,j,pivot,temp;
	pivot=low;
	i=low;
	j=high;
	if(i<j)
	{
		while(i<=high && a[pivot]>=a[i])
		i++;
		while(j>=low && a[pivot]<a[j])
		--j;
		if(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		else
		{
			temp=a[j];
			a[j]=a[pivot];
			a[pivot]=temp;
			QuickSort(a,low,j-1);
			QuickSort(a,j+1,high);
		}
	}
}
int main()
{
	int a[]={9,-3,13,4,25,5,2,6,8,-6,1,12,16,9,-5};
	int n=sizeof(a)/sizeof(a[0]);
	
	QuickSort(a,0,n-1);
}
 
	 */
	public static void quickSort(int a[], int low, int high) {
		int i, j, pivot;
		i = low;
		pivot = low;
		j = high;
		int temp = 0;
		if(i < j) {
			while(i < j) {
				while(i <= high && a[pivot] >= a[i])
					i++;
				
				while(j >= low && a[pivot] < a[j])
					--j;
			
				if(i < j) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			temp = a[j];
			a[j] = a[pivot];
			a[pivot] = temp;
			quickSort(a, low, j-1);
			quickSort(a, j+1, high);	
		}
	}
}
