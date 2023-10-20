import java.util.Scanner;

public class FunnyDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = in.nextInt(); // Input number
            int ans = 0; // Initialize the answer to 0
            while(n>9){
                if(criteria(n)){
                    System.out.println(n);
                    break;
                }
                else{
                    n--;
                }
            }
        }


    }
    private static boolean criteria(int n){
        String num = Integer.toString(n);
        for(int i =1;i<num.length();i++){
            if(num.charAt(i)< num.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}
/*
PrepBuddy is now tired of long problem statements of questions so he will provide you a simple question.
You are given a number N, you have to find the largest number less than or equal to N which fulfills the following criteria.
Every digit of the number should be greater than or equal to its preceding digit.


Input Format
The first line contains an integer T where T is the number of test cases For every Test case:
The next line contains one integer N.




Output format
For every test case print the answer in the new line.




Constraints
1 <= T <= 70
1 <= N <=10^5

Time Limit
1 second


Example Sample Input 1
50
Sample Output
49


Sample test case explanation
Digits of 49 are 4 and 9, where 9 is greater than 4.

 */