public class DoublyLinkedList {
    
    private Node head;
    private Node tail;
    
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    public String traversal() {
        Node current_node = head;
        String result = "[";
        boolean first = true;
        while (current_node != null) {
            result += (!first ? ", " : "") + current_node.data;
            current_node = current_node.next;
            first = false;
        }
        result += "]";
        return result;
    }

    public void insert(Object value) {
        Node new_node = new Node(value);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            new_node.previous = tail;
            tail = new_node;
        }
    }
    
    // no. 1) Method insert at specific position
    public void insert(int position, Object value) {
        Node new_node = new Node(value);
        
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else if (position == 0) {
            new_node.next = head;
            head.previous = new_node;
            head = new_node;
        } else {
            Node current_node = head;
            int current_position = 0;
            while (current_node != null && current_position < position - 1) {
                current_node = current_node.next;
                current_position++;
            }
            if (current_node != null) {
                new_node.previous = current_node;
                new_node.next = current_node.next;
                if (current_node.next != null) {
                    current_node.next.previous = new_node;
                } else {
                    tail = new_node; // ถ้าต่อท้ายสุด ให้ update tail
                }
                current_node.next = new_node;
            }
        }
    }

    // no. 3.1) Method remove last node
    public void remove() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                tail = tail.previous;
                tail.next = null;
            }
        }
    }
    
    // no. 3.2) Method remove at specific position
    public void remove(int position) {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else if (position == 0) {
                // Delete at the beginning
                head = head.next;
                head.previous = null;
            } else {
                // Delete at specific position
                Node current_node = head;
                int current_position = 0;
                while (current_node != null && current_position < position) {
                    current_node = current_node.next;
                    current_position++;
                }
                if (current_node != null) {
                    if (current_node.next != null) {
                        current_node.next.previous = current_node.previous;
                    } else {
                        tail = current_node.previous; // ถ้าเป็นตัวสุดท้าย
                    }
                    if (current_node.previous != null) {
                        current_node.previous.next = current_node.next;
                    }
                }
            }
        }
    }

    // no. 5.1) Backward Traversal (จากท้ายมาหน้า)
    public String backwardTraversal() {
        Node current_node = tail;
        String result = "[";
        boolean first = true;
        while (current_node != null) {
            result += (!first ? ", " : "") + current_node.data;
            current_node = current_node.previous;
            first = false;
        }
        result += "]";
        return result;
    }
}
