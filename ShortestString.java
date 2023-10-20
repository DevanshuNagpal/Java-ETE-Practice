import java.util.*;

public class ShortestString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- >0){
            String s = in.next();

            s = s.replaceAll("10","");
            s = s.replaceAll("00","");
            System.out.println(s.length());
            System.out.println(s);

        }
    }

}
/*
You are given a string containing only '1' and '0'. You can delete either the "10" or "00" substring from the string, and after deletion, the remaining string gets concatenated.
Find the length of the shortest string that you can make by performing the above operation any number of times.


Input Format
The first line contains a single integer T - the number of test cases.
The first and only line of each test case contains a non-empty string that contains only '1' and '0'.


Output Format
For each test case, print a single integer - the length of the shortest string that you can make.


Constraints
1 <= T <= 2*10^2
1 <= |S| <= 2*10^5
|S| is the length of the string.


Time Limit
1 second
Example Sample Input 2
111
0101


Sample Output
3
2


Sample test case Explanation
In the first test case, you can't delete anything.
In the second test case delete "10" to get "01" as the shortest string of length 2.

 */