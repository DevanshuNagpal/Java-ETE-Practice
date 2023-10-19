/*
 Running with Alice and Bob
Question Statement: Alice and Bob recently got into running, and decided to compare how much they ran on
different days.
They each ran for N days — on the ith day, Alice ran Ai meters and Bob ran Bi meters.       On each day,
Alice is unhappy if Bob ran strictly more than twice her distance, and happy otherwise.
Similarly, Bob is unhappy if Alice ran strictly more than twice his distance, and happy otherwise.
For example:
If Alice ran 200 meters and Bob ran 500, Alice would be unhappy but Bob would be happy.
If Alice ran 500 meters and Bob ran 240, Alice would be happy and Bob would be unhappy.
If Alice ran 300 meters and Bob ran 500, both Alice and Bob would be happy.
On how many of the N days were both Alice and Bob happy?
Input format:
Each test case consists of multiple lines of input.
The first line of the test case contains single integer N- number of days.
The second line contains N space-separated integers, the array A, the distance run by the Alice on the N days.
The third line contains N space-separated integers, the array B, the distance run by the Bob on the N days.
Output Format:
For each test case, output on a new line the number of days when both Alice and Bob were happy.
Example:
Input:
3
100 200 300
300 200 100
Output:
1
Explanation:
//N- number of days
//the array A, the distance run by the Alice on the N days
// the array B, the distance run by the Bob on the N days
Alice is unhappy on the first day, since she ran 100 meters but Bob ran 300; and 300 is more than twice
of 100.
Similarly, Bob is unhappy on the third day.
Both Alice and Bob are happy on the second day, so the answer is 1.
 */
import java.util.Scanner;

public class Running_Alice_Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Read the distances run by Alice
        int[] aliceDistances = new int[n];
        for (int j = 0; j < n; j++) {
            aliceDistances[j] = scanner.nextInt();
        }

        // Read the distances run by Bob
        int[] bobDistances = new int[n];
        for (int j = 0; j < n; j++) {
            bobDistances[j] = scanner.nextInt();
        }

        int happyDays = countHappy(n,aliceDistances,bobDistances);
        System.out.println(happyDays);
    }

    private static int countHappy(int n,int[] aliceDistances, int[] bobDistances) {
        int happyDays = 0;
        for (int i = 0; i < n; i++) {
            if(aliceDistances[i] <= 2* bobDistances[i] && bobDistances[i] <=2* aliceDistances[i] )
            {
                happyDays++;
            }
        }
        return happyDays;
    }
}
