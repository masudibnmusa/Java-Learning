import java.util.ArrayList;
class TestMyStack {
    public static void main(String[] args) {

        // Test Integer Stack
        MyStack<Integer> intStack = new MyStack<>();

        System.out.println("Testing Integer Stack...");
        intStack.push(5);
        intStack.push(15);
        intStack.push(25);

        System.out.println("Top: " + intStack.top()); // 25
        intStack.pop();
        System.out.println("Top after pop: " + intStack.top()); // 15
        System.out.println("Size: " + intStack.getSize()); // 2

        // Test String Stack
        MyStack<String> strStack = new MyStack<>();

        System.out.println("\nTesting String Stack...");
        strStack.push("A");
        strStack.push("B");
        strStack.push("C");

        System.out.println("Top: " + strStack.top()); // C
        strStack.pop();
        System.out.println("Top after pop: " + strStack.top()); // B
        System.out.println("Size: " + strStack.getSize()); // 2

        // Test Empty Condition
        MyStack<Double> emptyStack = new MyStack<>();

        System.out.println("\nTesting Empty Stack...");
        System.out.println("Is empty: " + emptyStack.isEmpty()); // true

        try {
            emptyStack.pop();
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
class MyStack<T> {
    private ArrayList<T> elements;

    public MyStack() {
        elements = new ArrayList<>();
    }

    public void push(T n) {
        elements.add(n);
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        elements.remove(elements.size() - 1);
    }

    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int getSize() {
        return elements.size();
    }
}
public class statck {
     public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top());

        stack.pop();
        System.out.println("Top after pop: " + stack.top());

        System.out.println("Stack size: " + stack.getSize());
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("My name is masud ibn musa");
    }
}
