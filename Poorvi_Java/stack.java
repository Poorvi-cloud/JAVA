public class Stack {
    private int maxSize; // Maximum size of the stack
    private int[] stackArray; // Array to store stack elements
    private int top; // Index of the top element in the stack

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element " + value);
            return;
        }
        top++;
        stackArray[top] = value;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Return -1 to indicate stack underflow
        }
        int poppedElement = stackArray[top];
        top--;
        return poppedElement;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to peek the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return -1 to indicate stack is empty
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Creating a stack with maximum size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element of the stack: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element of the stack after popping: " + stack.peek());
    }
}
