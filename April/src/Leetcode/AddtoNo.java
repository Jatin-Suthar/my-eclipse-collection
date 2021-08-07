package Leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class AddtoNo {
	class ListNode {
		int val;
		ListNode next;
		public ListNode() {
			
		}
		public ListNode(int val) {
			this.val = val;
			next = null;
		}
	}
	ListNode head;
	
	public void push(int val) {
		ListNode newnode = new ListNode(val);
		newnode.next = head;
		head = newnode;
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode list1 = l1;
        ListNode list2 = l2;
        int length1 = 0, length2 = 0;
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        while(list1 != null){
            al1.add(list1.val);
            list1 = list1.next;
            length1++;
        }
        while(list2 != null){
            al2.add(list2.val);
            list2 = list2.next;
            length2++;
        }
        
        String arr1[] = new String[al1.size()];
        String arr2[] = new String[al2.size()];
        int i = 0, j = 0;
        while(!al1.isEmpty()){
            arr1[i] = Integer.toString(al1.remove(al1.size()-1));
            i++;
        }
        while(!al2.isEmpty()){
            arr2[j] = Integer.toString(al2.remove(al2.size()-1));
            j++;
        }
        i = 0;
        j = 0;
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(i = 0 ; i < arr1.length ; i++){
            sb1.append(arr1[i]);
        }
        for(i = 0 ; i < arr2.length ; i++){
            sb2.append(arr2[i]);
        }
        String main1 = sb1.toString();
        String main2 = sb2.toString();
        int num1 = Integer.valueOf(main1);
        int num2 = Integer.valueOf(main2);
        int resultSum = num1 + num2;
        String resultString = Integer.toString(resultSum);
        ArrayList<Integer> s1 = new ArrayList<>();
        for(i = resultString.length()-1 ; i >= 0 ; i--){
            s1.add(Character.getNumericValue(resultString.charAt(i)));
        }
        ListNode head = new ListNode();
        ListNode curr = head;
        int lengthList = s1.size();
        if(length1 >= length2){
            ListNode result = l1;   
            while(result != null){
                curr.next = new ListNode(s1.remove(0));
                curr = curr.next;
                result = result.next;
            }
            if(lengthList > length1){
                curr.next = new ListNode(s1.remove(0));
            }
        }else{
            ListNode result = l2;
            while(result != null){
                curr.next = new ListNode(s1.remove(0));
                curr = curr.next;
                result = result.next;
            }
            if(lengthList > length2){
                curr.next = new ListNode(s1.remove(0));
            }
        }
        	return head.next;
	}
	public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp1 = l1, temp2 = l2, curr = head;
        int carry = 0;
        
        
        while(temp1 != null || temp2 != null){
            int x = (temp1!=null)?temp1.val:0;
            int y = (temp2!=null)?temp2.val:0;
            int sum = carry + x + y;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            
            if(temp1 != null)
                temp1 = temp1.next;
            if(temp2 != null)
                temp2 = temp2.next;
        }
        
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return head.next;
    }
	public void printlist(ListNode head) {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode();
        ListNode temp1 = l1, temp2 = l2;
        ListNode curr = head;
        //store the element of the linked list
        ArrayList<Integer> al = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        while(temp1 != null || temp2 != null){
            if(temp1 != null){
            	/*al.add(temp1.val);*/
                map.put(1, temp1.val);
                temp1 = temp1.next;
            }
            if(temp2 != null){
//                al.add(temp2.val);
                map.put(2, temp2.val);
                temp2 = temp2.next;
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	al.add(entry.getValue());
        }
        Collections.sort(al);

        if(!al.isEmpty()) {
        	Collections.sort(al);
            for(int i = 0 ; i < al.size() ; i++) {
            	curr.next = new ListNode(al.get(i));
            	curr = curr.next;
            }
        }
        return head.next;
    }
	public ListNode deleteDuplicates(ListNode head) {
        ListNode head1 = new ListNode();
        ListNode temp = head, curr = head1;
        if(temp == null) {
        	return head;
        }
        if(temp.next == null) {
        	return head;
        }
        Set<Integer> set = new HashSet<>();
        while(temp != null) {
        	set.add(temp.val);
        	temp = temp.next;
        }
        List<Integer> al = new ArrayList<>(set);
        Collections.sort(al);
        if(!al.isEmpty()) {
        	for(int i = 0 ; i < al.size() ; i++) {
        		curr.next = new ListNode(al.get(i));
        		curr = curr.next;
        	}
        }
		return head1.next;
    }
	 public ListNode reverseKGroup(ListNode head, int k) {
	        ListNode head1 = new ListNode();
	        ListNode temp  = head, curr = head1;
	        ListNode length = head;
	        if(head.next == null){
	            return head;
	        }
	        int size = 0;
	        while(length != null){
	            size++;
	            length = length.next;
	        }
	        Stack<Integer> stack = new Stack<>();
	        int x = 1; 
	        int y = 0;
	        if(k == size){
	            while(temp != null){
	                stack.push(temp.val);
	                temp = temp.next;
	            }
	            while(!stack.isEmpty()){
	                curr.next = new ListNode(stack.pop());
	                curr = curr.next;
	            }
	            return head1.next;
	        }
	        int z = size%k;
	        int i = 1;
	        while(temp != null){
	            if(i <= size - z){
	                if(x <= k){
	                    stack.push(temp.val);
	                    temp = temp.next;
	                }
	                x++;
	                if(x == k){
	                    x = 1;
	                    while(!stack.isEmpty()){
	                        curr.next = new ListNode(stack.pop());
	                        curr = curr.next;
	                    }
	                }
	            }else{
	                curr.next = new ListNode(temp.val);
	                curr = curr.next;
	                temp = temp.next;
	            }
	            i++;
	        }
	        return head1.next;
	    }
	public ListNode SortedMerge(ListNode A, ListNode B)
    {
     
        if(A == null) return B;
        if(B == null) return A;
         
        if(A.val < B.val)
        {
            A.next = SortedMerge(A.next, B);
            return A;
        }
        else
        {
            B.next = SortedMerge(A, B.next);
            return B;
        }
    }
	public static void main(String[] args) {
		AddtoNo ll1 = new AddtoNo();
		AddtoNo ll2 = new AddtoNo();
		AddtoNo list = new AddtoNo();
		ListNode result;
		ll1.push(1);
		ll1.push(1);
		ll1.push(1);
		ll2.push(9);
		ll2.push(9);
		ll2.push(9);
		ll2.push(9);
		//[9,9,9]
		result = list.SortedMerge(ll2.head, ll1.head);
		list.printlist(result);
	}
}
