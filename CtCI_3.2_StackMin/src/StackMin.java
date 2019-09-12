import java.util.*;

public class StackMin extends Stack<Integer> {
    Stack<Integer> s2;

    //constructor that creates a new integer stack when StackMin object is created
    public StackMin() {
        s2 = new Stack<Integer>();
    }

    //pushes a value onto the minimum stack if it is less than the existing minimum value
    public void push(int value) {
        if (value <= min()) {
            s2.push(value);
        }
        //pushes value onto original stack (which is why super keyword is used)
        super.push(value);
    }

    public Integer pop() {
        int value = super.pop(); //first getting the value from the original stack
        if (value == min()) {
            s2.pop(); //if the value from the original stack is the same as the value in minimum stack...we should
            //remove the minimum value from stack
        }
        return value; //return the value that was removed from the stack
    }

    //min function will check the minimum value of the stack - the minimum value should be the topmost value
    //of the min stack
    public int min() {
        if (s2.isEmpty()) {
            return Integer.MAX_VALUE; // is the stack is empty, return MAX_VALUE of Integer bc there is no value to rtrn
        } else {
            return s2.peek(); //otherwise, return the topmost value of the min stack
        }
    }
}