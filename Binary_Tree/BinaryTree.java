
package Binary_Tree;
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Preorder traversal
    private void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void preorder() {
        preorderTraversal(root);
        System.out.println();
    }

    // Inorder traversal
    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public void inorder() {
        inorderTraversal(root);
        System.out.println();
    }

    // Postorder traversal
    private void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void postorder() {
        postorderTraversal(root);
        System.out.println();
    }
     public void insert(int value) {
        root = insertRec(root, value);
    }

    // Helper method to recursively insert a new element
    private Node insertRec(Node root, int value) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // Otherwise, recur down the tree
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }

        // Return the unchanged node
        return root;
    }


    public static void main(String[] args) {
        
         BinaryTree tree = new BinaryTree();
    tree.insert(1);
    tree.insert(2);
    tree.insert(3);
    tree.insert(4);
    tree.insert(5);

    System.out.println("Inorder traversal after insertion:");
    tree.inorder();
        
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//        System.out.println("Preorder traversal:");
//        tree.preorder();
//
//        System.out.println("Inorder traversal:");
//        tree.inorder();
//
//        System.out.println("Postorder traversal:");
//        tree.postorder();
    }
}
