    import java.util.ArrayList;

    public class SubsequencesString {

        public static void main(String[] args) {
        subseq("", "abc");
            System.out.println(sub("", "abc"));
        }
        private static void subseq(String seq,String str){
            if(str.isEmpty()){
                System.out.println(seq);
                return;
            }
            char ch = str.charAt(0);
//            Pick and unpick approach
            subseq(seq,str.substring(1));
            subseq(seq + ch,str.substring(1));
        }
        private static ArrayList<String > sub(String p,String up){
            if(up.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            char ch = up.charAt(0);
            ArrayList<String> left = sub(p+ch,up.substring(1));
            ArrayList<String> right = sub(p,up.substring(1));

            left.addAll(right);
            return left;
        }


    }

/*
In your Java programming task, you're tackling a challenge related to string manipulation. Your goal is to analyze a given string and generate a list of all possible subsequences from it. A subsequence, in this context, refers to a string that can be formed by removing certain characters from the original string while preserving their relative order. Your task involves designing a function that efficiently generates and collects these subsequences for further processing. Write a java program for the same
Input format
Input consists of a string without any spaces.
Output Format
Output will display the subsequences.
Sample Input1:
abc
Sample Output 1:


a
b
a b
c
a c
b c
a b c

 */