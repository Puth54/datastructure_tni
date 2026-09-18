public class BSTApp1 {

    public static BinarySearchTree sampleTree1() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(20);
        bst.root.left = new Node(10);
        bst.root.left.left = new Node(7);
        bst.root.left.left.left = new Node(3);
        bst.root.left.right = new Node(11);
        bst.root.right = new Node(60);
        bst.root.right.left = new Node(30);
        bst.root.right.left.right = new Node(40);
        bst.root.right.right = new Node(65);
        return bst;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = sampleTree1();

        bst.displayTree();
        System.out.println();

        // ข้อ 3
        Node minNode = bst.findMinimum();
        Node maxNode = bst.findMaximum();
        System.out.println("Minimum Node is " + (minNode != null ? minNode.data : "null"));
        System.out.println("Maximum Node is " + (maxNode != null ? maxNode.data : "null"));
        System.out.println();

        // ข้อ 5
        int target = 15;
        System.out.println("Is " + target + " in BST => " + bst.findSpecificData(target));
        System.out.println();

        // ข้อ 7
        int delNode = 60;
        bst.searchDeleteNode(delNode);
        if (bst.parent != null) {
            System.out.println("Parent is " + bst.parent.data);
        }
        if (bst.deleteNode != null) {
            System.out.println("Delete Node is " + bst.deleteNode.data);
        }

        // ข้อ 9
        bst.delete(delNode);
        bst.displayTree();
    }
}