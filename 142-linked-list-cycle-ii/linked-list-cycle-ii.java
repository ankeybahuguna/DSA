public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode fast=head;
        ListNode slow =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
               slow=head;
            
               while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
               }
               return slow;
            }
           
        }
        return null;
    }
}