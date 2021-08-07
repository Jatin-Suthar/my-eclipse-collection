package linkedListDataStructure;

import java.util.*;

public class MyLinkedlist {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void newNodeAtFirstPosi(int new_data) {
		Node n = new Node(new_data);
		
		n.next = head;
		head = n;
	}
	public void newNodeAtGivenPosi(Node previous_node , int new_data) {
		if(previous_node == null) {
			System.out.println("previous node should't be null");
		}
		
		Node n = new Node(new_data);
		n.next = previous_node.next;
		previous_node.next = n;	
	}
	public void newNodeAtEndPosi(int new_data) {
		Node n = new Node(new_data);
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		n.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = n;
	}
	public void deleteNodeAtGivenPosi(int given_key) {
		Node temp = head; Node prev_node = null;
		
		if(temp == null) {
			System.out.println("linked list is empty !");
			return;
		}
		
		if(temp != null && temp.data == given_key) {
			head = temp.next;
			return;
		}
		
		while(temp != null && temp.data != given_key) {
			prev_node = temp;
			temp = temp.next;
		}
		
		prev_node.next = temp.next;
	}
	public boolean search(Node head, int x) 
    { 
        Node current = head;    //Initialize current 
        while (current != null) 
        { 
            if (current.data == x) 
                return true;    //data found 
            current = current.next; 
        } 
        return false;    //data not found 
    }
	public int GetNth(int index) 
    { 
        Node current = head; 
        int count = 0; /* index of Node we are 
                          currently looking at */
        while (current != null) 
        { 
            if (count == index) 
                return current.data; 
            count++; 
            current = current.next; 
        } 
        /* if we get to this line, the caller was asking 
        for a non-existent element so we assert fail */
        assert (false); 
        return 0; 
    }
	Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
	void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	public static void main(String[] args) {
		MyLinkedlist ll = new MyLinkedlist();
		ll.head = new Node(1);
		Node SecondNode = new Node(2);
		Node ThirdNode = new Node(3);
		
		ll.head.next = SecondNode;
		SecondNode.next = ThirdNode;
		ll.newNodeAtFirstPosi(6);
		ll.newNodeAtGivenPosi(SecondNode , 8);
		ll.newNodeAtEndPosi(9);
		ll.deleteNodeAtGivenPosi(2);
		ll.printList(head);
		System.out.println();
		head = ll.reverse(ll.head);
		ll.printList(head);
		
	}
}

