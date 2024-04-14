import java.util.Stack;

public class StackImpl {
  public static void main(String[] args) {

      Stack<Integer> stack = new Stack<>();
      stack.push(1);
      stack.push(2);
      stack.push(3);

      System.out.println("Stack elements: " + stack);
      System.out.println("Top element: " + stack.peek());
      System.out.println(stack.pop() + " popped from the stack");
      System.out.println(stack.pop() + " popped from the stack");
      System.out.println("Is the stack empty? " + stack.isEmpty());
  }
}

