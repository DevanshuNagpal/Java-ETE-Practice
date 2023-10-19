import java.util.List;
import java.util.Scanner;

//class Node {
//    //        val and address
//    int val;
//    Node next;
//
//    public Node() {
//
//    }
//
//    public Node(int val) {
//        this.val = val;
//    }
//
//    public Node(int val, Node next) {
//        this.val = val;
//        this.next = next;
//    }
//}
//
//class MyLinkedList {
//    Node head = null; //by default its null
//    int size;   //by default int has value 0
//
//    public int get(int index) {
//        //        check the index is within range if not return -1
//        if (index < 0 || index >= size) return -1;
//        Node cur = head;
//
//        for(int i=1;i<=index;i++){
//            cur=cur.next;
//        }
////        return value
//        return cur.val;
//    }
//
//
//    public void addAtHead(int val) {
//        Node newNode = new Node(val);
//        newNode.next = head;
//        head = newNode;
//        size++;
//    }
//
//    public void addAtTail(int val) {
//        addAtIndex(size, val);
//    }
//
//    public void addAtIndex(int index, int val) {
////        if index larger than size return
//        if (index > size) {
//            return;
//        }
//
//        Node cur = head;
//        Node newNode = new Node(val);
//        for (int i = 0; i < index; i++) {
//            cur = cur.next;
//        }
//        newNode.next = cur.next;
//        cur.next = newNode;
//        size++;
//    }
//
//
//    public void deleteAtIndex(int index) {
//        if (index < 0 || index > size) {
//            return;
//        }
//        Node cur = head;
//        for (int i = 0; i < index; i++) {
//            cur = cur.next;
//        }
//        cur.next = cur.next.next;
//        size--;
//    }
//    public void printList(Node head) {
//        Node cur = head;
//        System.out.print("[");
//        while (cur != null) {
//            System.out.print(cur.val);
//            cur = cur.next;
//            if (cur != null) {
//                System.out.print(",");
//            }
//        }
//        System.out.println("]");
//    }
//
//
//}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;

    }
    public Node(int data,Node next){
        this.data = data;
        this.next  = next;
    }
}
class LinkedList{
    Node head;
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void displayList(){
        Node current = head;
        while(current != null ){
            System.out.print(current.data + " ");
            current = current.next;
            }
        System.out.println();
    }
}

public class Design_LinkedList {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        MyLinkedList list = new MyLinkedList();
//
//        // Initialize the head pointer to a dummy node.
//
//
//        list.addAtHead(9);
//        list.addAtHead(1);
//        list.addAtHead(2);
//        list.addAtIndex(1, 12);
//
////        list.addAtTail(9);
//
//        // Set the head pointer to the first real node in the linked list before calling the printList() method.
//        list.head = list.head.next;
//
//        list.printList(list.head);

        Scanner in = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            list.insertAtBeginning(value);
        }

        list.displayList();

    }

}
