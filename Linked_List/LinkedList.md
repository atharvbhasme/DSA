# Linked List

**What is Linked List**
- Liked List is data structure that can be visualed as chain with different node, where each node connected different elements.
- Linked is containts two elements first one is data and other one is pointer to next element
- Frist element is called head and last element is called tail

**Memory Managment in LL**
- it will consume 12 bytes in 64 bytes system, int = 4, next = 8

Code for LL
``` JAVA
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
```

**Inserting in Singly LL**


**Inserting in DLL**
Steps
- create `newNode` object
- check position if head or not
    - assigne `newNode.next` to `head`
    - asiign `newNode.back` to `newNode`
- create `current` and assign it ot `head`
- intailize the counter
- `head != null && cnt < pos -1` while loop with assign `current = current.next` and increase the counter
- if `current == null` then position is not found
- insert at middle positon
```JAVA
        newNode.next = current.next;
        newNode.back = current;
        if(current.next == null){
            current.next.back = newNode;
        }
        current.next = newNode;

        return head;
```