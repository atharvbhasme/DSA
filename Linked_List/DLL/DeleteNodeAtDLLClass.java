package Linked_List.DLL;

import java.util.Arrays;
import java.util.List;

public class DeleteNodeAtDLLClass {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,6,7,8);
        DNode head= null;
        DNode tail = null;
        head = new DNode(arr.get(0));
        tail = head;
        for (int i = 1; i < arr.size(); i++) {
            DNode newNode = new DNode(arr.get(i));
            tail.next = newNode;
            newNode.back = tail;
            tail = newNode;
        }

        print(head);
    }

    public static void print(DNode head){
        DNode temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}