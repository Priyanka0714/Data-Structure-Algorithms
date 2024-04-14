class Node {
  int data;
  Node next;
  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}

public class DeleteFromEnd  {
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
  public void deleteFromEnd() {
    if (head == null || head.next == null) {
        head = null; //Empty list or only one node in the list
        return;
    }
    Node secondLast = head;
    while (secondLast.next.next != null) {
        secondLast = secondLast.next;
    }
    secondLast.next = null;
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

    DeleteFromEnd llist = new DeleteFromEnd();
    llist.append(4);
    llist.append(5);
    llist.append(6);

    System.out.println("LinkedList value: ");
    llist.printList();
    System.out.println("delete from end");
    llist.deleteFromEnd();
    llist.printList();

  }
}

  

