package NodeZeug;

public class Node {
    int value;
    Node next;
    Node head;

    public Node(int value) {
        this.value = value;
    }


    public void add(int node) {
        Node n = this.head;
        while (n.next != null) {
            n = n.next;
        }
            Node newNode = new Node(node);
            n.next = newNode;
    }
    public void get(int index) {
        Node n = this.head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        System.out.println(n.value);
    }







    public static void main(String[] args) {


    }
}
