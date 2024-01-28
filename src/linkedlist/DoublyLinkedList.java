/*
Kim Kitsik
23.02.2024

This class contains 3 methods: add, remove and printNodes. The methods respectively add, remove or print given nodes.

 */
package linkedlist;

public class DoublyLinkedList {
    Node head, tail = null;

    //method for adding a new node to the list. The node is added to the end of the list
    public void add(int data) {
        Node tempNode = new Node(data);

        //if the list is empty, the head and tail nodes become the same node (tempNode) essentially becoming
        // the first element of the list
        if (head == null) {
            head = tail = tempNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            //tempNode is added to the end of the list. Tail's next pointer points to tempNode, tempNode's previous
            //pointer is set to tail. Then the tempNode becomes the new tail with next pointer set to null
            tail.next = tempNode;
            tempNode.previous = tail;
            tail = tempNode;
            tail.next = null;
        }
    }
    //method for removing the first found node containing the given data starting from head. The cycle goes through all
    //nodes and if match is found, the previous node's next pointer is set to the node after the matching node and vice versa
    public void remove(int data){
        Node tempNode;
        Node current = head;

        while(current != null) {
            if (current.data==data){

                //if the matching node is either the head or tail
                if (current.previous==null){
                    head=current.next;
                    head.previous=null;
                    System.out.println("Removed node: "+data);
                    return;
                }
                else if(current.next==null){
                    tail=current.previous;
                    tail.next=null;
                    System.out.println("Removed node: "+data);
                    return;
                }
                //middle case
                //Interchanging pointers to skip the removed node (next node's previous pointer ->
                // -> node before the match and vice versa)
                tempNode=current.previous;
                tempNode.next=current.next;
                current.next.previous=tempNode;
                System.out.println("Removed node: "+data);
                return;
            }
            current=current.next;
        }
        System.out.println("The node "+data+" has not been found. ");
    }

    //the method goes through all nodes starting from the head printing them one by one. Empty list case is handled.
    public void printList() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
