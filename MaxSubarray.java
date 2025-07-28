// Find the contiguous subarray of maximum length that gives the maximum sum and print the sum
import java.util.*;
public class MaxSubarray {
    public static int maxSubarray(int arr[]) {
        int maxSum = arr[0];
        int currSum = arr[0];

        for(int i=1; i<arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements");
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Max sum of the subarray is: " + maxSubarray(arr));

    }
}