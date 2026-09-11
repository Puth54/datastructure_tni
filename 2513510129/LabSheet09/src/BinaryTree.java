public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return this.root;
    }

    // เพิ่ม Node เข้าใน Binary Search Tree
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        while (true) {
            if (data < current.data) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                }
                current = current.left;
            } else if (data > current.data) {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right;
            } else {
                break; // กรณีข้อมูลซ้ำ
            }
        }
    }

    // สร้าง Tree รูปแบบต่างๆ
    public void createTree4() {
        root = null;
        int[] data = {10, 8, 15, 2, 9, 18, 14, 20, 11, 17};
        for (int val : data) {
            insert(val);
        }
    }

    public void createTree5() {
        root = null;
        int[] data = {50, 30, 70, 10, 40, 60, 20, 45, 55, 65, 25};
        for (int val : data) {
            insert(val);
        }
    }

    public void createTree6() {
        root = null;
        int[] data = {40, 20, 70, 30, 55, 85, 25, 35, 80, 32};
        for (int val : data) {
            insert(val);
        }
    }

    // การค้นหา Node
    public Node search(int key) {
        Node current = root;
        while (current != null) {
            if (key == current.data) {
                return current;
            } else if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    public void delete(int key) {
        root = deleteNode(root, key);
    }

    private Node deleteNode(Node current, int key) {
        if (current == null) {
            return null;
        }

        if (key < current.data) {
            current.left = deleteNode(current.left, key);
        } else if (key > current.data) {
            current.right = deleteNode(current.right, key);
        } else {
            if (current.left == null && current.right == null) {
                return null;
            }
            else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } 
            else {
                Node successor = getSuccessor(current.right);
                current.data = successor.data;
                current.right = deleteNode(current.right, successor.data);
            }
        }
        return current;
    }

    private Node getSuccessor(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void printTree() {
        printTree(root, 0);
    }

    public void printTree(Node node, int depth) {
        if (node == null) return;
        printTree(node.right, depth + 1);
        System.out.println("    ".repeat(depth) + node.data);
        printTree(node.left, depth + 1);
    }
}