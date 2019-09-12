import java.util.EmptyStackException;

public class FixedMultiStack {
    private int numOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    //constructor
    public FixedMultiStack(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize * numOfStacks];
        sizes = new int[numOfStacks];
    }
    //if size of specified stackNum is 0 then the stack is empty.
    public boolean  isEmpty(int stackNum){
        return (sizes[stackNum] == 0);
    }

    public boolean isFull(int stackNum){
        return (sizes[stackNum] == stackCapacity);
    }

    public void push(int stackNum, int value){
        //we should check that we have space for a new element
        if(isFull(stackNum)){
            throw new StackOverflowError();
        }

        //increment the stack pointer and then update the top value
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    public int pop(int stackNum){
        //first we should check if the stack is empty
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }

        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex]; // get the top
        values[topIndex] = 0; //clear
        sizes[topIndex]--; //reduce stack size
        return value;
    }

    public int peek(int stackNum){
        if (isEmpty(stackNum)){
            throw new EmptyStackException();
        }
        return values[indexOfTop(stackNum)]; // we want the value of the top index of the stack
    }

    private int indexOfTop(int stackNum){
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }
}
