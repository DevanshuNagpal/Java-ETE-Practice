import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursive_Text_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String str = in.nextLine();

        List<Integer> occurences = new ArrayList<>();

        search(text,str,0,occurences);

        if(occurences.isEmpty()){
            System.out.println("-1");
        }
        else{
            System.out.println(occurences);
        }


    }

    private static void search(String text, String target, int position, List<Integer> occurences) {
        int index = text.indexOf(target,position);
        if(index != -1){
            occurences.add(index);
            search(text, target, index+1, occurences);
        }

    }
}
