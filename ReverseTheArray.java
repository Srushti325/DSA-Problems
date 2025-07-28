import java.util.*;
public class ReverseTheArray {
    public static void reverseTheArray(int arr[]) {
        int i = 0; //start
        int j = arr.length-1;  //end

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("The reversed array is: ");
        for(int k=0; k<arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        reverseTheArray(arr);
    }
}
