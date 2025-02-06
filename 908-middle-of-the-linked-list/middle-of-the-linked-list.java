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
    public int getLength(ListNode head) {
        ListNode temp = head;
        int counter = 0;
        while(temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public ListNode middleNode(ListNode head) {
        int size = getLength(head);
        int mid = size / 2;
        ListNode temp = head;

        for(int i = 1; i<=mid; i++) {
            temp = temp.next;
        }
        return temp;

    }
}