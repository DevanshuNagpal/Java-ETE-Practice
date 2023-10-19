import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Kth_Element_from_last_Linked_List {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        int data;
        while((data = in.nextInt()) != -1){
            list.add(data);
        }

        int k = in.nextInt();

        int ans = kth_Last(list,k);
        System.out.println(ans);
    }
    private static int kth_Last(LinkedList<Integer> list,int k){
        if(list.isEmpty() || k>list.size() || k<=0){
            return -1;
        }

        ListIterator<Integer> first= list.listIterator();
        ListIterator<Integer> second= list.listIterator();

        for (int i = 0; i < k; i++) {
            first.next();
        }
        while(first.hasNext()){
            first.next();
            second.next();
        }
        return second.previous();

/*
first.next() advances the first iterator to the next element.
second.next() advances the second iterator to the next element.
So, when you use second.next() after the loop, it will give you the value
of the next element in the list after the loop has finished. If you want to get the
value of the element at the cursor position,you would need to use
second.previous() to move the second iterator back one step.
 */
    }
}
/*
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    int findKthFromEnd(int k) {
        if (head == null || k <= 0) {
            return -1; // Invalid input
        }

        Node slow = head;
        Node fast = head;

        // Move the fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return -1; // k is greater than the length of the list
            }
            fast = fast.next;
        }

        // Move both pointers until the fast pointer reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }
}

public class Kth_Element_from_last_Linked_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        // Input the linked list values
        int data;
        while ((data = scanner.nextInt()) != -1) {
            linkedList.insert(data);
        }

        // Input the value of k
        int k = scanner.nextInt();

        // Find and print the kth element from the end
        int result = linkedList.findKthFromEnd(k);
        if (result == -1) {
            System.out.println("Invalid input or k is greater than the length of the list.");
        } else {
            System.out.println("The kth element from the end is: " + result);
        }
    }
}

 */
