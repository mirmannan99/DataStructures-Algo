import java.util.Stack;

public class QueWithTwoStacks {
    private Stack<Integer> stack1 =new Stack<>();
    private Stack<Integer> stack2 =new Stack<>();

    public void enqueue(int item){
        stack1.push(item);
    }
    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1to2();

        return stack2.pop();
    }
    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1to2();

        return stack2.peek();
    }

    private void moveStack1to2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public boolean isEmpty(){
        return  stack1.isEmpty()&&stack2.isEmpty();
    }
}
