public class Main {
    public static void main(String[] args) {

        // --- TEST 1: Number Stack (Integer) ---
        System.out.println("--- Testing Integer Stack ---");
        Stack<Integer> numStack = new Stack<>(3);

        try {
            numStack.push(10); // Adding 10
            numStack.push(20); // Adding 20
            numStack.push(30); // Adding 30
            System.out.println("Current Stack: " + numStack.list());

            System.out.println("Peek: " + numStack.peek()); // Should be 30
            System.out.println("Pop: " + numStack.pop());   // Removes 30
            System.out.println("After Pop: " + numStack.list());

            // Testing Exception: StackFull
            numStack.push(40);
            numStack.push(50); // This should trigger Exception
        } catch (Exception e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        }

        // --- TEST 2: Text Stack (String) ---
        System.out.println("\n--- Testing String Stack ---");
        Stack<String> textStack = new Stack<>(5);

        try {
            textStack.push("HTL");
            textStack.push("Anichstraße");
            textStack.push("Innsbruck");
            System.out.println("Stack Content: " + textStack.list());

            // Emptying the stack to test StackEmptyException
            textStack.pop();
            textStack.pop();
            textStack.pop();
            textStack.pop(); // This should trigger Exception
        } catch (StackEmptyException e) {
            System.out.println("Caught Expected Error: " + e.getMessage());
        } catch (StackFullException e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}