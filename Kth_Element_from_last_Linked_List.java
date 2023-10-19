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
