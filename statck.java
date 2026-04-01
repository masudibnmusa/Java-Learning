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
    public static void main(String[]args){
        
    }
}
