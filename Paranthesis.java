import java.util.*;

public class Paranthesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        boolean ans = valid(input);
        System.out.println(ans);
    }

    private static boolean valid(String input) {

        Stack<Character> st = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // If an opening parenthesis is encountered, push it onto the stack.
                st.push(c);
            }
            else if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                // If a closing parenthesis is encountered and the stack is not empty and the
                // top of the stack contains a corresponding opening parenthesis, pop it.
                st.pop();
            }
            else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            }
            else if (c == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            }
            else if (c == ')' || c == '}' || c == ']') {
                // If there is a closing parenthesis with no corresponding opening parenthesis,
                // return false, as the parentheses are not balanced.
                return false;
            }
        }
        // If the stack is empty at the end, it means all opening parentheses have corresponding
        // closing parentheses, and the string is balanced.
        return st.isEmpty();
    }
}

/*
parenthesis

Samantha is working on a code editor that needs to ensure that every opening parenthesis in a line of code has a corresponding closing parenthesis. She needs to check if the input string contains valid pairs of parentheses.
Example:
s = "while (i < n) { sum += i; i++; }"
Samantha's program will scan through each character in the input string s and check if there are matching opening and closing parentheses. In this case, the string contains multiple pairs of parentheses that are balanced, so her program will return True.
Another example:
s = "if (x > 0 { y = 2x; }"
In this case, there is a missing closing parenthesis after "x > 0". Samantha's program will return False,
since the input string s is not valid.
Input First line contains the string

 */