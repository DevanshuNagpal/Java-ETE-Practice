import java.util.*;

public class ZeroSumSubarrays {
    public static int findAllSubarraysWithGivenSum(int[] arr, int k) {
        // Get the size of the array.
        int n = arr.length;
        // Create a HashMap to store the count of prefix sums.
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        // Initialize prefix sum and count of zero-sum subarrays.
        int preSum = 0;
        int count = 0;

        // Iterate through the array.
        for (int i = 0; i < n; i++) {
            // Calculate the current prefix sum.
            preSum += arr[i];
            // Check if the current prefix sum is equal to the target sum 'k'.
            if (preSum == k) {
                count++;
            }
            // Check if there is a prefix sum (preSum - k) that has been seen before.
            if (prefixSumCount.containsKey(preSum - k)) {
                // Increment the count of zero-sum subarrays by the count of that prefix sum.
                count += prefixSumCount.get(preSum - k);
            }
            // Update the count of the current prefix sum in the HashMap.
            prefixSumCount.put(preSum, prefixSumCount.getOrDefault(preSum, 0) + 1);
        }

        // Return the total count of zero-sum subarrays.
        return count;
    }

    public static void printZeroSumSubarrays(int arr[], int k) {
        // Get the size of the array.
        int n = arr.length;
        // Create a HashMap to store the indices of prefix sums.
        Map<Integer, List<Integer>> prefixSumIndices = new HashMap<>();
        // Initialize prefix sum.
        int preSum = 0;

        // Iterate through the array.
        for (int i = 0; i < n; i++) {
            // Calculate the current prefix sum.
            preSum += arr[i];
            // Check if the current prefix sum is equal to the target sum 'k'.
            if (preSum == k) {
                // Print the subarray from the beginning to the current index.
                printSubarray(arr, 0, i);
            }
            // Check if there are indices of a prefix sum (preSum - k) that have been seen before.
            if (prefixSumIndices.containsKey(preSum - k)) {
                // Get the list of indices for that prefix sum.
                List<Integer> subarrayIndices = prefixSumIndices.get(preSum - k);
                // Print subarrays for each of those indices.
                for (int start : subarrayIndices) {
                    printSubarray(arr, start + 1, i);
                }
            }
            // Update the indices for the current prefix sum in the HashMap.
            if (!prefixSumIndices.containsKey(preSum)) {
                prefixSumIndices.put(preSum, new ArrayList<>());
            }
            prefixSumIndices.get(preSum).add(i);
        }
    }

    public static void printSubarray(int arr[], int start, int end) {
        // Print the subarray elements within the given start and end indices.
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        // Move to the next line to separate subarrays.
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a Scanner for user input.
        Scanner scanner = new Scanner(System.in);
        // Create another Scanner to read the space-separated integer input.
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] arr = new int[input.length];

        // Convert the input string to an array of integers.
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.print("Enter the target sum (k): ");
        int k = scanner.nextInt();

        System.out.println("The number of subarrays is: " + findAllSubarraysWithGivenSum(arr, k));
        System.out.println("The zero-sum subarrays are:");
        printZeroSumSubarrays(arr, k);
    }
}
/*
Identifying Subarrays with Zero-Sum Total.
You are a software developer working on an e-commerce platform. The platform has millions of product listings, each with a corresponding price. Your team has received feedback from users about an issue in the search results: sometimes, the search results contain duplicate products due to the way subarrays are generated.
To resolve this issue, your team has decided to implement a subarray filter that removes duplicate products with the same total price. For this task, you need to write a Java program that finds all subarrays with a zero-sum total, which corresponds to duplicate products.
Your task is to write a Java program to identify and print all the subarrays with a zero-sum total in a given integer array.


Input Format
input format for the given Java code is a space-separated list of integers
Output Format
If there are subarrays with a zero-sum, it will print each subarray on a new line. Each subarray will be represented by the elements separated by a space.
If there are no subarrays with a zero-sum, it will print "-1" to indicate that no such subarrays exist in the input array.


Sample Input 1:
3 4 -7 3 1 3 1 -4 -2 -2
Sample Output 1:
3 4 -7
3 4 -7 3 1 3 1 -4 -2 -2
4 -7 3
-7 3 1 3
3 1 3 1 -4 -2 -2
3 1 -4

 */