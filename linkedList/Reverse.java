class Node {
  int data;
  Node next;
  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}

public class Reverse {
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
  public void reverseList() {
    Node prev = null;
    Node current = head;
    Node next = null;

    while (current != null) {
        next = current.next;     // Save the next node
        current.next = prev;  // Reverse the link
        prev = current;   // Move one step forward in the list
        current = next;       // Move to the next node
    }
    head = prev; //Update head to last node,which is now first
  }
  void printList(){
    Node node = head;
    while (node != null) {
        System.out.print(" " + node.data);
        node = node.next;
    }
    System.out.println();
  }
  public static void main(String[] args){

    Reverse llist = new Reverse();
    llist.append(1);
    llist.append(2);
    llist.append(3);
    llist.append(4);
    llist.append(5);

    System.out.println("LinkedList value: ");
    llist.printList();
    System.out.println("Reversed LinkedList");
    llist.reverseList();
    llist.printList();

  }
}

  


