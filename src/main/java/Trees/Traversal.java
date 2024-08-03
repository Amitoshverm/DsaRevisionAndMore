package Trees;

public class Traversal {
    public class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);

    }

}
