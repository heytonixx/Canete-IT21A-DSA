package midterm;

import java.util.Stack;

public class STACK {
     public static void main(String[] args) {

        Stack<Integer> mystack = new Stack<>();
        
        // Push elements onto the stack
        mystack.push(66);
        mystack.push(67);
        mystack.push(68);
        mystack.push(69);
        mystack.push(70);

        System.out.println("Stack: " + mystack);

        // Pop and display the top element
        int topElement = mystack.pop();
        System.out.println("Popped: " + topElement);
        
        // Peek at the top element without removing it
        int peekedElement = mystack.peek();
        System.out.println("Peeked: " + peekedElement);

        // Check if the stack is empty
        boolean isEmpty = mystack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        // Get the size of the stack
        int stackSize = mystack.size();
        System.out.println("Stack Size: " + stackSize);
    }
}

