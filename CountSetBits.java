import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int total =0;
        for (int i = 1; i <= n; i++) {
            total += setBits(i);
        }
        System.out.println(total);
    }
    private static int setBits(int num){
        int count = 0;
        while(num>0){
            count += num&1;
            num >>= 1;
        }
        return count;

    }
}
/*

You've become involved in a project focused on binary number analysis. Your current assignment revolves around creating a Java program that calculates the cumulative count of set bits (bits with a value of 1) across the binary representations of numbers ranging from 1 to a designated positive integer A. Your goal is to develop a program that efficiently carries out this computation.
Write a Java program that takes a positive integer A as input and calculates the total number of set bits in the binary representation of all the numbers from 1 to A.


Input format:
Input represents the positive integer provided by the user.
Output format:
Output represents the total number of set bits in the binary representation of numbers from 1 to A.


Sample Input 1:
5
Sample Output 1:
7
Sample Input 2:
10
Sample Output 2:
17

 */