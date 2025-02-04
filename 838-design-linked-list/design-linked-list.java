class MyLinkedList {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
       Node temp = head;
       for(int i = 0; i< index; i++) {
            temp = temp.next;
       } 
       return temp.data;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if(head == null) {
            head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return; 
        Node temp = new Node(val);
        if (index == 0) {
            addAtHead(val); 
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
        if (temp.next == null) {
            tail = temp; 
        }
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return; 

        if (index == 0) {
            head = head.next; 
            if (head == null) {
                tail = null; 
            }
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next; 
            if (current.next == null) {
                tail = current; 
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */