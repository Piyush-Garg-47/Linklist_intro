
import java.util.*;

public class linklist {
    // Creating head and tail as static
    public static node head;
    public static node tail;
    public static int size;

    public static class node {
        // Data stored in node
        int data;
        // For storing reference
        node next;

        // Constructor call
        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Making a function that adds a node in front of head
    public void addFirst(int data) {
        // Creating a new data
        node newNode = new node(data);
        size++;
        // If in list there were no nodes, it means the list is null
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Link list with original head
        newNode.next = head;
        // Making it as a new head
        head = newNode;
    }

    // Function for adding new node in list
    public void addlist(int data) {
        node newNode = new node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            tail.next = null;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print the linked list
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Add the element in the middle
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        node newNode = new node(data);
        node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i=idx-1; temp ->previous 
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public static void main(String[] args) {
        linklist ll = new linklist();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addlist(3);
        ll.addlist(4);
        ll.add(2, 5);

        ll.print(); // Expected output: 2 1 5 3 4
    }
}
