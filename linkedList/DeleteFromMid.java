class Node {
  int data;
  Node next;
  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}

public class DeleteFromMid {
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
  public void deleteFromMiddle(int key) {
    if (head == null) return; // Empty list

    Node slowPtr = head;
    Node fastPtr = head;
    Node prevNode = null;

    // Move fast pointer twice as fast as the slow pointer
    while (fastPtr != null && fastPtr.next != null) {
        fastPtr = fastPtr.next.next;
        prevNode = slowPtr;
        slowPtr = slowPtr.next;
    }
    //now,slowPtr is at middle, & prevNode is its predecessor
    if (prevNode != null) {
        // If list has more than one node
        prevNode.next = slowPtr.next;
    } else {
        head = head.next;// If the list has only one node
    }
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

    DeleteFromMid llist = new DeleteFromMid();
    llist.append(1);
    llist.append(2);
    llist.append(3);
    llist.append(4);
    llist.append(5);

    System.out.println("LinkedList value: ");
    llist.printList();
    System.out.println("delete from mid");
    llist.deleteFromMiddle(3);
    llist.printList();

  }
}

  

