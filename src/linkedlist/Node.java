/*
Kim Kitsik
23.02.2024

This class contains attributes for a node: stored integer and previous and next pointers. Also, a public method to make
the class usable.

 */

package linkedlist;

public class Node {
    int data;
    Node previous;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
