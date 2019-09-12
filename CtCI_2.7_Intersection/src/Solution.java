import java.util.*;

public class Solution {

    //Creating a class called Node, this will be used to hold the value of the next Node and data value.
    public static class Node {
        Node next;
        int val;

        //Node constructor, takes in a parameter that will set the data value of the node.
        public Node(int val) {
            this.val = val;
        }
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node temp = this;
            while (temp != null) {
                sb.append(temp.val);
                sb.append(" ");
                temp = temp.next;
            }
            return sb.toString();
        }
    }

    public static Node intersection(Node a, Node b) {

        //declare avariables to hold the lengths of each LinkedList. We will increment alength & blength as we
        //traverse thru the linked list.
        int alength = 0;
        int blength = 0;

        //We are setting two linkedList objects equal to the ones that are passed in.
        Node ahead = a;
        Node bhead = b;

        //keep looping thru linkedList a to find the size
        while (a != null) {
            alength++;
            a = a.next;
        }

        //keep looping thru linkedList b to find the size
        while (b != null) {
            blength++;
            b = b.next;
        }

        //have two linkedList objects that represent the shorter and longer of the two linkedLists
        Node shorter;
        Node longer;

        //have a variable that will hold the difference of alength - blength or blength - alength (dpnds which is lrgr)
        int diff;

        //if ahead linkList is larger than bhead linkList, then alength will be greater than blength
        if (alength > blength) {
            longer = ahead; //in that case, we set ahead to be the longer linkedList
            shorter = bhead; //and make bhead be the shorter linkedlist
            diff = alength - blength; //we find the difference so we know how much to chop off later
        } else {
            longer = bhead; //bhead is the longer linkedlist
            shorter = ahead; //while ahead is the shorter linkedlist
            diff = blength - alength; //again, we find the difference so we know how much to chop off later
        }

        //chopping off the longer portion of the linkedlist until it matches the same size as the shorter linked list
        while (diff-- > 0){
            longer = longer.next;
        }

        // when the address of longer doesn't equal shorter, keep looping. When they equal, it means we found the
        //intersection point and we can return the longer (or shorter) node. It doesn't matter which one we
        //return at this point as they will both be at the same intersection point
        while (longer != shorter) {
            longer = longer.next;
            shorter = shorter.next;
        }

        return longer;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(1);
        Node c = new Node(5);
        Node d = new Node(9);
        Node e = new Node(7);
        Node f = new Node(2);
        Node g = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node h = new Node(4);
        Node i = new Node(6);
        h.next = i;
        i.next = e;

        Node x = intersection(a, h);
        System.out.println(x);
    }
}