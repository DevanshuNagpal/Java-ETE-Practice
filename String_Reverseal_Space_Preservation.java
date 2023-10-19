import java.util.Scanner;

public class String_Reverseal_Space_Preservation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        String ans = reverse(text);
        System.out.println(ans);

    }

    private static String reverse(String text) {
//        reverse the string while skipping spaces
        char[] chars = text.toCharArray();
        int left = 0;
        int right = text.length()-1;

        while(left < right){
            if(chars[left] == ' '){
                left++;
            }
            else if(chars[right] == ' '){
                right--;
            }
            else{
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
     }
}
