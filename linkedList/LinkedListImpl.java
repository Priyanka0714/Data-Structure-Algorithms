class Node {
  int data;
  Node next;
  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}
public class LinkedListImpl {
  private Node head;
  
  public LinkedListImpl() {
      this.head = null;
  }

  // INSERT AT BEG
  public void insertAtBeginning(int data) {
      Node newNode = new Node(data);
      newNode.next = head; // Set next of new node to current head
      head = newNode;    // Update head to be  new node
  }


// INSERT AT END
  public void append(int data) {
      Node newNode = new Node(data);
      if (head == null) {
          head = newNode;
          return;
      }
      Node current = head;
      while (current.next != null) {
          current = current.next;
      }
      current.next = newNode;
  }
  public void display() {
      Node current = head;
      while (current != null) {
          System.out.print(current.data + " ");
          current = current.next;
      }
      System.out.println();
  }

  public static void main(String[] args) {
      LinkedListImpl linkedList = new LinkedListImpl();

      linkedList.append(1);
      linkedList.append(2);
      linkedList.append(3);

      System.out.println("Linked List elements:");
      linkedList.display();
  }
}
