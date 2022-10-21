package Stack_Queue;

//https://takeuforward.org/data-structure/implement-stack-using-array/
public class Stack_Array {

    int size = 5;
    int arr[] = new int[size];
    int top = -1;

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        int x = arr[top];
        top--;
        return x;
    }

    public int top()  {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }
}
