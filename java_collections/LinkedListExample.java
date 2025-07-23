// Doubly Linked List
// fast insert delete operations
// slow access
// can be queue

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> example = new LinkedList<>();

        // linked list most used methods
        // addFirst
        example.addFirst("first");

        // addLast
        example.addLast("last");

        //simple add
        example.add("simple");

        // remove first
        example.removeFirst();

        // remove last
        example.removeLast();

        // remove using index
        // if we try to remove the element which is not present like any other index, error will be index out of bound
        example.remove(0);

        // add one more to print
        example.add("one more");

        // print the arrat
        System.out.println(example);
    }
}
