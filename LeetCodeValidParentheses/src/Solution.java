import java.util.HashMap;
import java.util.Stack;

public class Solution {

    //Hash table that will take care of the mappings.
    private HashMap<Character, Character> mappings;

    //Initialize hash map with mappings which will make the code easier to read.
    public Solution(){
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }
    public boolean isValid(String s) {
        //1. Initialize a stack S
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++){
            //2. Process each bracket of the expression one at a time.
            char c = s.charAt(i);

            //if the current character is a closing bracket.
            if (this.mappings.containsKey(c)){

                //get the top element of the stack. If the stack is empty, set a dummy val
                //of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                //if mapping for bracket doesn't match the stack's top element, return false.
                if (topElement != this.mappings.get(c)){
                    return false;
                }

            }
            else {
                //3. if we encounter an opening bracket, we simply push it onto the stack
                stack.push(c);
            }
        }

        //5. In the end, if we are left with a stack still having elements, then this implies
        //an invalid expression.
        return stack.isEmpty();
    }
    public static void main(String[] args) {

    }
}
