import java.util.Scanner;

/*
Message Processing
Question Statement:
You are working on a chat application that needs to process user messages. The chat application receives
messages as input, and you need to remove any spaces present in the messages before displaying them on the
screen. The messages can contain multiple words, and there can be multiple spaces present after any word.
Write a Java program that takes a message as input and removes all spaces present in the message, including
any extra spaces that might occur after any word. In case of empty String, it should not return anything.
Input Format:
String S
Output Format:
Updated string
Constraints:
1 <= Length of string S <= 10^6
Example:
Input:
abc def g hi
Output:
Abcdefghi
 */
public class Message_processing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
//        using inbuilt methods

        String ans = message.replaceAll(" ","");
        ans = ans.substring(0,1).toUpperCase() + ans.substring(1);

        System.out.println(ans);
    }


}

/* This below part is from ChatGPt
Regular expressions (regex) are powerful tools for pattern matching in strings. Here's a list of some commonly used and useful regex patterns:

1. **Matching Digits:**
   - `\d`: Matches any digit (equivalent to `[0-9]`).

2. **Matching Non-Digits:**
   - `\D`: Matches any non-digit.

3. **Matching Word Characters:**
   - `\w`: Matches any word character (alphanumeric + underscore).
   - `\W`: Matches any non-word character.

4. **Matching Whitespaces:**
   - `\s`: Matches any whitespace character.
   - `\S`: Matches any non-whitespace character.

5. **Matching Any Character:**
   - `.`: Matches any character except for a newline.

6. **Matching Specific Characters:**
   - `[abc]`: Matches any of the characters 'a', 'b', or 'c'.
   - `[^abc]`: Matches any character except 'a', 'b', or 'c'.
   - `[a-z]`: Matches any lowercase letter.
   - `[A-Z]`: Matches any uppercase letter.
   - `[0-9]`: Matches any digit.

7. **Quantifiers:**
   - `*`: Matches 0 or more occurrences of the preceding character.
   - `+`: Matches 1 or more occurrences of the preceding character.
   - `?`: Matches 0 or 1 occurrence of the preceding character.
   - `{n}`: Matches exactly n occurrences.
   - `{n,}`: Matches n or more occurrences.
   - `{n,m}`: Matches between n and m occurrences.

8. **Anchors:**
   - `^`: Anchors the regex at the start of the string.
   - `$`: Anchors the regex at the end of the string.

9. **Word Boundaries:**
   - `\b`: Matches a word boundary.

10. **Grouping and Capturing:**
    - `()`: Groups expressions and captures matched text.

11. **Escaping Special Characters:**
    - `\`: Escapes a special character, allowing it to be treated as a literal.

12. **Case Insensitive Matching:**
    - `Pattern.CASE_INSENSITIVE` or `(?i)`: Enables case-insensitive matching.

These are just some fundamental regex patterns, and there are many more advanced features and techniques. Regular expressions can vary slightly depending on the programming language or tool you are using, so it's always a good idea to refer to the documentation specific to your context.
 */