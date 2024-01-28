/*
Kim Kitsik
23.01.2024

Main class to test the work of the code.

 */
package linkedlist;

public class Main {
    public static void main(String[] args) {
        //test cases
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        //removing nodes from the middle of the list
        list.printList();
        list.remove(20);
        list.printList();
        list.remove(30);
        list.printList();
        list.remove(40);
        list.printList();
        list.remove(60);
        list.printList();
        //removing head multiple times
        list.remove(10);
        list.printList();
        list.remove(50);
        list.printList();
        //removing tail multiple times
        list.add(40);
        list.add(50);
        list.add(60);
        list.remove(70);
        list.printList();
        list.remove(60);
        list.printList();
        //trying to remove non-existent node
        list.remove(100);
        //trying to remove a previously removed node
        list.remove(20);

    }
}
