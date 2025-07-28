// Find minimum and maximum elelemt in an array
import java.util.*;
public class MinMaxInArray {
    // Max element of the array
    public static int max(int arr []) {
        int max = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Min element of the array
    public static int min(int arr []) {
        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    // Both together
    public static void minMax(int arr []) {
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Max element is: "+max);
        System.out.println("Min element is: "+min);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr [] = new int [n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter element number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        // System.out.println();
        // System.out.println("Maximum element in the array is: " + max(arr));
        // System.out.println("Minimum element in the array is: " + min(arr));

        minMax(arr);


    }
}
