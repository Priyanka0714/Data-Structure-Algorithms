class Node {
  int data;
  Node next;
  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}

public class DeleteFromBeg {
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
  public void deleteFromBeginning() {
    if (head != null) {
        head = head.next;
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

    DeleteFromBeg llist = new DeleteFromBeg();
    llist.append(1);
    llist.append(2);
    llist.append(3);

    System.out.println("LinkedList value: ");
    llist.printList();
    System.out.println("delete from beg");
    llist.deleteFromBeginning();
    llist.printList();

  }
}

  

