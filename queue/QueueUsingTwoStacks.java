import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void enqueue(int value) {
        stack1.push(value);
        System.out.println(value + " enqueued to the queue");
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int dequeuedValue = stack2.pop();
        System.out.println(dequeuedValue + " dequeued from q");
        return dequeuedValue;
    }
    public int front() {
        if (isEmpty()) {
            System.out.println("Que empty. Cannot get front element.");
            return -1; 
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Front element: " + queue.front());
        queue.dequeue();
        queue.dequeue();
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
