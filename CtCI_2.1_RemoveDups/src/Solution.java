import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        //creating a LinkedList object
        LinkedList myList = new LinkedList();

        //insert data from 1 to 9
        myList = LinkedList.appendToTail(myList, 1);
        myList = LinkedList.appendToTail(myList, 2);
        myList = LinkedList.appendToTail(myList, 3);
        myList = LinkedList.appendToTail(myList, 4);
        myList = LinkedList.appendToTail(myList, 5);
        myList = LinkedList.appendToTail(myList, 6);
        myList = LinkedList.appendToTail(myList, 7);
        myList = LinkedList.appendToTail(myList, 8);
        myList = LinkedList.appendToTail(myList, 9);

        //duplicate data from 1 to 9
        myList = LinkedList.appendToTail(myList, 1);
        myList = LinkedList.appendToTail(myList, 2);
        myList = LinkedList.appendToTail(myList, 3);
        myList = LinkedList.appendToTail(myList, 4);
        myList = LinkedList.appendToTail(myList, 5);
        myList = LinkedList.appendToTail(myList, 6);
        myList = LinkedList.appendToTail(myList, 7);
        myList = LinkedList.appendToTail(myList, 8);
        myList = LinkedList.appendToTail(myList, 9);
        System.out.println("With Duplicates: ");
        myList.printList();
        myList.deleteDups();
        System.out.println("After Running Delete Duplicates Function: ");
        myList.printList();
        System.out.println();
        System.out.println("Printing from Nth to Last: ");
        myList.printNthFromLast(4);
    }
}
