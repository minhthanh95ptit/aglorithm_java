package stack_queue;

public class MyMain {
    public static void main(String[] args) {
        MyArrayStack myStack = new MyArrayStack(5);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(5);
        myStack.push(5);
        

        myStack.pop();
        myStack.show();
        myStack.pop();
        myStack.show();
        myStack.pop();
        myStack.show();
        myStack.pop();
        myStack.show();
        myStack.pop();
        myStack.show();
    }
    
}
