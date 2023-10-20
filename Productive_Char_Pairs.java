import java.util.*;
/*
. Finding Productive Character Pairs in a String.
A company has to tag it’s products. Each product has an associated product type which is used to tag the products. Product type is a sequence of lower-case letters from the English alphabet. The company wants to have an algorithm for their system which takes the product type and outputs the tag. To generate the tag, pairs of adjacent characters are formed from the start of the product type. From each pair, the lexicographically smallest character will be removed. If a character will be left unpaired then that character will be taken as it is in the tag.

Input Format
The input consists of a string - productType, representing the product type of the product.

Output Format
Print a string representing the tag for the given product. Note The product type consists of lower-case letters from the English alphabet ('a' - 'z'). If both characters in a pair are the same, then any character in the pair can be removed.

Sample input1
electronics
Sample output1
letois
Explanation:
The product type is "electronics". The pairing of characters is done as (el)(ec)(tr)(on)(ic)s. From every pair, the characters removed are: e,c,r,n,c respectively. As the character "s" is left unpaired, it will be kept for the tag as it is. the tag is: letois So, the output is letois
Sample input2
laptop
Sample output2
ltp
 

 */
public class Productive_Char_Pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type = in.nextLine().trim();
        String tag = generatePT(type,0);

        System.out.println(tag);
    }

    private static String generatePT(String type,int i) {
        if(i == type.length()){return "";}
        char ch = type.charAt(i);
        if(i+1<type.length()){
            char sh = type.charAt(i+1);
            if(ch<sh){
                return sh + generatePT(type,i+2);
            }
            else{
                return ch + generatePT(type,i+2);

            }

        }
        else{
            return String.valueOf(ch);
        }
    }
}
