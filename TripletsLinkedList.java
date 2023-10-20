import java.util.*;
import java.util.LinkedList;

public class TripletsLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        for(int i = 0 ; i<n;i++){
            list1.add(sc.nextInt());
        }
        for(int i = 0 ; i<m;i++){
            list2.add(sc.nextInt());
        }
        for(int i = 0 ; i<k;i++){
            list3.add(sc.nextInt());
        }
        int target=sc.nextInt();

        sc.close();

        findTriplet(list1,list2,list3,target);

    }

    private static void findTriplet(LinkedList<Integer> list1, LinkedList<Integer> list2, LinkedList<Integer> list3, int target) {
        for (int num1 : list1) {
            for (int num2 : list2) {
                for (int num3 : list3) {
                    if (num1 + num2 + num3 == target) {
                        System.out.println(num1 + " " + num2 + " " + num3);
                    }
                }
            }
        }
    }
}

/*
Triplet From LinkedList

Given three linked lists, say a, b and c, find one node from each list such that the sum of the values of the nodes is equal to a given number, say, Target. As any number of answers can be possible, return the first one you get while traversing.

Input Format

The First Line contains 3 Integers n, m and k as the Size of the Three LinedLists. Next 3 Lines contains n, m and k number of integers respectively as the elements of Linked Lists. Next Line contains an Integer as Target.

Constraints

The Size of the Lists can be different.

Output Format

Display the 3 elements from each of the Lists whose sum is equal to the target separated by space.

Sample Input

3 3 3
12 6 29
23 5 8
90 20 59
101


Sample Output

6 5 90

Explanation

In the Given Sample Input, 6, 5 and 90 from lists 1, 2 and 3 respectively add to give 101.

 

 */
