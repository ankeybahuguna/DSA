
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, Next = null;
        while(curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
}