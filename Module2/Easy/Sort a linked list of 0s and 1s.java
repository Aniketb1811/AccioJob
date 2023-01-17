import java.util.*;

class Solution {
    static LinkedListNode<Integer> sort01(LinkedListNode<Integer> head){
        if ((head == null) || (head.next == null)) {
         return head;
      }
      int count0 = 0, count1 = 0;
      LinkedListNode<Integer> temp = head;
      while (temp != null) {  
         if (temp.data == 0) {  
         count0++;
         }   
         else {
         count1++;
         }   
         temp = temp.next;
      }
      temp = head;
      while (count0>0) {
         temp.data = 0;
         temp = temp.next;
         count0--;
      }
      while (count1>0) {
         temp.data = 1;
         temp = temp.next;
         count1--;
      }
      return head;
    }
}

class LinkedListNode<T>  {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data)  {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNode<Integer> head = new LinkedListNode<Integer>(sc.nextInt());
        LinkedListNode<Integer> a = head;
        for(int i=1;i<n;i++) {
            LinkedListNode<Integer> temp = new LinkedListNode<Integer>(sc.nextInt());
            a.next = temp;
            a = temp;
        }
        LinkedListNode<Integer> ans = Solution.sort01(head);
        for(int i=0;i<n;i++) {
            if(i == n-1) {
                System.out.println(ans.data);
            }
            else {
                System.out.print(ans.data + " ");
            }
            ans = ans.next;
        }
    }
}
