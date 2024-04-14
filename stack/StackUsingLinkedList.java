class Node {
  int data;
  Node next;
  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}
class StackUsingLinkedList {
  private Node top;

  public StackUsingLinkedList () {
      this.top = null;
  }
  public boolean isEmpty() {
      return top == null;
  }
  public void push(int value) {
      Node newNode = new Node(value);
      newNode.next = top;
      top = newNode;
  }
  public int pop() {
      if (!isEmpty()) {
          int poppedValue = top.data;
          top = top.next;
          return poppedValue;
      } else {
          return -1; //empty
      }
  }
  public int peek() {
      if (!isEmpty()) {
          return top.data;
      } else {
          return -1; 
      }
  }
  public void display() {
      Node current = top;
      while (current != null) {
          System.out.print(current.data + " ");
          current = current.next;
      }
      System.out.println();
  }
  public static void main(String[] args) {
    StackUsingLinkedList  stack = new StackUsingLinkedList ();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.display();
      System.out.println("Top element: " + stack.peek());
      stack.pop();
      stack.pop();
      System.out.println("Is the stack empty? " + stack.isEmpty());
  }
}

