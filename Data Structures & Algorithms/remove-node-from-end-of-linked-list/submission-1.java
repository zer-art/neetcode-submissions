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
        // A dummy node helps handle edge cases (like removing the very first node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // 1. Give 'fast' a head start of n + 1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // 2. Move both until 'fast' hits the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // 3. 'slow' is now right before the node we want to remove
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}
