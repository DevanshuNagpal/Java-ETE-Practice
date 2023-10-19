/*
 Remove Strings from LinkedList Based on Comparison.
Write a Java program that takes input from the user to create a LinkedList of strings and then
removes all the elements of the LinkedList that are less than or equal to a given string.
Hint: use import java.util.LinkedList class and its functions for example add,  compareTo etc.
Input Format
First line input consists of an integer value n, that is size of linkedlist.
Second line input consists of n string values representing the elements of the linked list.
Third line input consists of a string value to be compared with the other strings in the
linkedlist.
Output Format
Output consists of string values after performing the expected operations.
NOTE: program will compare data by lexicographically.
Sample input1
4
apple banana cherry kiwi
cherry
Sample output1
[kiwi]
Sample input2
5
hi hello pune hellohello punjab
Punjab
Sample output2
[hi, hello, pune, hellohello, punjab]
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Remove_String_by_comparing_from_LL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(in.next());
        }
        String comp = in.next();

        removeString(linkedList,comp);

        System.out.println(linkedList);
    }

    private static void removeString(LinkedList<String> linkedList, String comp) {
        Iterator<String> itr = linkedList.iterator();
        while(itr.hasNext()){
            String curr = itr.next();
            if(curr.compareTo(comp) <= 0){
                itr.remove();
            }
        }
    }
}
