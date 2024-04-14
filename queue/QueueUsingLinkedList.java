class QNode {
  int data;
  QNode next;
  public QNode(int data) {
      this.data = data;
      this.next = null;
  }
}
public class QueueUsingLinkedList {
  private QNode front;
  private QNode rear;
  public QueueUsingLinkedList() {
      front = null;
      rear = null;
  }

  public void enqueue(int value) {
      QNode newNode = new QNode(value);

      if (rear == null) {
          front = newNode;
          rear = newNode;
      } else {
          rear.next = newNode;
          rear = newNode;
      }
      System.out.println(value + " enqueued to the queue");
  }
  public int dequeue() {
      if (isEmpty()) {
          return -1; 
      }
      int dequeuedValue = front.data;
      front = front.next;
      if (front == null) {
          rear = null;
      }
      System.out.println(dequeuedValue + " dequeued from q");
      return dequeuedValue;
  }
  public int front() {
      if (isEmpty()) {
          System.out.println("Que empty. Cannot get front element.");
          return -1; 
      }
      return front.data;
  }
  public boolean isEmpty() {
      return front == null;
  }
  public static void main(String[] args) {
    QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Front element: " + queue.front());
        queue.dequeue();
        queue.dequeue();
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
