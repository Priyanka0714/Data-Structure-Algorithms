class Node {
  int data;
  Node next;
  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}

public class DeleteAtGivenPos {
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

  public void deleteAtPosition(int position) {
    if (head == null) return;
    if (position == 0) {
        head = head.next;//If the node to be deleted is the head
        return;
    }
    Node current = head;
    Node prevNode = null;
    // Traverse to the desired position
    for (int i = 0; i < position && current != null; i++) {
        prevNode = current;
        current = current.next;
    }
    // If position is greater than the length of the list
    if (current == null) {        
        return;
    }
    // Update references to delete node at the given position
    prevNode.next = current.next;
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

    DeleteAtGivenPos llist = new DeleteAtGivenPos();
    llist.append(1);
    llist.append(2);
    llist.append(3);
    llist.append(4);
    llist.append(5);

    System.out.println("LinkedList value: ");
    llist.printList();
    System.out.println("delete from given index");
    llist.deleteAtPosition(3);
    llist.printList();

  }
}

  


