package Linked_List;

public class DeleteNodeInSLLClass {
    public static void printSLL(Node head){
        while(head != null){
            System.out.print(head.data+" -> ");
            head = head.next;
        }
    }

    // Delete using position
    public static Node deleteNode(Node head, int pos){
        Node current = head;
        int count = 0;

        // Handle deleting the head node
        if (pos == 1) {
            if (head == null) return null;
            return head.next;
        }

        while(current != null && count < pos - 1){
            current = current.next;
            count++; 
        }

         // Check if position is valid
        if (current == null || current.next == null) {
            System.out.println("Invalid position");
            return head;
        }

        current.next = current.next.next;

        return head;
    }

    public static void deleteNodeUsingNode(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static Node deleteNodeUsigData(Node head, int data){
        if(head != null && head.data == data){
            return head.next;
        }

        Node current = head;
        Node prev= null;
        while(current != null  && current.data != data){
            prev = current;
            current = current.next;
        }

        // another login
        // while (current != null && current.next != null) {
        // if (current.next.data == data) {
        //     current.next = current.next.next; // Skip the node with target data
        //     return head;
        //     }
        //     current = current.next;
        // }

          // Check if position is valid
        if (current == null || current.next == null) {
            System.out.println("Invalid position");
            return head;
        }

        prev.next = current.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(12);

        System.out.println("Linked List Before Deleting data");
        printSLL(head);

        int pos = 3;
        int data = 5;
        // Node ans = deleteNode(head, pos);
        Node ans = deleteNodeUsigData(head, data);

        // Node nodeToDelete = head.next.next; // value is 8
        // deleteNodeUsingNode(nodeToDelete);


        System.out.println("Linked List after Deleting Data");
        printSLL(ans);
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

