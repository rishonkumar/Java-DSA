package Stack_Queue;

public class Main {

    public static void main(String[] args) {

        Stack_Array s = new Stack_Array();
        s.push(3);
        s.push(32);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
    }
}
