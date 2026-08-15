/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currNode = head ; 
        int size = 0 ;
        while (currNode != null){ 
            currNode = currNode.next ; 
            size ++ ; 
        }

        currNode = head;

        if (size == 0 || head == null ){ 
            System.out.println("Linked list is empty") ; 
            return head; 
        }

        if (size == n ){ 
            head = head.next ; 
            return head  ; 
        }

        int idx = size - n ; 
        for (int i = 1 ; i < idx; i++ ){ 
                currNode = currNode.next ; 
        }
        currNode.next = currNode.next.next ; 
        return head ; 
    }
}
