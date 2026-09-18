public class BinarySearchTree {
    public Node root;
    public Node parent;
    public Node deleteNode;

    public BinarySearchTree() {
        this.root = null;
        this.parent = null;
        this.deleteNode = null;
    }

    // ข้อ 1
    public Node findMinimum() {
        if (root == null) return null;
        Node current_node = root;
        while (current_node.left != null) {
            current_node = current_node.left;
        }
        return current_node;
    }

    // ข้อ 2
    public Node findMaximum() {
        if (root == null) return null;
        Node current_node = root;
        while (current_node.right != null) {
            current_node = current_node.right;
        }
        return current_node;
    }

    // ข้อ 4
    public boolean findSpecificData(int target) {
        Node current = root;
        while (current != null) {
            if (target == current.data) {
                return true;
            } else if (target < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    // ข้อ 6
    public void searchDeleteNode(int target) {
        parent = root;
        Node current_node = root;
        deleteNode = null;

        while (current_node != null) {
            if (target == current_node.data) {
                deleteNode = current_node;
                break;
            }
            parent = current_node;
            if (target < current_node.data) {
                current_node = current_node.left;
            } else {
                current_node = current_node.right;
            }
        }
    }

    // ข้อ 8
    public void replaceMaxLeftSubtree(Node targetNode) {
        Node maxParent = targetNode;
        Node maxNode = targetNode.left;

        while (maxNode.right != null) {
            maxParent = maxNode;
            maxNode = maxNode.right;
        }

        targetNode.data = maxNode.data;

        if (maxParent.left == maxNode) {
            maxParent.left = maxNode.left;
        } else {
            maxParent.right = maxNode.left;
        }
    }

    // ข้อ 8
    public void replaceMinRightSubtree(Node targetNode) {
        Node minParent = targetNode;
        Node minNode = targetNode.right;

        while (minNode.left != null) {
            minParent = minNode;
            minNode = minNode.left;
        }

        targetNode.data = minNode.data;

        if (minParent.left == minNode) {
            minParent.left = minNode.right;
        } else {
            minParent.right = minNode.right;
        }
    }

    // ข้อ 8
    public void delete(int target) {
        searchDeleteNode(target);
        if (deleteNode == null) return;

        if (deleteNode.left == null && deleteNode.right == null) {
            if (deleteNode == root) {
                root = null;
            } else if (target < parent.data) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (deleteNode.left != null && deleteNode.right == null) {
            if (deleteNode == root) {
                root = deleteNode.left;
            } else if (target < parent.data) {
                parent.left = deleteNode.left;
            } else {
                parent.right = deleteNode.left;
            }
        } else if (deleteNode.left == null && deleteNode.right != null) {
            if (deleteNode == root) {
                root = deleteNode.right;
            } else if (target < parent.data) {
                parent.left = deleteNode.right;
            } else {
                parent.right = deleteNode.right;
            }
        } else {
            replaceMaxLeftSubtree(deleteNode);
        }
    }

    public void displayTree() {
        displayTreeRec(root, 0);
    }

    private void displayTreeRec(Node node, int level) {
        if (node != null) {
            displayTreeRec(node.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("     ");
            }
            System.out.println(node.data);
            displayTreeRec(node.left, level + 1);
        }
    }
}
