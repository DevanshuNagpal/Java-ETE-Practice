import java.util.Scanner;

public class Len_of_longest_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] arr = str.split(" ");

        int max = findMaxLength(arr);
        System.out.println(max);
    }
    private static int findMaxLength(String[] arr){
        int max = 0;
        for(String word: arr){
            int len= word.length();
            max = Math.max(len,max);
        }
        return max;
    }
}
