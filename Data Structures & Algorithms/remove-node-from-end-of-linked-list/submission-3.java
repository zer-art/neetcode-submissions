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
        ListNode fast = head;
        ListNode slow = head;
        
        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        
        // Edge Case: If fast reached the end, it means we need to remove the very first node (head)
        if (fast == null) {
            return head.next;
        }
        
        // Move both pointers until fast reaches the LAST node (not null)
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // Skip the nth node
        slow.next = slow.next.next;
        
        return head;
    }
}
