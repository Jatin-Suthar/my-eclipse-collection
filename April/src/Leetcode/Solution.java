package Leetcode;

import java.util.*;
	
public class Solution {
    
    public static int specialArray(int[] nums, int max) {
        int x = 0;
        int count;
        for(int i = 1 ; i <= max ; i++){
            count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j] > i || nums[j] == i){
                    count++;
                }
            }
            if(count == i){
                x = i;
            }
        }
        if(x == 0) {
        	return -1;
        }
        return x;
    }
    public static void twoSum(int[] nums, int target) {
    	int b[] = new int[2];
    	int select;
    	boolean check = false;
    	int j = 0;
    	while(j != nums.length) {
    		select = nums[j];
    		for(int i = 0 ; i < nums.length - 1 ; i++) {
    			if(nums[j] + nums[i] == target && j != i) {
    				b[0] = j;
    				b[1] = i;
    				check = true;
    				break;
    			}
    		}
    		if(check) {
    			System.out.println(b[0] +  " " + b[1]);
    			break;
    		}
    		j++;
    	}
    }
    public static int reverse(int x) {
    	long k = x;
        boolean isNegtive = false;        
        if(k < 0){
            k = 0 - k;
            isNegtive = true;
        }

        long result = 0;
        while(k != 0){
            result *= 10;
            result += k % 10;
            k /= 10;
        }

        if(result > Integer.MAX_VALUE) return 0;
        return isNegtive  ? 0 - ((int)result) : (int)result; 
    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int nums[] = new int[n];
//        for(int i = 0 ; i < n ; i++){
//            nums[i] = sc.nextInt();
//        }
//        int target = sc.nextInt();
//        int max = nums[0];
//        for(int i = 1 ; i < n ; i++){
//            if(max < nums[i]){
//                max = nums[i];
//            }
//        }
//        System.out.println(specialArray(nums , max));
//        twoSum(nums , target);
    	System.out.println(reverse(123));
    }
}
