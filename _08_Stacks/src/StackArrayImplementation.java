import java.util.EmptyStackException;

public class StackArrayImplementation {

    private int top;
    private int[] arr;

    public StackArrayImplementation(int capacity) {
        this.top = -1;
        arr = new int[capacity];
    }

    public StackArrayImplementation() {
        this(0); // automatically calls the parametrized constructor with capacity as 0 if we dont pass the capacity
    }

    public void push(int data){
        if(isFull()) throw new RuntimeException("stack is full");

        top++;
        arr[top] = data;
    }

    public int pop(){
        if(isEmpty()) throw new EmptyStackException();

        int result = arr[top];
        top--;
        return result;
    }

    public int peek(){
        if(isEmpty()) throw new EmptyStackException();

        return arr[top];
    }

    public boolean isFull(){
        return arr.length == size();
    }

    public int size(){
        return  top + 1;
    }

    public boolean isEmpty(){
        return top < 0;
    }
}
