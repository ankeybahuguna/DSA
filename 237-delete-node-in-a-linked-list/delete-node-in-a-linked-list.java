class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public static ListNode deserialize(String data) {
        String[] values = data.replaceAll("[\\[\\] ]", "").split(",");
        if (values.length == 0) return null;

        ListNode head = new ListNode(Integer.parseInt(values[0]));
        ListNode current = head;
        
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(Integer.parseInt(values[i]));
            current = current.next;
        }
        
        return head;
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}