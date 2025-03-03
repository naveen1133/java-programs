import java.util.*;

class Main {

    // Function to calculate the length of Longest Increasing Subsequence (LIS)
    public static int ArrayChallenge(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        Arrays.fill(lis, 1); // Initialize LIS values for all indices as 1

        // Compute LIS values in a bottom-up manner
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        // Find the maximum value in lis[] array
        int maxLIS = 0;
        for (int i = 0; i < n; i++) {
            maxLIS = Math.max(maxLIS, lis[i]);
        }

        return maxLIS;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the numbers separated by commas (e.g., 9, 9, 4, 2):");

        // Accept input as a string of numbers separated by commas
        String input = s.nextLine();

        // Split the input string into individual number strings, then convert them to integers
        String[] inputArr = input.split(",");
        int[] arr = new int[inputArr.length];
        
        // Convert each string element to an integer
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i].trim());  // Trim spaces and parse to int
        }

        // Output the result: Longest Increasing Subsequence length
        System.out.println("Length of Longest Increasing Subsequence: " + ArrayChallenge(arr));
    }
}
