import java.util.LinkedList;
import java.util.Queue;

class StackUsingTwoQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int value) {
        // Enqueue the new element to the empty queue and enqueue all elements from the other queue
        if (q1.isEmpty()) {
            q1.offer(value);
            while (!q2.isEmpty()) {
                q1.offer(q2.poll());
            }
        } else {
            q2.offer(value);
            while (!q1.isEmpty()) {
                q2.offer(q1.poll());
            }
        }
        System.out.println(value + " pushed to the stack");
    }

    public int pop() {
        // Dequeue from the non-empty queue
        if (q1.isEmpty() && q2.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Signifying an empty stack
        } else if (q1.isEmpty()) {
            return q2.poll();
        } else {
            return q1.poll();
        }
    }

    public int peek() {
        // Peek from the non-empty queue
        if (q1.isEmpty() && q2.isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        } else if (q1.isEmpty()) {
            return q2.peek();
        } else {
            return q1.peek();
        }
    }
    public boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }
    public static void main(String[] args) {
      StackUsingTwoQueue stack = new StackUsingTwoQueue();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      //stack.display();
      System.out.println("Top element: " + stack.peek());
      stack.pop();
      stack.pop();
      System.out.println("Is the stack empty? " + stack.isEmpty());
  }     
}

