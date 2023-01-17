import java.util.*;

class Node {
    int val;
    Node next;

    Node(int d) {
        val = d;
        next = null;
    }
}

class LinkedList {
    Node head, tail;

    void push(Node new_node) {
        if (head == null && tail == null) {
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Solution {
    public Node rearrangeList(Node head) {
        //Write code here
		Node dummyEven = new Node(0);
		Node dummyOdd = new Node(1);
		Node temp = head;
		Node t0 = dummyEven;
		Node t1 = dummyOdd;

		while(temp != null){
			if(temp.val % 2 == 0){
				t0.next = temp;
				t0 = t0.next;
			}
			else{
				t1.next = temp;
				t1 = t1.next;
			}
			temp = temp.next;
		}
		t0.next = dummyOdd.next;
		t1.next = null;

		return dummyEven.next;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist = new LinkedList();
        int h1 = sc.nextInt();
        Node head = new Node(h1);
        llist.push(head);
        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            llist.push(new Node(data));
        }
        // llist.printList(head);
        Solution Obj = new Solution();
        head = Obj.rearrangeList(head);
        llist.printList(head);
        sc.close();
    }
}
