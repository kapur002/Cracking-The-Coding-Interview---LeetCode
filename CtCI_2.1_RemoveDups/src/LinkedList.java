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

    void deleteDups(){
        HashSet<Integer> dupMap = new HashSet<Integer>();
        Node previous = null;
        Node n = head;
        while (n != null){
            if(dupMap.contains(n.data)){
                previous.next = n.next;
            }else{
                dupMap.add(n.data);
                previous = n;
            }
            n = n.next;
        }
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

    void printNthFromLast(int n)
    {
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // check if value of n is not more than length of
        // the linked list
        if (len < n){
            return;
        }
        temp = head;

        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i <= len; i++){
            if (i < n){
                temp = temp.next;
                continue;
            }
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
