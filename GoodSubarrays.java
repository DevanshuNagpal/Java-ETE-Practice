import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GoodSubarrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int count = countGoodSubarrays(arr, s);
        System.out.println(count);



    }

    private static int countGoodSubarrays(int[] arr, int s) {
        int n = arr.length;
        int count = 0;
        for(int start = 0; start<n;start++){
            HashSet<Integer> distinctIntegers = new HashSet<>();
            for (int end = start; end < n; end++) {
                distinctIntegers.add(arr[end]);
                if(distinctIntegers.size() == s){
                    count++;
                    printSubarray(arr,start,end);
                }

            }
        }


        return count;
    }

    private static void printSubarray(int[] arr, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

//    private static ArrayList<ArrayList<Integer>> findGoodSubarrays(int[] arr, int s) {
//        int n = arr.length;
//        ArrayList<ArrayList<Integer>> goodSubarrays = new ArrayList<>();
//        Set<Integer> distinctElements = new HashSet<>();
//        int left = 0;
//
//        for (int right = 0; right < n; right++) {
//            distinctElements.add(arr[right]);
//            if (distinctElements.size() == s) {
//                ArrayList<Integer> subarray = new ArrayList<>();
//                for (int i = left; i <= right; i++) {
//                    subarray.add(arr[i]);
//                }
//                goodSubarrays.add(subarray);
//
//                while (distinctElements.size() == s) {
//                    distinctElements.remove(arr[left]);
//                    left++;
//                }
//            }
//        }
//        return goodSubarrays;
//    }
}


/*
Good subarray
Question Statement:
given an array ‘arr’ consisting of ‘N’ elements, and an integer ‘s’. A non-empty subarray of ‘arr’ is good if it contains exactly ‘s’ distinct integers. Your task is to return the number of good subarrays in the given array.
Input Format:
The first line contains the size of the array.
Second line of the input contains the integer ‘s’ denoting the number of distinct integers in the subarray. Third line contains the array elements.
Output Format:
output prints the integer denoting the number of good subarrays in the given array.
Example:
Input:
5
2
1 2 1 2 3
Output: 7
Explanation:
all the good subarrays is the above given array are : [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]

Input:
5
3
1 2 1 2 3
Output: 3
Explanation:
all the good subarrays is the above given array are : [1,2,3], [2,1,2,3], [1,2,1,2,3]

 */