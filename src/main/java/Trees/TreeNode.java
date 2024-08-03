package Trees;

import java.util.Scanner;

public class TreeNode {

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    private Node root;


    //insert elements
    public void populate(Scanner scanner) {
        System.out.println("enter the root node value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("do you want to enter left of "+ node.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the value of the left "+ node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("do you want to enter right of "+ node.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("enter the value of the right "+ node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent+ node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        tree.populate(scanner);
        tree.display();

    }
}
