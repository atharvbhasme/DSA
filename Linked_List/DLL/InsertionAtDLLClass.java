package Linked_List.DLL;
import java.util.Arrays;
import java.util.List;

public class InsertionAtDLLClass {

    public static void print(DLLNode head) {
        DLLNode temp = head;
        System.out.print("null <- ");
        while (temp != null) {
            System.out.print(temp.data);  // Print the node's data
            if (temp.next != null) {
                System.out.print(" <-> ");  // Connector between nodes
            } else {
                System.out.print(" -> ");   // End of list
            }
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static DLLNode insertIntoDLL(DLLNode head, int pos, int target){
        DLLNode newNode = new DLLNode(target);

        // Check if pos is head or not
        if(pos == 1){
            newNode.next = head;
            if(head != null){
                head.back = newNode;
            }
            return newNode;
        }

        // Travese to node before inserting postion
        DLLNode current = head;
        int cnt = 0;
        while(head != null && cnt < pos -1){
            current = current.next;
            cnt++;
        }

        // check if postion is exists in DLL or not
        if(current == null){
            System.out.println("Not Exists the position");
            return head;
        }

        // Inser into middle or end
        newNode.next = current.next;
        newNode.back = current;
        if(current.next == null){
            current.next.back = newNode;
        }
        current.next = newNode;

        return head;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 4, 5, 6, 7, 9, 12);
        DLLNode head = new DLLNode(input.get(0));
        DLLNode current = head;

        // Build the doubly linked list
        for (int i = 1; i < input.size(); i++) {
            DLLNode newNode = new DLLNode(input.get(i));
            current.next = newNode;
            newNode.back = current;
            current = newNode;
        }
        
        System.out.println("Before inserting data");
        print(head);  // Print the DLL

        int data = 100;
        int pos = 5;
        DLLNode ans = insertIntoDLL(head, pos, data);

        System.out.println("DLL after inserting data");
        print(ans);
    }
}

class DLLNode {
    int data;
    DLLNode next;
    DLLNode back;

    public DLLNode(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}