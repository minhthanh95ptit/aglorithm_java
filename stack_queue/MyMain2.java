package stack_queue;

public class MyMain2 {
    public static void main(String[] args) {
        MyArrayQueue queue = new MyArrayQueue(4);

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        queue.show();
        queue.pop();
        queue.show();
        queue.pop();
        queue.show();
        queue.pop();
        queue.show();
        queue.pop();
        queue.show();
        queue.pop();
    }
}
