package NodeZeug;

public class Tree {
    Node head;
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int v) {
            value = v;
            left = null;
            right = null;
        }


    }
    public static Tree insert(Tree tree, int value) {
        Node newNode = new Node(value);
        newNode.left = null;
        newNode.right = null;

        if (tree.head == null) {
            tree.head = newNode;
        }
        if (tree.head.value < newNode.value) {
            Node last = tree.head;
            while (last.right != null && last.right.value < newNode.value) {
                last = last.right;
                if (last.right == null && last.right.value < newNode.value) {
                    last.right = newNode;
                }
                if (last.right.value > newNode.value) {
                    last = last.left;
                }
                if (last.left.value < newNode.value) {
                    last = last.right;
                }
                if (last.right == null && last.right.value < newNode.value) {
                    last.right = newNode;
                } else if (last.right.value > newNode.value) {
                    last = last.left;
                } else if (last.left.value < newNode.value) {
                    last = last.right;
                } else if (last.right == null && last.right.value < newNode.value) {
                    last.right = newNode;
                }
            }

        }
        if (tree.head.value > newNode.value){
            Node last = tree.head;
            while (last.left != null && last.left.value > newNode.value) {
                last = last.left;
                if (last.left == null && last.left.value > newNode.value) {
                    last.left = newNode;
                }
                if (last.left.value < newNode.value) {
                    last = last.right;
                }
                if (last.right.value > newNode.value) {
                    last = last.left;
                }
                if (last.left == null && last.left.value > newNode.value) {
                    last.left = newNode;
                } else if (last.left.value < newNode.value) {
                    last = last.right;
                } else if (last.right.value > newNode.value) {
                    last = last.left;
                } else if (last.left == null && last.left.value > newNode.value) {
                    last.left = newNode;
                }
            }
        }

        return tree;
    }
    public static Tree getValue(Tree tree, int value) {
        Node last = tree.head;
        while (last.value != value) {
            if (last.value < value) {
                last = last.right;
            }
            if (last.value > value) {
                last = last.left;
            }
        }
        System.out.println(last.value);
        return tree;
    }
    public static Tree delete(Tree tree, int value) {
        if(tree.head.value == value) {
            if (tree.head.left == null && tree.head.right == null) {
                tree.head = null;

            }
            if (tree.head.left != null && tree.head.right == null) {
                tree.head = tree.head.left;
            }
            if (tree.head.left == null && tree.head.right != null) {
                tree.head = tree.head.right;
            }
            if (tree.head.left != null && tree.head.right != null) {
                Node last = tree.head;
                last = last.left;
            while (last.right != null) {
                    last = last.right;

                }
            }

        }


        return tree;

    }
}
