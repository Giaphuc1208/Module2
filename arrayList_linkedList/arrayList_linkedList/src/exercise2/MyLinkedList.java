package exercise2;

import org.w3c.dom.Node;



public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public void LinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Error Index = " + index + " , size = " + numNodes);
        } else {
            Node temp = head;
            int count = 0;
            while (count < index - 1) {
                temp = temp.next;
                count++;
            }
            Node holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node holder = new Node(element);
        temp.next = holder;
        numNodes++;

    }
}