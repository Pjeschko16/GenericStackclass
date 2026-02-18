/**
 * A generic Stack implementation using an Object array.
 * Follows the LIFO (Last-In-First-Out) principle.
 * * @param <T> The type of elements held in this stack.
 */
public class Stack<T> {
    private Object[] elements;
    private int top = -1; // Index of the top element

    /**
     * Default constructor with a standard size of 10.
     */
    public Stack() {
        this.elements = new Object[10];
    }

    /**
     * Constructor with a specific capacity.
     * @param capacity The maximum number of elements the stack can hold.
     */
    public Stack(int capacity) {
        this.elements = new Object[capacity];
    }

    /**
     * Adds an element to the top of the stack.
     * @param item The element to be added.
     * @throws StackFullException if the array is full.
     */
    public void push(T item) throws StackFullException {
        if (top == elements.length - 1) {
            throw new StackFullException("Stack is full! Cannot push " + item);
        }
        elements[++top] = item;
    }

    /**
     * Removes and returns the top element.
     * @return The removed element.
     * @throws StackEmptyException if the stack is empty.
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty! Cannot pop.");
        }
        return (T) elements[top--];
    }

    /**
     * Returns the top element without removing it.
     * @return The top element.
     * @throws StackEmptyException if the stack is empty.
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty! Cannot peek.");
        }
        return (T) elements[top];
    }

    /**
     * Returns all elements as a semicolon-separated string.
     * @return Concatenated string of elements.
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i < top) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}