package Linked_List;

public class insertionAtSLLClass {
    
    public static Node insertData(Node head, int pos, int data){
        // create the object of node
        Node newNode = new Node(data);

        //if pos is head
        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node current = head;
        int count = 0;

        // seach the postion to insert he node 
        while(current != null && count < pos -1 ){
            current = current.next;
            count++;
        }

        // check for end of linked list
        if(current == null){
            System.out.println("Index Out of bound");
            return head;
        }

        System.out.println("Value at current next "+ newNode.data);

        // Inser the node
        newNode.next = current.next;
        current.next = newNode;

        return head;

    }

    public static void printSLL(Node head){
        while(head != null){
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(10);

        System.out.println("Linked List Before Inserting data");
        printSLL(head);

        int pos = 3;
        int value = 12;
        insertData(head, pos, value);

        System.out.println("Linked list After inserting data");

        printSLL(head);

    }
}

class Node{
    int data; // data stored in node
    Node next; // next pointer

    //Contrcutor
    public Node(int data){
        this.data = data;
        this.next = null; // this is for end of linked list
    }
}