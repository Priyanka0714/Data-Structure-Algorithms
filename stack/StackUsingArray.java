public class StackUsingArray {
  private int maxSize , top ;
  private int[] s;

  public StackUsingArray(int size) {  // Constr to initialize stack
      maxSize = size;
      s = new int[maxSize];
      top = -1; // Stack is initially empty
  }
  public void push(int value) {
      if (top < maxSize - 1) {
          s[++top] = value;
      } else {
          System.out.println("Stack full. Cannot push ");
      }
  }
  public int pop() {
      if (top >= 0) {
          int poppedValue = s[top--];
          return poppedValue;
      } else {
          System.out.println("Stack is empty. Cannot pop.");
          return -1; // Signifying an empty stack
      }
  }
  public boolean isEmpty() {
      return top == -1;
  }
  public boolean isFull() {
      return top == maxSize - 1;
  }
  public int peek() {
      if (top >= 0) {
          return s[top];
      } else {
          System.out.println("Stack is empty. Cannot peek.");
          return -1; 
      }
  }
  public static void main(String[] args) {
      StackUsingArray stack = new StackUsingArray(5);
      stack.push(1);
      stack.push(2);
      stack.push(3);
      System.out.println("Top element: " + stack.peek());
      stack.pop();
      stack.pop();
      System.out.println("Is the stack empty? " + stack.isEmpty());
      System.out.println("Is the stack full? " + stack.isFull());
  }
}        