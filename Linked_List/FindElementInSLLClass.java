package Linked_List;
import java.util.Arrays;
import java.util.List;

public class FindElementInSLLClass {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,4,5,10);
        // Intialize the singly linked list
        Node head = new Node(input.get(0));
        Node current = head;
        for (int i = 1; i < input.size(); i++) {
            current.next = new Node(input.get(i));
            current = current.next;
        }
        int target = 1;
        boolean ans = findElementInSLL(head, target);
        System.out.println("Ans tha ans is " + ans);
    }

    public static boolean findElementInSLL(Node head, int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

class Node{
    Node next;
    int data;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
