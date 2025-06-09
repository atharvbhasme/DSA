package Linked_List;

import java.util.Arrays;
import java.util.List;

public class LengthOfSLLClass {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,4,5,10);
        // Intialize the singly linked list
        Node head = new Node(input.get(0));
        Node current = head;
        for (int i = 1; i < input.size(); i++) {
            current.next = new Node(input.get(i));
            current = current.next;
        }
        
        int ans = findLengthOfSLL(head);
        System.out.println("the length of array is "+ input.size());
        System.out.println("the length of SLL is "+ ans);
    }

    public static void printSLL(Node head){
        while(head != null){
            System.out.print(head.data+ " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static int findLengthOfSLL(Node head){
        int counter = 0;
        Node temp = head; // use the temp array which does not affect the original array
        while(temp !=  null){
            counter++;
            temp = temp.next;
        }
        return counter;
    }
}

class Node{
    public Node next;
    public int data;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}