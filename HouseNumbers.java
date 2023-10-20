import java.util.*;

public class HouseNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        in.close();

        for(int i = 0 , num = 1;i<N ;num++)
        {
            int equation = (3*num)+2;
            if(equation%M!=0){
                System.out.println((3*num)+2);
                i++;
            }
        }
    }

}

/*
Madhav is a goverment employee and he is given a task that he need to visit N houses in the area. But he is confused that he has to visit which houses.
He is weak in math but his boss is super expert in Maths. He told madhav to visit houses whose house number satisfy the equation (3k+2) and also give one more hurdle that that number also must not divisible by M.write thecode to print those house numbers which he should visit


Take the following as input.


A number (N) A number (M)

Constraints
0 < N1 < 100 0 < N2 < 100


Sample Input 10
4
sample output:
5
11
14
17
23
26
29
35
38
41


Explanation
The output will've N terms which are not divisible by M.


 */