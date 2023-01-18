
import java.util.*;
import java.lang.*;

class Node{
    int data;
    Node next;
    Node(int key){
        data = key;
        next = null;
    }
}

class Main{
    static Node head;
    static Node temp;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            head = null;
            temp = null;
            addToTheLast(a1);
            
            for(int i = 1; i < n; i++){
                int data = sc.nextInt();
                addToTheLast(data);
            }
            Solution ans = new Solution();
            Node node = ans.rearrange(head);
            printList(node);
            System.out.println();
        }
    }
    
    public static void addToTheLast(int data){
        if(head == null){
			head = new Node(data);
			temp =head;
			return ;
		}
		else{
			Node new_node = new Node(data);
			temp.next = new_node;
			temp=temp.next;
			return;		
		}
    }
    
    public static void printList(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

class Solution{

	public static Node middle (Node head){
		Node slow = head;
		Node fast = head;

		while(fast != null && fast.next != null){
         slow = slow.next;
		 fast = fast.next.next;
		}

		return slow;
	}

	public static Node reverse (Node head){
		Node curr = head;
		Node prev = null;

		while(curr != null){
            Node nextOfCurr = curr.next;

			curr.next = prev;

			prev = curr;
			curr = nextOfCurr;
		}
		return prev;
	}

	public static Node merge (Node head1, Node head2){
		Node dummy = new Node(-1);
		Node curr = dummy;

		Node p1 = head1;
		Node p2 = head2;

		while(p1!= null && p2!= null){
			Node np1 = p1.next;
			p1.next = null;
			Node np2 = p2.next;
			p2.next = null;


			// Add p1
			curr.next = p1;
			p1 = np1;
			curr = curr.next;

			// then add p2
			curr.next = p2;
			p2 = np2;
			curr = curr.next;
		}
		if(p1== null){
			curr.next = p2;
		}

		if(p2== null){
			curr.next = p1;
		}

		return dummy.next;
		}
	
    public static Node rearrange(Node node){
       //Write code here

		// Find mid
		Node mid = middle(node);

	   //	Break into two part
       Node head2 = mid.next;
       mid.next = null;

       // reverse the second linklist
        head2 = reverse(head2);

		 // merge two linklist
        node = merge(node, head2);

       return node;
    }
}

