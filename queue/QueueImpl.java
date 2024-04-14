import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);     // Enqueue elements
        queue.offer(3);
        System.out.println("Queue elements: " + queue);
        // Dequeue elements
        int dequeuedElement1 = queue.poll();
        int dequeuedElement2 = queue.poll();

        System.out.println(dequeuedElement1 + " dequeued from q"); 
        System.out.println(dequeuedElement2 + " dequeued from q");
        System.out.println("Front element: " + queue.peek());
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
