package NodeZeug;

public class Stack <T> {
    Node head = null;
    Node next;

    static class Node {

        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public Stack<T> push(Stack<T> stack, int data){

        Node node = new Node(data);
        stack.head.next = node;

        return stack;
    }

    public Stack<T> pop(Stack<T> stack) {


        stack.head.next = stack.head.next.next;


        return stack;
    }
    public Stack<T> peak(Stack<T> stack) {

        Node CurrentNode = stack.head.next;
        System.out.println(CurrentNode);

        return stack;
    }
    public void main(String[] args) {

        Stack<T> stack = new Stack<T>();

        stack = push(stack, 3);
        peak(stack);    

    }
}
