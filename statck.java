import java.util.ArrayList;

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
    }
}
