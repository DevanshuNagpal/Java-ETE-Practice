import java.util.*;

public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        in.close();

        int count = 0;     // Initialize a counter for palindromic binary numbers
        int num = 1;       // Initialize a variable to track numbers

        while(count < A){
            if(isPalindrome(num)){ // Check if the binary representation of 'num' is a palindrome
                count++;  // Increment the count when a palindromic binary number is found
            }
            num++;  // Move to the next number
        }

        System.out.println(num - 1);  // Print the Ath palindrome number
    }

    private static boolean isPalindrome(int num){
        String binary = Integer.toBinaryString(num); // Convert 'num' to binary representation

        int left = 0;
        int right = binary.length() - 1;
        while(left < right){
            if(binary.charAt(left) != binary.charAt(right)){
                return false;  // If characters at 'left' and 'right' positions are different, it's not a palindrome
            }
            left++;
            right--;
        }
        return true;  // If the loop completes without returning false, it's a palindrome
    }
}

/*
You are given an integer A. Your task is to find the Ath number whose binary representation is a palindrome. Consider that the first number with a palindrome binary representation is 1, instead of 0. When counting these numbers, do not consider leading zeros in the binary representation.
Write a Java program to solve this problem and find the Ath binary palindrome number.
Input format:
Input represents the integer value of A that you need to input.
Output format:
Output consists of decimal value of Ath palindromic binary number.


Sample Input 1:
2
Sample Output 1:
3


Sample Input 2:
3
Sample Output 2:
5

 */
