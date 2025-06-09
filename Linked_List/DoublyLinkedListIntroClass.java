package Linked_List;

import java.util.Arrays;
import java.util.List;

public class DoublyLinkedListIntroClass {

    public static void printDLL(Node head){
        Node temp = head;
        System.out.print("null -> ");
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(" <-> ");
            }else{
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,4,5,10);
        // Intialize the singly linked list
        Node head = new Node(input.get(0));
        Node current = head;

        for (int i = 1; i < input.size(); i++) {
            Node newNode = new Node(input.get(i));
            current.next = newNode;
            newNode.back = current;
            current = newNode;
        }
        
        printDLL(head);
    }
}

class Node{
    int data;
    Node next;
    Node back;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }

    public Node(int data, Node next, Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }
}