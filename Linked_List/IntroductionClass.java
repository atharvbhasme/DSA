package Linked_List;

public class IntroductionClass {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6};
        Node LL = new Node(input[0]);
        System.out.println("first value is "+ LL.data);

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

    //constrcutor
    public Node(int data1, Node next1){
        this.data = data1;
        this.next = next1; // this is for next node
    }
}
