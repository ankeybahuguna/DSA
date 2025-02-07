/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return null;
        if(head.next.next == null) return null;
        if(head.next.next == head) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                break;
            }
        }

        ListNode temp = head;
        while(slow != null && slow.next != null) {
            if(slow == temp) return slow;
            slow = slow.next;
            temp = temp.next; 
        }

        return null;
    }
}