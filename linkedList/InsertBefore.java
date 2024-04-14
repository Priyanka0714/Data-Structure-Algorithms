class Node {
  int data;
  Node next;
  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}
public class InsertBefore {
  Node head;

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

  void insertBefore(Node givenNode, int newData) {
    
    Node newNode = new Node(newData);
    
    if (givenNode == null) {
        System.out.println("The given node cannot be null.");
        return;
    }
    if (head == null) {
        head = newNode;
        return;
    }
    if (head == givenNode) {
        newNode.next = head;
        head = newNode;
        return;
    }
    Node prev = null;
    Node current = head;
    while (current != null && current != givenNode) {
        prev = current;
        current = current.next;
    }
    if (current == null) {
        System.out.println("The given node does not exist in the linked list.");
        return;
    }
    prev.next = newNode;
    newNode.next = current;
}
  void printList(){
    Node node = head;
    while (node != null) {
        System.out.print(" " + node.data);
        node = node.next;
    }
    System.out.println();
  }
  public static void main(String[] args) {
  InsertBefore llist = new InsertBefore();

  llist.append(1);
  llist.append(2);
  llist.append(3);

  System.out.print("Created Linked list is: ");
  llist.printList();

  // Insert before a node
  System.out.print("Insert 7 before 2: ");
  llist.insertBefore(llist.head.next, 7);
  llist.printList();
  }
}    



