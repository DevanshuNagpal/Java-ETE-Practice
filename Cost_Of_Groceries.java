/*
  Cost of groceries
Question Statement: Chef visited a grocery store for fresh supplies. There are N items in the store where the ith
item has a freshness value Ai and cost Bi.
Chef has decided to purchase all the items having a freshness value greater than equal to X. find the total cost of
groceries the chef buys.
Input format:
Each test case consists of multiple lines of input.
The first line of each test case contains two space-separated integers
N and X — the number of items and the minimum freshness value an item should have.
The second line contains N space-separated integers, the array A, denoting the freshness value of each item.
The third line contains N space-separated integers, the array B, denoting the cost of each item.
Output Format:
For each test case, output on a new line, the total cost of the groceries Chef buys.
Example:
Input:
2 20
15 67
10 90
Output:
90
Explanation:
//N and X
//the array A, denoting the freshness value of each item
//the array B, denoting the cost of each item
//total cost of groceries the chef buys
Item 2 has freshness value greater than equal to X=20
Thus, Chef buys item 2
The total cost is 90
 */

import java.util.Scanner;

public class Cost_Of_Groceries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        int[] freshness = new int[n];
        int[] cost = new int[n];


        for (int i = 0; i < n; i++) {
            freshness[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cost[i] = in.nextInt();
        }

        int total = TotalCost(n,x,freshness,cost);
        System.out.println(total);

    }
    private static int TotalCost(int n,int x, int[] freshness,int[] cost){
        int total = 0;

        for (int i = 0; i < n; i++) {
            if(freshness[i] >= x){
                total += cost[i];
            }

        }

        return total;
    }
}
