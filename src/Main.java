public class Main {
    public static void main(String[] args) {

        System.out.println("Test Integer Stack");
        Stack<Integer> numStack = new Stack<>(3);

        try {
            numStack.push(10);
            numStack.push(20);
            numStack.push(30);
            System.out.println("Current Stack: " + numStack.list());

            System.out.println("Peek: " + numStack.peek());
            System.out.println("Pop: " + numStack.pop());
            System.out.println("After Pop: " + numStack.list());

            numStack.push(40);
            numStack.push(50);
        } catch (Exception e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }

        System.out.println("\nTest String Stack");
        Stack<String> textStack = new Stack<>(5);

        try {
            textStack.push("HTL");
            textStack.push("Wexstraße");
            textStack.push("Wien");
            System.out.println("Stack Content: " + textStack.list());

            textStack.pop();
        } catch (StackEmptyException e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        } catch (StackFullException e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}