package LalitJhangid;

import java.util.*;

public class NextBigInCircular {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[2*n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			a[n+i] = a[i];
		}
		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 2*n-1 ; i >= 0 ; i--) {
			while(!s.empty() && a[i%n]>=s.peek())
                s.pop();
            if(i<n){
            	if(!s.empty())
            	{
            		al.add(i, s.peek());
            	}
            	else
            	{
            		al.add(i, -1);
            	}
            }
            s.push(a[i%n]);
		}
		for(int i = 0 ; i < al.size() ; i++) {
			System.out.print(al.get(i)+" ");
		}
	}
}
