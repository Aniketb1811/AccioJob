
import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        for(int i = 0; i < m; i++){
            b.add(input.nextInt());
        }
        LinkedList ans = new LinkedList();
        Solution A = new Solution();
        ans.head = A.addTwoLinkedLists(a.head, b.head);
        ans.printList();

    }
}


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
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}


class Solution
{
	static Node reverse(Node head){
		Node prev = null, curr = head, next = head.next;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			 curr = next;
		}
		return prev;
	}

    public static Node addTwoLinkedLists(Node head1, Node head2)
    {
        //Write your code here
		if(head1 == null) return head2;
		if(head2 == null) return head1;
        Node t1 = reverse(head1);
        Node t2 = reverse(head2);
		Node dummy = new Node(0);
		Node temp = dummy;
		
		int sum = 0, carry = 0;

		while(t1 != null || t2 != null){
			sum = 0;
			if(t1 != null){
				sum += t1.data;
				t1 = t1.next;
			}
			if(t2 != null){
				sum += t2.data;
				t2 = t2.next;
			}
			sum += carry;
			carry = sum / 10;
			Node n = new Node(sum % 10);
			temp.next = n;
			temp = temp.next;
		}
		if(carry > 0){
			Node n = new Node(carry);
			temp.next = n;
		}
	    return reverse(dummy.next);
    }
}
