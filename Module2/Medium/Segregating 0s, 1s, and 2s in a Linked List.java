import java.io.*;
import java.util.*;
 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static void unfold(Node head)
    {
     // Your code here
		Node temp = head;
		Node dummy0 = new Node(0);
		Node dummy1 = new Node(0);
		Node dummy2 = new Node(0);
		Node t0 = dummy0; 
		Node t1 = dummy1; 
		Node t2 = dummy2; 

		while(temp != null){
			if(temp.data == 0){
				t0.next = temp;
				t0 = t0.next;
			}
			else if(temp.data == 1){
				t1.next = temp;
				t1 = t1.next;
			}
			else if(temp.data == 2){
				t2.next = temp;
				t2 = t2.next;
			}
			temp = temp.next;
		}
		head = dummy0.next;
		t0.next = dummy1.next;
		t1.next = dummy2.next;
		t2.next = null;

		temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
    }
}
public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}
