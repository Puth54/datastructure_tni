public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null; // empty linked list
    }

    public String traversal() {
        Node current_node = head; // set current node starts at head
        String result = "[";
        boolean first_node = true;
        while (current_node != null) {
            result += (!first_node ? ", " : "") + current_node.data;
            current_node = current_node.next; // move to the next node
            first_node = false;
        }
        result += "]";
        return result;
    }

    public void insert(int position, Object value) {
        Node new_node = new Node(value);
        if (head == null) {
            head = new_node;
        } else if (position == 0) {
            new_node.next = head;
            head = new_node;
        } else {
            Node node = head;
            int curr_position = 0;

            while (node != null && curr_position < position - 1) {
                node = node.next;
                curr_position++;
            }
            if (node != null) {
                new_node.next = node.next;
                node.next = new_node;
            }
        }
    }

    public void insert(Object value) {
        Node new_node = new Node(value);
        if (head == null) {
            head = new_node;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new_node;
        }
    }

    public void remove(int position) {
        if (head == null) return;
        
        if (position == 0) {
            head = head.next;
        } else {
            Node node = head;
            int curr_position = 0;
            while (node.next != null && curr_position < position - 1) {
                node = node.next;
                curr_position++;
            }
            if (node.next != null) {
                node.next = node.next.next;
            }
        }
    }

    public void removeLastElement() {
        if (head == null) return;
        
        if (head.next == null) {
            head = null;
        } else {
            Node node = head;
            while (node.next.next != null) {
                node = node.next;
            }
            node.next = null;
        }
    }
    
    public int length() {
        int count = 0;
        Node node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
    
    public int length() {
    	return 0;
    }
    
    public Object get(int position) {
    	//update data in node at the position
    }
    
    public void clear() {
    	head = null;
    }
    
    
}


