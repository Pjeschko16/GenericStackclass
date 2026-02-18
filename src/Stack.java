public class Stack<T> {
    private Object[] elements;
    private int top = -1;

    public Stack() {
        this.elements = new Object[10];
    }

    public Stack(int capacity) {
        this.elements = new Object[capacity];
    }

    public void push(T item) throws StackFullException {
        if (top == elements.length - 1) {
            throw new StackFullException("Stack is full! Cannot push " + item);
        }
        top++;
        elements[top] = item;
    }

    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty! Cannot pop.");
        }
        top--;
        T item = (T) elements[top];
        elements[top] = null;
        return item;
    }

    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty! Cannot peek.");
        }
        return (T) elements[top];
    }

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