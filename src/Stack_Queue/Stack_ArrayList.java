package Stack_Queue;

import java.util.ArrayList;

public class Stack_ArrayList {

    static class StackA {
        static ArrayList<Integer> list = new ArrayList<>();

        static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        static void push(int data) {
            // it will add automatically end of list
            // which mean it will add top of stack too
            list.add(data);
        }

        // pop
        static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        StackA s = new StackA();
        s.push(1);
        s.push(3);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
