package Linked_List.DLL;

public class DNode {
    int data;
    DNode next;
    DNode back;

    public DNode(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }

    public DNode(int data1, DNode next1, DNode back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
}
