import java.util.HashSet;

public class LinkedList {
    Node head; // head of list
    static int size = 0;
    /* Linked list Node*/
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) { data = d; }
    }

    static LinkedList appendToTail(LinkedList list, int data){
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        size++;
        // Return the list by head
        return list;
    }

    static Node partition(LinkedList list, int data){

        //Example:
        // Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
        // Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8

        Node beforeStart = null;
        Node afterStart = null;
        Node beforeEnd = null;
        Node afterEnd = null;

        Node node = list.head;

        //Now we will partition the list
        while(node != null){
            Node next = node.next;
            if (node.data < data){
                if(beforeStart == null){
                    beforeStart = node;
                    beforeEnd = beforeStart;
                }
                else {
                    beforeEnd.next  = node;
                    beforeEnd = node;
                }
            }
            else {
                if (afterStart == null){
                    afterStart = node;
                    afterEnd = afterStart;
                }
                else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }
        if (beforeStart == null){
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;

    }

    public void printList()
    {
        Node currNode = head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

}
