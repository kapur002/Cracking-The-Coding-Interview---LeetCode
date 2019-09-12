import java.util.*;

public class Solution{
    public static void main(String[] args) {
        System.out.println("Hello World");

        StackMin myStack = new StackMin();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.min());
    }
}