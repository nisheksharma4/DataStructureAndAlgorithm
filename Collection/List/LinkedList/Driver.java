package List.LinkedList;

public class Driver {
    
    public static void main(String[] args) {
        
        LinkedList ls = new LinkedList();
        ls.insertAtBeginning(1);
        ls.insertAtBeginning(2);
        ls.insertAtBeginning(3);
        ls.insertAtBeginning(4);
        ls.insertAtBeginning(7);

        ls.traverse();

        ls.insertAtEnd(10);

        ls.traverse();

        ls.insertAtEnd(11);

        ls.traverse();

        ls.delete(4);

        ls.traverse();

        System.out.println("Inserting at index : ");
        ls.insertAtIndex(3, 12);
        ls.traverse();

        ls.delete(10);
        ls.traverse();

        ls.deleteByIndex(2);
        ls.traverse();

        //ls.deleteByIndex(99);

        int size = ls.size();
        System.out.println("Size of an List : "+size);

        System.out.println("Reversed Array : ");
        ls.reverseList();
        ls.traverse();
    }
}
