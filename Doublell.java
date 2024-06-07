import java.util.*;

public class Doublell {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    // Addition to the double linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Printing the double linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Removing the node from first
    public int removeFirst() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        size--;
        if (head == tail) { // only one element in the list
            int value = head.data;
            head = tail = null;
            return value;
        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        return value;
    }

    public static void main(String args[]) {
        System.out.println("hello world!");
        Doublell dll = new Doublell();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println("Size: " + dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println("Size: " + dll.size);
    }
}
