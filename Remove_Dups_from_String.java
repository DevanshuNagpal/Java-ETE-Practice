/*
 Removing Duplicate Characters from a String.
Imagine you are developing a text processing tool, and you need to implement a Java program
that removes duplicate characters from a given input string. Write a program that takes user
input for a string and uses recursion to remove duplicate characters.
Input Format
The user should enter a string that they want to process, and the program will remove
consecutive duplicate characters from this input string.
Output Format
The program will print the resulting string after removing consecutive duplicate characters
from the input string.
Sample input1
banana
Sample output1
banana
Sample input2
programming
Sample output2
programing
 */

import java.util.Scanner;
public class Remove_Dups_from_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String res = removeDups(str);
        System.out.println(res);
    }
    private static String removeDups(String str){
        if(str.isEmpty() || str == null){
            return str;
        }
        StringBuilder res = new StringBuilder();
        res.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1)){
                res.append(str.charAt(i));
            }
        }
        return res.toString();

    }
}
