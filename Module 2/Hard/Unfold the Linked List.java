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
	static Node reverse(Node head){
		Node prev = null, cur = head, next;
		while(cur != null){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}
    static void unfold(Node head)
    {
     // Your code here
		Node temp = head;
		Node dummy1 = new Node(0); 
		Node dummy2 = new Node(0); 
		Node t1 = dummy1;
		Node t2 = dummy2;
		int index = 1;
		while(temp != null){
			if(index % 2 ==1){
				t1.next = temp;
				t1 = t1.next;
				index++;
			}
			else{
				t2.next = temp;
				t2= t2.next;
				index++;
			}
			temp = temp.next;
		}
		t2.next = null;
		t2 = dummy2.next;
		dummy2 = reverse(t2);
		t1.next = dummy2;
		temp = dummy1.next;
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
