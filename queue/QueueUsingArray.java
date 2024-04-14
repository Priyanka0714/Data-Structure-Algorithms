public class QueueUsingArray {
  private int maxSize;
  private int front;
  private int rear;
  private int[] queueArray;

  public QueueUsingArray(int size) {
      maxSize = size;
      queueArray = new int[maxSize];
      front = 0;
      rear = -1;
  }

  public void enqueue(int value) {
      if (isFull()) {
          System.out.println("Queue is full. Cannot enqueue ");
      } else {
          rear = (rear + 1) % maxSize;
          queueArray[rear] = value;
          System.out.println(value + " enqueued to the queue");
      }
  }
  public int dequeue() {
      if (isEmpty()) {
          System.out.println("Queue is empty. Cannot dequeue.");
          return -1; 
      } else {
          int dequeuedValue = queueArray[front];
          front = (front + 1) % maxSize;
          System.out.println(dequeuedValue + " dequeued from q");;
          return dequeuedValue;
      }
  }
  public int front() {
      if (isEmpty()) {
          System.out.println("Que empty. Cannot get front elem.");
          return -1; 
      } else {
          return queueArray[front];
      }
  }
  public boolean isEmpty() {
      return (rear + 1) % maxSize == front;
  }
  public boolean isFull() {
      return (rear + 2) % maxSize == front;
  }
  public static void main(String[] args) {
      QueueUsingArray queue = new QueueUsingArray(5);
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
      System.out.println("Front element: " + queue.front());
      queue.dequeue();
      queue.dequeue();
      System.out.println("Is the queue empty? " + queue.isEmpty());
  }
}

