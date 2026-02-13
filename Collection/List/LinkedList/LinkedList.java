package List.LinkedList;

public class LinkedList {
    
    Node head; // head is null initially by default

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head; // null is assigned to next
        head = newNode; // reference of new node is assigned to head.
    }

    public void insertAtEnd(int data){
        
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void traverse(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void insertAtIndex(int index, int data){
        
        if(index < 0){
            System.out.println("Invalid index");
            return;
        }
        if(index == 0){
            insertAtBeginning(data);
            return;
        }

        int i = 0;
        Node newNode = new Node(data);
        Node temp = head;
        while(i < index - 1 && temp != null){
            temp = temp.next;
            i++;
        }

        if(temp == null){
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    void delete(int data){

        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        Node temp = head;

        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Data not found.");
            return;
        }

        temp.next = temp.next.next;

    }

    public void deleteByIndex(int index){
        
        if(index < 0){
            System.out.println("Invalid index.");
            return;
        }
        //head is null
        if(head == null){
            System.out.println("List is Empty.");
            return;
        }

        if(index == 0){
            head = head.next;
            return;
        }
        
        //store reference of first node in temp
        Node temp = head;
        //intital count
        int i=0;
        
        while(i < index - 1 && temp.next != null){
            temp = temp.next;
            i++; // counter
        }

        if(temp.next == null){
            System.out.println("Index out of Bound.");
            return;
        }
        System.out.println("Removing Element : "+temp.next.data);
        temp.next = temp.next.next;
        
    }

    //size of an list
    int size(){

        int count = 0;
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }


    //reverse a linked list

    public void reverseList(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }
}
