import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        reverse(queue);
//        System.out.println(queue);

//        ArrayQueue queue=new ArrayQueue(5);
//
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//
//        queue.dequeue();
//        queue.dequeue();
//
//        queue.enqueue(60);
//        queue.enqueue(70);
//
//        queue.dequeue();
//
//        queue.enqueue(80);
//
//        System.out.println(queue.toString());
//
//        QueWithTwoStacks que=new QueWithTwoStacks();
//        que.enqueue(10);
//        que.enqueue(20);
//        que.enqueue(30);
//        que.dequeue();
//
//        var first =que.dequeue();
//        System.out.println(first);

//        PriorityQueue<Integer> queue=new PriorityQueue<>();
//        queue.add(5);
//        queue.add(1);
//        queue.add(3);
//        queue.add(2);
//        while (!queue.isEmpty())
//            System.out.println(queue.remove(
//
//            ));

        //!our priority queue
        PrtyQueue queue = new PrtyQueue();
        queue.add(5);
        queue.add(6);
        queue.add(2);
        queue.add(1);
        queue.add(4);

        System.out.println(queue);
        while (!queue.isEmpty())
            System.out.println(queue.remove());




    }

    public static void reverse(Queue<Integer> queue){
        // Q[10,20,30]
        // S[10,20,30]
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.empty())
            queue.add(stack.pop());
    }
}