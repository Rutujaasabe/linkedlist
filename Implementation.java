package linkedList;

public class Implementation {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {

        Node head = null;
        Node tail = null;

        void inserAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtBegin(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
                // inserAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtIndex(int index, int val) {
            Node temp = head;
            Node new_Node = new Node(val);
            if (index == size()) // if index is greater than tal i.e 5
            {
                inserAtEnd(val);
                return;
            } else if (index == 0) {
                insertAtBegin(val);
                return;
            } else if (index < 0 || index > size()) {
                System.out.println("Wrong index");
                return;
            }
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            new_Node.next = temp.next;
            temp.next = new_Node;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int getAt(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String ar[]) {
        linkedlist ll = new linkedlist();
        ll.insertAtBegin(13);
        ll.inserAtEnd(4);
        ll.inserAtEnd(5);
        ll.inserAtEnd(9);
        ll.inserAtEnd(12);
        // ll.insertAtIndex(2, 90);
        ll.display();
        System.out.println();
        System.out.println(ll.getAt(0));
        // System.out.println("Head is " + ll.head.data);
        // System.out.println("Tail is " + ll.tail.data);
        System.out.println("Size of given Linkedlist is " + ll.size());

    }
}
