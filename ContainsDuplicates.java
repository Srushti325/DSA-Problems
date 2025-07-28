// Given an integer array nums, return true if any value appears at least twice in the array, 
// and return false if every element is distinct.

import java.util.*;
public class ContainsDuplicates {
    public static boolean containsDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements");
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(containsDuplicates(arr));
    }
}