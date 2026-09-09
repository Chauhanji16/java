// it perfor push and poop operation 
// push for adding the element 
// pop for removing the element 
//  it work on LIFO(last in first out )
import java.util.Stack;
public class StackA {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        // See top element
        System.out.println("Top: " + stack.peek());
        // Remove top element
        System.out.println("Removed: " + stack.pop());
        // Print updated stack
        System.out.println(stack);
    }
}


