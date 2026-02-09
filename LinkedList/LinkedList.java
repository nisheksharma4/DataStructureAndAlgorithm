package LinkedList;

public class LinkedList {
    
    private Node head;

    public LinkedList(){
        this.head = null;
    }

    //insert at Head
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}
