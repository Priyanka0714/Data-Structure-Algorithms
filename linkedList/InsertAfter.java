class Node {
  int data;
  Node next;
  public Node(int data) {
      this.data = data;
      this.next = null;
  }
}
public class InsertAfter{
  Node head;

  void push(int new_data){
    Node new_node = new Node(new_data);
    new_node.data = new_data;
    new_node.next = head;
    head = new_node;
  }

  public void insertAfter(Node prevNode, int data) {
    if (prevNode == null) {
        System.out.println("Previous node cannot be null.");
        return;
    }
    Node newNode = new Node(data);
    newNode.next = prevNode.next;         
    prevNode.next = newNode;      
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
    InsertAfter llist = new InsertAfter();
 
    llist.push(6);
    llist.push(5);
    llist.push(4);
    llist.push(3);
    llist.push(2);
 
    System.out.print("Created Linked list is: ");
    llist.printList();

    //Insert after a node
    llist.insertAfter(llist.head, 1);
    System.out.print("After inserting 1 after 2: ");
    llist.printList();
    
    // llist.head = new Node(1);
    // Node second = new Node(2);
    // Node third = new Node(3);

    // llist.head.next = second;
    // second.next = third;
    // llist.insertAfter(second, 4);
    //llist.printList();
    
  }    
}


