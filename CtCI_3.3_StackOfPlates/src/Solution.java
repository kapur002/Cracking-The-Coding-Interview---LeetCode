import java.util.*;

public class Solution {

    //Creating a list of stacks. These stacks take in an Integer (non-prim) data type
    List<Stack<Integer>> listOfStacks = new ArrayList<Stack<Integer>>();

    //push method should function like regular stack push, so it takes in a data type of int, which will cast
    //upwards to integer type
    public void push(int v) {
        //getting the most recently used stack
        Stack<Integer> currentStack = getLastStack();
        //while we actually have a most recently used stack, we want to push an int data type onto that stack
        if (currentStack != null) {
            currentStack.push(v);
        } else { //if we don't have a most recently used stack, we should create a new stack and push data onto that.
            Stack stack = new Stack();
            stack.push(v);
            listOfStacks.add(stack); //once we've pushed data onto that stack, we should add it to our list of stacks.
        }
    }

    public int pop() throws EmptyStackException {
        Stack<Integer> currentStack = getLastStack(); //get the most recently used stack
        if (currentStack == null) //if the most recently used stack is null, then we want to throw an empty stack exception
            throw new EmptyStackException();
        int v = currentStack.pop(); //otherwise, lets get the top most element of that most recently used stack
        if (currentStack.size() == 0) //after getting that top most element, lets check the size of that stack
            listOfStacks.remove(listOfStacks.size() - 1); //if the stack size is 0, it's an empty stack...so remove it from
        //the list of the stacks.
        return v; //return the data element which you popped off the most recently used stack.
    }

    //getLastStack returns the most recently used stack
    public Stack<Integer> getLastStack() {
        int size = listOfStacks.size();
        if (size == 0) return null;
        return listOfStacks.get(size - 1);
    }

    public boolean isEmpty() {
        Stack last = getLastStack(); //get the most recently used stack from the list of stacks
        return last == null || last.isEmpty(); //if that most recently used stack is null, it means our list is empty
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}