package Linked_List;
import java.util.Arrays;
import java.util.List;

public class InsertionAtHeadClassSLL {
    public static void printSLL(Node head){
        while (head != null) {
            System.out.println("value "+ head.data);
            head = head.next;
        }
    }

    public static Node  insertAtHeadSLL(Node head, int value){
        Node SLL = new Node(value, head);
        SLL.next = head;
        return SLL;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        int value = 12;
        Node head = new Node(list.get(0));
        head.next = new Node(list.get(1));
        head.next.next = new Node(list.get(2));
        head.next.next.next = new Node(list.get(3));

        head = insertAtHeadSLL(head, value);

        printSLL(head);
    }
}

class Node {
    int data;
    Node next;

    public Node(int data1, Node next1){
        this.next = next1;
        this.data = data1;
    }

    public Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
