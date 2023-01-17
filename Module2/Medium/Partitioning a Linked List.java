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
    public void partition(Node head, int x) {
        // Your code here
		Node dummy = new Node(0);
		Node dummy1 = new Node(0);
		Node temp = head;
		Node t = dummy;
		Node t1 = dummy1;
		while(temp != null){
			if(temp.data < x){
				t.next = temp;
				t = t.next;
			}
			else{
				t1.next = temp;
				t1 = t1.next;
			}
			temp = temp.next;
		}
		t.next = dummy1.next;
		t1.next = null;

		temp = dummy.next;
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
        int x = sc.nextInt();
        Solution Ob = new Solution();
        Ob.partition(l1.head, x);
    }
}
