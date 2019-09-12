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

    boolean deleteNode(LinkedList list, int data){

        Node new_node2 = list.head;

        while (new_node2.data != data){
            new_node2 = new_node2.next;
        }
        //Create a new node with the given data
        Node new_node = new Node(data);
        if(new_node2 == null || new_node2.next == null){
            return false; //Failure to delete
        }
        Node next = new_node2.next;
        new_node2.data = next.data;
        new_node2.next = next.next;
        return true;
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
